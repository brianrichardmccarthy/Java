/*
 * Student Name: 	Brian McCarthy
 * Student Number:	20063914
 * Date:			25/02/2016
 * Assignment Name:	6.3. Create a GUI to display the Waterford IT Logo
 * Program Description: Program to create a JFrame to hold the waterford I.T. Logo and contact information
 * */
// imports

package multimediaProgramming.assignmentThree;

import java.awt.*;

import javax.swing.JFrame;

// class extends JFrame
public class WITInfo extends JFrame {

	// static variables
	public static Toolkit kit = Toolkit.getDefaultToolkit();
	private static Dimension screen = kit.getScreenSize();
	
	// non-static variables
	private WitInformation panel = new WitInformation();
	private Container pane = getContentPane();
	
	public WITInfo() {
	
		// set size and location
		setSize(screen.width / 2, screen.height / 2);
		setLocation(screen.width / 4, screen.height / 4);
		
		// set title
		setTitle("Waterford Institute of Technology");
		
		// set icon
		setIconImage(panel.getLogo());
		
		// set default close operation
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// set visible
		setVisible(true);
		
		// add to frame
		pane.add(panel);
	
	}

}