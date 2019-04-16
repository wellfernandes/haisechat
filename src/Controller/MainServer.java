package Controller;

import View.ServerScreen;

/**
 * 
 * @author wellitonfernandes
 * Git: wellfernandes
 *
 * Main Class - Initialize the server services
 */
public class MainServer {
	//Initialize the Server for connection of clients
	public static void main(String[] args) {
		new ServerModel();
		new ServerScreen();
	}
}
