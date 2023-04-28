package Attendance2;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import javax.swing.JFrame;
import java.awt.Color;

public class NU_LibrarySystem extends JFrame {

	private ElectronicBook[] books = { new ElectronicBook("System Analysis and Design", "Gary B. Shelly", 2),
			new ElectronicBook("Android Application", "Corinne Hoisington", 3),
			new ElectronicBook("Programming Concepts and Logic Formulation", "Rosauro E. Manuel", 4),

	};
	private JButton rentBtn;
	private JComboBox<String> Books;
	public JFrame LSframe;

	/**
	 * 
	 */
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

					NU_LibrarySystem window = new NU_LibrarySystem();
					window.LSframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */

	public NU_LibrarySystem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */

	public void initialize() {
		// Initialize a new JFrame object for the NU Library System
		LSframe = new JFrame();
		LSframe.getContentPane().setBackground(new Color(0, 128, 255));
		// Set the title of the frame to "NU LIBRARY SYSTEM"
		LSframe.setTitle("NU LIBRARY SYSTEM");
		// Set the dimensions of the frame to 661 pixels by 422 pixels
		LSframe.setSize(661, 422);
		// Set the default close operation to exit the program when the frame is closed
		LSframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Call the updateBookList method to update the book list
		updateBookList();

		// Initialize a new JScrollPane object for the frame
		JScrollPane scrollPane = new JScrollPane();
		// Set the bounds of the scroll pane to be located at (0,22) with a width of 645
		// pixels and height of 328 pixels
		scrollPane.setBounds(0, 22, 645, 328);

		// Initialize a new JComboBox object for the frame to display the available
		// books
		Books = new JComboBox<String>();
		Books.setBackground(new Color(0, 128, 255));
		Books.setBounds(0, 0, 645, 22);
		for (int i = 0; i < books.length; i++) {
			Books.addItem(i + " " + books[i].getTitle() + " by " + books[i].getAuthor() + " ("
					+ books[i].getCopiesAvailable() + " copies available)");
		}
		LSframe.getContentPane().setLayout(null);
		// Adds scrollPane to the content pane of LSframe
		LSframe.getContentPane().add(scrollPane);
		
				// Initialize a new JPanel object for the frame to hold the rent button
				JPanel buttonPanel = new JPanel();
				buttonPanel.setBackground(new Color(0, 128, 255));
				scrollPane.setViewportView(buttonPanel);
				buttonPanel.setLayout(null);
				
						// Creates a new JButton instance with the label "Rent"
						rentBtn = new JButton("Rent");
						rentBtn.setBounds(214, 50, 191, 85);
						// Adds rentBtn to buttonPanel
						buttonPanel.add(rentBtn);
						// Adds an action listener to rentBtn that listens for button clicks
						rentBtn.addActionListener(new RentButtonListener());
		LSframe.getContentPane().add(Books);

		LSframe.setVisible(true);
	}

	// Starts a new method called updateBookList
	private void updateBookList() {
		StringBuilder Sbuilder = new StringBuilder();
		// Loops through each ElectronicBook in books
		for (ElectronicBook book : books) {
			Sbuilder.append(book.getTitle()).append(" by ").append(book.getAuthor()).append(" (")
					.append(book.getCopiesAvailable()).append(" copies available)\n");
		}
	}

	private class RentButtonListener implements ActionListener { 	
															
		// Overrides the actionPerformed method of the ActionListener interface
		public void actionPerformed(ActionEvent e) { 
			// Gets the index of the selected book in Books										
			int index = Books.getSelectedIndex(); 
			// Checks if the index is valid
			if (index < 0 || index >= books.length) { 
				// Displays an error message if index is invalid
				JOptionPane.showMessageDialog(NU_LibrarySystem.this, "Index does not exist, try again!");
				return;
			}
			ElectronicBook book = books[index];
			// Checks if there are copies of the book available
			if (book.getCopiesAvailable() == 0) {
				JOptionPane.showMessageDialog(NU_LibrarySystem.this,
						"No copies of this book are available, please try another one.");

				return;
			}
			book.rentBook(); // Rents the selected book
			updateBookList(); // Updates the book list
			JOptionPane.showMessageDialog(NU_LibrarySystem.this, "You rented " + book.getTitle() + ". (There are now "
					+ book.getCopiesAvailable() + " copies left.)"); 																	
			if (JOptionPane.showConfirmDialog(NU_LibrarySystem.this, "RENT ANOTHER BOOK?", "BOOK RENTED",
					JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) { 																																						

			} else { // If the user does not want to rent another book
				// Displays a message indicating the end of the program
				JOptionPane.showMessageDialog(NU_LibrarySystem.this, "END OF PROGRAM");

				// Closes the frame
				LSframe.dispose();
			}
		}
	}
}
