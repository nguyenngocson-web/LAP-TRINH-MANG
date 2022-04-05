package test;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class CTChinh {

			public static void main(String[] args) throws IOException { 
				// Mở cổng và bắt đầu nghe 
				ServerSocket socketServer = new ServerSocket(9999); 
				System.out.println("I'm listening on 9999 port...."); 
				// 
				int id=0; 
				while (true) { 
					Socket s =socketServer.accept (); 
					id ++; 
					//new LuongLamViec (s, id++).start(); 
					Mutil_server docsoTask = new Mutil_server(s,id); 
					docsoTask.start();
				}
			}
	}

