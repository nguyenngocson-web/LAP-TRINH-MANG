package test;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class AppServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			// Mở cổng và bắt đầu nghe
			ServerSocket socketServer = new ServerSocket(8888);
			System.out.println("I'm listening on 8888 port ...");
			while (true)
			{	//Khi có 1 yêu cầu tới thì accept
				//Mở một socket để làm việc với client đó
				
				Socket socketClient = socketServer.accept();
				// Gửi câu trả lời xin chào
					//Lấy về luồng xuất
					OutputStream ostoClient = socketClient.getOutputStream();
					//Để gửi chuỗi cho tiện
					OutputStreamWriter write2Client = new OutputStreamWriter(ostoClient);
					BufferedWriter buffW = new BufferedWriter(write2Client);
					//Gửi
					buffW.write("Xin chao \n");
					buffW.flush();
					//Đóng Socket
					socketClient.close();
				}
			
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
