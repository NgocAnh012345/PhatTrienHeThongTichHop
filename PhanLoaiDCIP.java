package lab3;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class PhanLoaiDCIP {
	public static void main(String[] args) {
		try {
			if (args.length != 1) {
				System.out.println("Cach su dung: java TimDCIP <Hostname>");
			}
			InetAddress host = InetAddress.getByName("google.com");
			String hostName = host.getHostName();
			System.out.println("Host name:" + hostName);
			System.out.println("Dia chi IP:" + host.getHostAddress());
			byte[] b = host.getAddress();
			int i = b[0] >= 0 ? b[0] : 256 + b[0];
			System.out.println("i la: " + i);
			System.out.println("host la: " + host);
			if ((i >= 1) & (i <= 126))
				System.out.println(host + " thuoc dia chi lop A");
			if ((i >= 127) & (i <= 191))
				System.out.println(host + " thuoc dia chi lop B");
			if ((i >= 192) & (i <= 223))
				System.out.println(host + " thuoc dia chi lop C");
		} catch (UnknownHostException e) {
			System.out.println("Khong tim thay dia chi");
			return;
		}
	}
}
