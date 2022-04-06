import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.nio.channels.SocketChannel;
import java.util.logging.Level;
import java.util.logging.Logger;



public class server extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Socket socketClient;
		    int id = -1;
				    
		public server (Socket socketClient, int id){
				        super();
				        this.socketClient = socketClient;
				        this.id = id;
				    }
		void GuiFile(String tenFile ) throws IOException{
					//Lấy về nhập từ file
					FileReader fr = new FileReader(tenFile);
					//Lấy về luông xuất
					OutputStream osToClient = socketClient.getOutputStream();
		            OutputStreamWriter write2Client = new OutputStreamWriter(osToClient);
		            BufferedWriter buffWrite  = new BufferedWriter(write2Client);
		            InputStream in = socketClient.getInputStream();
		            InputStreamReader inReader = new InputStreamReader(in);
		            BufferedReader buffRead = new BufferedReader(inReader);
		            //Dọc từng dòng
		            String line;
		            while ((line = buffRead.readLine()) != null)
		            {
		            	buffWrite.write(line);
		            	buffWrite.flush();
		            }
		            fr.close();
				    try {
				            System.out.println(socketClient.getInetAddress().getHostAddress());
				            System.out.println(id);
				            ///
				            while (true)
				                    {
				            	{
			                        String chuoiNhan = buffRead.readLine();
			                        System.out.println("Client: "+chuoiNhan);
			                        String KQ = "";
			                        switch (chuoiNhan) {
			                                            
			                                            case "1" : KQ = "1.txt";
			                                            case "2" : KQ = "2.txt";
			                                            case "3" : KQ = "3.txt";
			                                            case "4" : KQ = "4.txt";
			                                            case "5" : KQ = "5.txt";
			                                            case "6" : KQ = "6.txt";
			                                            case "7" : KQ = "7.txt";
			                                            case "8" : KQ = "8.txt";
			                                            case "9" : KQ = "9.txt";
			                                            case "10" : KQ ="10.txt";
			                                            }
			                        
			                        	System.out.println("Server: "+KQ);
			                        	buffWrite.write(KQ+"\n");
			                        	buffWrite.flush();
			                        	
			                        if (KQ.equals("0")) break;
			            }
				            }
				            socketClient.close();
				        } catch (IOException ex) {
				            Logger.getLogger(Mutil_server.class.getName()).log(Level.SEVERE, null, ex);
				        }
		}

	}

}
