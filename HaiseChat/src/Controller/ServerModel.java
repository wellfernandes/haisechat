package Controller;

import java.net.ServerSocket;
import java.net.Socket;
/**
 * 
 * @author wellitonfernandes
 * Git: wellfernandes
 * 
 * Server configuration Class
 */
public class ServerModel {

	private ServerSocket severSocket;
	private Socket clientSocket;
	private ConnectionController connection;
	
	public ServerModel(){
		//Create the socket, sending the port for connection.
		try{
			severSocket = new ServerSocket(5152);
			System.out.println("Server started");
		}
		catch(java.io.IOException e){
			System.exit(1);
		}
		try{
			while(true){
				clientSocket = severSocket.accept();
				//Create the socket, sending the port for connection.
				connection = new ConnectionController(clientSocket);
				connection.start();
			}
		}
		catch(java.io.IOException e){
			System.out.println(e);
			System.exit(1);
		}
	}
}
