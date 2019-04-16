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

public class ServerScreen {

	private JFrame serverScreen;
	private JTextField txtServerIP01;

	/**
	 * Launch the application HaiseChat
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ServerScreen window = new ServerScreen();
					window.serverScreen.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Initialize the serverScreen view.
	 */
	public ServerScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame serverScreen
	 */
	private void initialize() {
		serverScreen = new JFrame();
		serverScreen.setBounds(100, 100, 577, 346);
		serverScreen.setLocationRelativeTo(null);
		serverScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		serverScreen.getContentPane().setLayout(null);
		
		JLabel lblHaisechatOpen = new JLabel("");
		lblHaisechatOpen.setIcon(new ImageIcon(ServerScreen.class.getResource("/Images/haisechat.png")));
		lblHaisechatOpen.setBounds(154, 23, 300, 190);
		serverScreen.getContentPane().add(lblHaisechatOpen);
		
		JButton btnConnet = new JButton("Run Server");
		btnConnet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnConnet.setBounds(259, 251, 103, 29);
		serverScreen.getContentPane().add(btnConnet);
		
		JLabel lblServerIp = new JLabel("Server IP :");
		lblServerIp.setBounds(177, 229, 61, 16);
		serverScreen.getContentPane().add(lblServerIp);
		
		txtServerIP01 = new JTextField();
		txtServerIP01.setBounds(237, 223, 148, 28);
		serverScreen.getContentPane().add(txtServerIP01);
		txtServerIP01.setColumns(10);
		
		JLabel lblStatusConnection = new JLabel("OFF");
		lblStatusConnection.setBounds(397, 229, 103, 16);
		serverScreen.getContentPane().add(lblStatusConnection);
		
		JLabel lblVersion = new JLabel("version 1.0");
		lblVersion.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		lblVersion.setBounds(510, 6, 61, 16);
		serverScreen.getContentPane().add(lblVersion);
		
		//show the frame serverScreen
		serverScreen.setVisible(true);
	}
}
