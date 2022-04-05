package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LuongLamViec extends Thread {	
    Socket socketClient;
    int id = -1;
   
		    
		public LuongLamViec(Socket socketClient, int id){
		        super();
		        this.socketClient = socketClient;
		        this.id = id;
		    }
		    @Override
		    public void run(){
		        try {
		            System.out.println(socketClient.getInetAddress().getHostAddress());
		            System.out.println(id);
		        
		            // lấy về luồng xuất nhập
		            OutputStream osToClient = socketClient.getOutputStream();
		            OutputStreamWriter write2Client = new OutputStreamWriter(osToClient);
		            BufferedWriter buffWrite  = new BufferedWriter(write2Client);

		            InputStream in = socketClient.getInputStream();
		            InputStreamReader inReader = new InputStreamReader(in);
		            BufferedReader buffRead = new BufferedReader(inReader);
		            ///
		            while (true)
		                    {
		            	{
	                        String chuoiNhan = buffRead.readLine();
	                        System.out.println("Client: "+chuoiNhan);
	                        String KQ = "";
	                        switch (chuoiNhan) {
	                                            case "0" : KQ = "Zero";
	                                            case "1" : KQ = "One";
	                                            case "2" : KQ = "Two";
	                                            case "3" : KQ = "Three";
	                                            case "4" : KQ = "Four";
	                                            case "5" : KQ = "Five";
	                                            case "6" : KQ = "Six";
	                                            case "7" : KQ = "Seven";
	                                            case "8" : KQ = "Eight";
	                                            case "9" : KQ = "Nine";
	                                            }
	                        
	                        	System.out.println("Server: "+KQ);
	                        	buffWrite.write(KQ+"\n");
	                        	buffWrite.flush();
	                        	
	                        	
	                        if (KQ.equals("10")) break;
	            }
		            }
		            socketClient.close();
		        } catch (IOException ex) {
		            Logger.getLogger(Mutil_server.class.getName()).log(Level.SEVERE, null, ex);
		        }
	}

}
