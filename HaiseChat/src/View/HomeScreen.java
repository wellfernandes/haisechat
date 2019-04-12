package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Font;

public class HomeScreen {

	private JFrame homeScreen;
	private JTextField txtServerIP01;

	/**
	 * Launch the application HaiseChat
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
	 * Initialize the HomeScreen view.
	 */
	public HomeScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame HomeScreen
	 */
	private void initialize() {
		homeScreen = new JFrame();
		homeScreen.setBounds(100, 100, 577, 346);
		homeScreen.setLocationRelativeTo(null);
		homeScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		homeScreen.getContentPane().setLayout(null);
		
		JLabel lblHaisechatOpen = new JLabel("");
		lblHaisechatOpen.setIcon(new ImageIcon(HomeScreen.class.getResource("/Images/haisechat.png")));
		lblHaisechatOpen.setBounds(154, 23, 300, 190);
		homeScreen.getContentPane().add(lblHaisechatOpen);
		
		JButton btnConnet = new JButton("Run Server");
		btnConnet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnConnet.setBounds(259, 251, 103, 29);
		homeScreen.getContentPane().add(btnConnet);
		
		JLabel lblServerIp = new JLabel("Server IP :");
		lblServerIp.setBounds(177, 229, 61, 16);
		homeScreen.getContentPane().add(lblServerIp);
		
		txtServerIP01 = new JTextField();
		txtServerIP01.setBounds(237, 223, 148, 28);
		homeScreen.getContentPane().add(txtServerIP01);
		txtServerIP01.setColumns(10);
		
		JLabel lblStatusConnection = new JLabel("OFF");
		lblStatusConnection.setBounds(397, 229, 103, 16);
		homeScreen.getContentPane().add(lblStatusConnection);
		
		JLabel lblVersion = new JLabel("version 1.0");
		lblVersion.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		lblVersion.setBounds(510, 6, 61, 16);
		homeScreen.getContentPane().add(lblVersion);
		
		//show the frame homeScreen
		homeScreen.setVisible(true);
	}
}
