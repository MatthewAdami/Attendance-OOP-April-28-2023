package Attendance2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class LibraryManagement {

	JFrame LMframe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibraryManagement window = new LibraryManagement();
					window.LMframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LibraryManagement() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		LMframe = new JFrame(); //create a new JFrame
		LMframe.getContentPane().setBackground(new Color(0, 128, 255));
		LMframe.setBounds(100, 100, 553, 355); //set the size and location of the frame
		LMframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //set the default close operation when the user clicks the "x" button
		LMframe.getContentPane().setLayout(null); //set the layout to null (no layout manager)

		//create a new JLabel with the title text and font, and set its position and size
		JLabel titlelabel = new JLabel("LIBRARY MANAGEMENT");
		titlelabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		titlelabel.setBounds(148, 27, 253, 35);
		LMframe.getContentPane().add(titlelabel); //add the label to the frame's content pane

		//create a new JButton with the admin login text and font, and set its position and size
		JButton Adminbutton = new JButton("Admin Login");
		Adminbutton.addActionListener(new ActionListener() {
				//add an action listener that creates a new AdminLogin window and disposes of the current window
				public void actionPerformed(ActionEvent e) {
					AdminLogin window = new AdminLogin();
					window.Adminloginframe.setVisible(true);
					LMframe.dispose();
			}
		});
		Adminbutton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Adminbutton.setBounds(193, 94, 143, 42);
		LMframe.getContentPane().add(Adminbutton); //add the button to the frame's content pane

		//create a new JButton with the librarian login text and font, and set its position and size
		JButton Librarianbutton = new JButton("Librarian  Login");
		Librarianbutton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Librarianbutton.addActionListener(new ActionListener() {
			//add an action listener that creates a new LibrarianLogin window and disposes of the current window
			public void actionPerformed(ActionEvent e) {
				LibrarianLogin window = new LibrarianLogin();
				window.Librarianframe.setVisible(true);
				LMframe.dispose();
				
			}
		});
		Librarianbutton.setBounds(193, 159, 143, 42);
		LMframe.getContentPane().add(Librarianbutton); //add the button to the frame's content pane
	}
}
