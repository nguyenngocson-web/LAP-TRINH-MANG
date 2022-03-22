package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.nio.Buffer;

public class AppClient {

	public static void main(String[] args) {
		// Tạo một kết nối Socket đến Sever
		try{
			Socket soc = new Socket("localhost",8888);
			System.out.print(" connect \n ");
			//Lấy luồng nhập
			InputStream in = soc.getInputStream();
			InputStreamReader inReader = new InputStreamReader(in);
			BufferedReader buff = new BufferedReader(inReader);
			//Đọc trả lời và in ra
			System.out.print(buff.readLine());
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
