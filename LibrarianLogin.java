package Attendance2;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Color;

public class LibrarianLogin {

	JFrame Librarianframe;
	private JTextField liblarianusernametextField;
	private  JPasswordField librarianpasswordField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibrarianLogin window = new LibrarianLogin();
					window.Librarianframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LibrarianLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		// Create a new JFrame object for the librarian login interface
		Librarianframe = new JFrame();
		Librarianframe.getContentPane().setBackground(new Color(0, 128, 255));
		Librarianframe.setBounds(100, 100, 771, 435);
		Librarianframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Librarianframe.getContentPane().setLayout(null);

		// Create a JLabel for the title of the librarian login interface
		JLabel Librariantitle = new JLabel("LIBRARIAN LOGIN");
		Librariantitle.setFont(new Font("Times New Roman", Font.BOLD, 25));
		Librariantitle.setBounds(244, 29, 247, 72);
		// Add the title label to the content pane of the frame
		Librarianframe.getContentPane().add(Librariantitle);
		// Create a JLabel for the username field
		JLabel usernamelibrarianlbl = new JLabel("Username:");
		usernamelibrarianlbl.setFont(new Font("Times New Roman", Font.BOLD, 20));
		usernamelibrarianlbl.setBounds(133, 127, 109, 30);
		// Add the username label to the content pane of the frame
		Librarianframe.getContentPane().add(usernamelibrarianlbl);

		// Create a JLabel for the password field
		JLabel passllbllabrarian = new JLabel("Password:");

		// Set the font and position of the password label
		passllbllabrarian.setFont(new Font("Times New Roman", Font.BOLD, 20));
		passllbllabrarian.setBounds(133, 168, 109, 30);

		// Add the password label to the content pane of the frame
		Librarianframe.getContentPane().add(passllbllabrarian);
		// Create a JTextField for the username input
		JTextField liblarianusernametextField = new JTextField();
		liblarianusernametextField.setBounds(254, 122, 237, 37);
		Librarianframe.getContentPane().add(liblarianusernametextField);
		liblarianusernametextField.setColumns(10);

		// Create a JPasswordField for the password input
		librarianpasswordField = new JPasswordField();

		librarianpasswordField.setBounds(254, 167, 237, 37);

		// Add the password field to the content pane of the frame
		Librarianframe.getContentPane().add(librarianpasswordField);
		// create a new button called loginliblarianbutton with the label "Login"
		JButton loginliblarianbutton = new JButton("Login");

		// add an action listener to the login button
		loginliblarianbutton.addActionListener(new ActionListener() {
		// override the actionPerformed method to handle the login button being clicked
		public void actionPerformed(ActionEvent e) {
		// get the username and password input from the text fields
		String username = liblarianusernametextField.getText();
		String password = new String(librarianpasswordField.getPassword());

		 // check if the entered username and password match any of the valid combinations
	    if (username.equals("Librarian_01") && password.equals("LibOne")
	        || username.equals("Librarian_02") && password.equals("LibTwo")
	        || username.equals("Librarian_03") && password.equals("Libhree")) {
	        // if a valid combination is entered, show a success message and open the library system window
	        JOptionPane.showMessageDialog(null, "SUCCESSFULY LOGIN!");
	        NU_LibrarySystem window = new NU_LibrarySystem();
	        window.LSframe.setVisible(true);
	        Librarianframe.dispose();
	    } else if (username.equals("") || password.equals("")) {
	        // if either field is left blank, show an error message
	        JOptionPane.showMessageDialog(null, "Please enter username and password", "Login Failed",
	                JOptionPane.ERROR_MESSAGE);
	    } else if (username.equals("Librarian")) {
	        // if only the username is incorrect, show an error message
	        JOptionPane.showMessageDialog(null, "INCORRECT PASSWORD","Login Failed", JOptionPane.ERROR_MESSAGE);
	    } else if (password.startsWith("Lib")) {
	        // if only the password is incorrect, show an error message
	        JOptionPane.showMessageDialog(null, "INCORRECT USERRNAME","Login Failed", JOptionPane.ERROR_MESSAGE);
	    } else {
	        // if both fields are incorrect, show an error message
	        JOptionPane.showMessageDialog(null, "INCORRECT PASSWORD AND PASSWORD", "Login Failed", JOptionPane.ERROR_MESSAGE);
	    }
	}

		});
		// set the font and position of the login button
		loginliblarianbutton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		loginliblarianbutton.setBounds(401, 229, 109, 37);

		// add the login button to the librarian login window
		Librarianframe.getContentPane().add(loginliblarianbutton);
	}
}



