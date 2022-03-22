package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class AppEchoClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Tạo một kết nối Socket đến Sever
				Socket soc;
				try{
					 soc = new Socket("localhost",9999);
					System.out.print(" connect \n ");
					//Lấy luồng nhập
					InputStream in = soc.getInputStream();
					InputStreamReader inReader = new InputStreamReader(in);
					BufferedReader buffRead = new BufferedReader(inReader);
					
					OutputStream osToClient = soc.getOutputStream();
					OutputStreamWriter write2Client = new OutputStreamWriter(osToClient);
					BufferedWriter buffWrite = new BufferedWriter(write2Client);
					//Đọc trả lời và in ra
					Scanner banPhim = new Scanner(System.in);
					while(true)
					{
						System.out.print("\nClient:");
						String chuoiGui = banPhim.nextLine();
						//Gui di , neu chuoi khoong phai la byte
						buffWrite.write(chuoiGui+"\n");
						buffWrite.flush();
						//
						// Nhận về
						String chuoiNhan = buffRead.readLine();
							//In ra màn hình client để xem
						System.out.print("Server:"+ chuoiNhan);
						
						if (chuoiGui.equals("Bye")) break;
					}
					soc.close();
				}catch (IOException e) {
					e.printStackTrace();
		}
	}

}
