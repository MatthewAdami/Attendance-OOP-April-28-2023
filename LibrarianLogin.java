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

public class LibrarianLogin {

	JFrame Librarianframe;
	private JTextField liblarianusernametextField;
	private JPasswordField librarianpasswordField;
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
		Librarianframe = new JFrame();
		Librarianframe.setBounds(100, 100, 771, 435);
		Librarianframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Librarianframe.getContentPane().setLayout(null);

		JLabel Librariantitle = new JLabel("LIBRARIAN LOGIN");
		Librariantitle.setFont(new Font("Times New Roman", Font.BOLD, 25));
		Librariantitle.setBounds(244, 29, 247, 72);
		Librarianframe.getContentPane().add(Librariantitle);

		JLabel usernamelibrarianlbl = new JLabel("Username:");
		usernamelibrarianlbl.setFont(new Font("Times New Roman", Font.BOLD, 20));
		usernamelibrarianlbl.setBounds(133, 127, 109, 30);
		Librarianframe.getContentPane().add(usernamelibrarianlbl);

		JLabel passllbllabrarian = new JLabel("Password:");
		passllbllabrarian.setFont(new Font("Times New Roman", Font.BOLD, 20));
		passllbllabrarian.setBounds(133, 168, 109, 30);
		Librarianframe.getContentPane().add(passllbllabrarian);

		JTextField liblarianusernametextField = new JTextField();
		liblarianusernametextField.setBounds(254, 122, 237, 37);
		Librarianframe.getContentPane().add(liblarianusernametextField);
		liblarianusernametextField.setColumns(10);

		librarianpasswordField = new JPasswordField();
		librarianpasswordField.setBounds(254, 167, 237, 37);
		Librarianframe.getContentPane().add(librarianpasswordField);

		JButton loginliblarianbutton = new JButton("Login");
		loginliblarianbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = liblarianusernametextField.getText();
				String password = new String(librarianpasswordField.getPassword());

				if (username.equals("Librarian_01") && password.equals("LibOne")
						|| username.equals("Librarian_02") && password.equals("LibTwo")
						|| username.equals("Librarian_03") && password.equals("Libhree")) {
					JOptionPane.showMessageDialog(null, "SUCCESSFULY LOGIN!");
					
					NU_LibrarySystem window = new NU_LibrarySystem();
                    window.LSframe.setVisible(true);
                    Librarianframe.dispose();
					
				} else if (username.equals("") || password.equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter username and password", "Login Failed",
							JOptionPane.ERROR_MESSAGE);
				}else if (username.equals("Librarian")) {
					JOptionPane.showMessageDialog(null, "INCORRECT PASSWORD","Login Failed", JOptionPane.ERROR_MESSAGE);
				} else if (password.startsWith("Lib")) {
					JOptionPane.showMessageDialog(null, "INCORRECT USERRNAME","Login Failed", JOptionPane.ERROR_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "INCORRECT PASSWORD AND PASSWORD", "Login Failed", JOptionPane.ERROR_MESSAGE);
				}
						
			}

		});
		loginliblarianbutton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		loginliblarianbutton.setBounds(401, 229, 109, 37);
		Librarianframe.getContentPane().add(loginliblarianbutton);
	}
}
