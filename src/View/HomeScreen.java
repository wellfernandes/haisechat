package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class HomeScreen {

	private JFrame homeScreen;

	/**
	 * Launch the HomeScreen View
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeScreen window = new HomeScreen();
					window.homeScreen.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HomeScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		homeScreen = new JFrame();
		homeScreen.setBounds(100, 100, 600, 450);
		homeScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		homeScreen.setLocationRelativeTo(null);
		homeScreen.getContentPane().setLayout(null);
		
		JPanel panelHomeScreen = new JPanel();
		panelHomeScreen.setBounds(6, 6, 588, 416);
		homeScreen.getContentPane().add(panelHomeScreen);
		panelHomeScreen.setLayout(null);
		
		JButton btnChatServer = new JButton("Chat Server");
		btnChatServer.setBounds(367, 93, 117, 29);
		panelHomeScreen.add(btnChatServer);
		
		JButton btnChatClient = new JButton("Chat Client");
		btnChatClient.setBounds(367, 319, 117, 29);
		panelHomeScreen.add(btnChatClient);
		
		JLabel lblYouCanTo = new JLabel("You can be a chat server.");
		lblYouCanTo.setBounds(206, 178, 163, 16);
		panelHomeScreen.add(lblYouCanTo);
		
		JLabel lblYouCanBe = new JLabel("You can be a chat client.");
		lblYouCanBe.setBounds(206, 360, 163, 16);
		panelHomeScreen.add(lblYouCanBe);
		
		JLabel lblImageServer = new JLabel("");
		lblImageServer.setIcon(new ImageIcon(HomeScreen.class.getResource("/Images/server-chat.png")));
		lblImageServer.setBounds(175, 6, 200, 200);
		panelHomeScreen.add(lblImageServer);
		
		JLabel lblImageClient = new JLabel("");
		lblImageClient.setIcon(new ImageIcon(HomeScreen.class.getResource("/Images/client-schat.png")));
		lblImageClient.setBounds(234, 265, 100, 100);
		panelHomeScreen.add(lblImageClient);
		
		//Show the HomeScreen View
		homeScreen.setVisible(true);
	}
}
