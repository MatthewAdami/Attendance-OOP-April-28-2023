package Attendance2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminLogin {

	JFrame Adminloginframe;
	private JTextField adminusernametextField;
	private JPasswordField adminpasswordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogin window = new AdminLogin();
					window.Adminloginframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AdminLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		// Create a new JFrame for the admin login window
		Adminloginframe = new JFrame();
		Adminloginframe.setBounds(100, 100, 771, 435);
		Adminloginframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Adminloginframe.getContentPane().setLayout(null);
		JLabel admintitle = new JLabel("ADMIN LOGIN");
		admintitle.setFont(new Font("Times New Roman", Font.BOLD, 25));
		admintitle.setBounds(263, 39, 191, 72);
		Adminloginframe.getContentPane().add(admintitle);
		
		JLabel usernameadminlbll = new JLabel("Username:");
		usernameadminlbll.setFont(new Font("Times New Roman", Font.BOLD, 20));
		usernameadminlbll.setBounds(133, 127, 109, 30);
		
		Adminloginframe.getContentPane().add(usernameadminlbll);
		JLabel passllbladmin = new JLabel("Password:");
		passllbladmin.setFont(new Font("Times New Roman", Font.BOLD, 20));
		passllbladmin.setBounds(133, 168, 109, 30);
		Adminloginframe.getContentPane().add(passllbladmin);

		// Create a JTextField for the username input
		adminusernametextField = new JTextField();
		adminusernametextField.setBounds(254, 122, 237, 37);
		Adminloginframe.getContentPane().add(adminusernametextField);
		adminusernametextField.setColumns(10);

		// Create a JPasswordField for the password input
		adminpasswordField = new JPasswordField();
		adminpasswordField.setBounds(254, 167, 237, 37);

		// Add the JPasswordField to the content pane of the JFrame
		Adminloginframe.getContentPane().add(adminpasswordField);

		// Creating a "Login" button for the admin login frame
		JButton loginadminbutton = new JButton("Login");

		// Adding an action listener to the "Login" button
		loginadminbutton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		// Retrieving the text entered in the username and password fields
		String username = adminusernametextField.getText();
		String password = new String(adminpasswordField.getPassword());
		// Checking if the entered username and password match the predefined values
		if (username.equals("Admin_01") && password.equals("AdminOne")
				|| username.equals("Admin_02") && password.equals("AdminTwo")
				|| username.equals("Admin_03") && password.equals("AdminThree")) {
			// Displaying a success message if the login is successful
			JOptionPane.showMessageDialog(null, "SUCCESSFULY LOGIN!");

			// Disposing of the admin login frame and opening the library welcome frame
			Adminloginframe.dispose();
			LibraryWelcome window = new LibraryWelcome();
			window.LWframe.setVisible(true);
					
		} else if (username.equals("") || password.equals("")) {
			// Displaying an error message if the username and/or password fields are empty
			JOptionPane.showMessageDialog(null, "Please enter username and password", "Login Failed",
					JOptionPane.ERROR_MESSAGE);
		} else if (username.startsWith("Admin")) {
			// Displaying an error message if the username is incorrect
			JOptionPane.showMessageDialog(null, "INCORRECT PASSWORD", "Login Failed",
					JOptionPane.ERROR_MESSAGE);
		} else if (password.startsWith("Admin")) {
			// Displaying an error message if the password is incorrect
			JOptionPane.showMessageDialog(null, "INCORRECT USERNAME", "Login Failed",
					JOptionPane.ERROR_MESSAGE);
		} else {
			// Displaying an error message if both the username and password are incorrect
			JOptionPane.showMessageDialog(null, "INCORRECT USERNAME AND PASSWORD", "Login Failed",
					JOptionPane.ERROR_MESSAGE);
		}

	}

		});
		loginadminbutton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		loginadminbutton.setBounds(401, 229, 109, 37);
		Adminloginframe.getContentPane().add(loginadminbutton);
	}
}
