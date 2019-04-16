package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Date;
/**
 * 
 * @author wellitonfernandes
 * Git:wellfernandes
 * 
 * Controller Connection Socket
 * 
 */
public class ConnectionController extends Thread{

	private Socket outData;
	
	public ConnectionController(Socket socket){
		outData = socket;
	}
	
	public void run(){
		try{
			PrintWriter pout = new PrintWriter(outData.getOutputStream(),true);
			pout.println("Time: " + new Date().toString());
			
			//Close Connection
			outData.close();
		}
		catch(IOException e){
			System.out.println(e);
		}
	}
}
