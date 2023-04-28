package Attendance2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class LibraryWelcome {

	public JFrame LWframe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibraryWelcome window = new LibraryWelcome();
					window.LWframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LibraryWelcome() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		LWframe = new JFrame();
		LWframe.getContentPane().setBackground(new Color(0, 128, 255));
		LWframe.setBounds(100, 100, 534, 363);
		LWframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		LWframe.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to NU Library System");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(110, 116, 326, 54);
		LWframe.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Exit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LibraryManagement window = new LibraryManagement();
				window.LMframe.setVisible(true);
				LWframe.dispose();
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.setBounds(22, 11, 100, 36);
		LWframe.getContentPane().add(btnNewButton);
	}
}
