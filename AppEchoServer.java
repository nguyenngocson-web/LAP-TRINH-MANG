package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;

public class AppEchoServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			// Mở cổng và bắt đầu nghe
			ServerSocket socketServer = new ServerSocket(9999);
			System.out.println("I'm listening on 9999 port ...");
			while (true)
			{	//Khi có 1 yêu cầu tới thì accept
				//Mở một socket để làm việc với client đó
				
				Socket socketClient = socketServer.accept();
				// Gửi câu trả lời xin chào
					//Lấy về luồng xuất,nhập
					OutputStream ostoClient = socketClient.getOutputStream();
					//Để gửi chuỗi cho tiện
					OutputStreamWriter write2Client = new OutputStreamWriter(ostoClient);
					BufferedWriter buffW = new BufferedWriter(write2Client);
					
					InputStream in = socketClient.getInputStream();
					InputStreamReader inReader = new InputStreamReader(in);
					BufferedReader buffRead = new BufferedReader(inReader);
					
					while (true){
						//Nhận dữ liệu
						String chuoiNhan = buffRead.readLine();
						//In ra nếu muốn4
						//Gửi trả
						String chuoiGui = chuoiNhan;
						buffW.write(chuoiGui+"\n");
						buffW.flush();
						if (chuoiGui.equals("Bye")) break;
					}
					//Đóng Socket
					socketClient.close();
				}
			
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
