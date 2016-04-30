/**
 * @author Brian McCarthy
 * Date: 30/04/2016
 * Class Name: ImagePanel
 * Class Description: This class extends JPanel. Draws an image to the JFrame.
 */
package multimediaProgramming.finalAssignment;

import java.awt.*;
import javax.swing.*;

public class ImagePanel extends JPanel {
	
	/**
	 * @param filename (String) (Name of the countries flag to be displayed)
	 * @param image (Image) (flag image .jpg)
	 */
	private String filename;
	private Image image = null;

	/**
	 * Constructor for the ImagePanel class to display a default Image (Denmark, by Default)
	 * @param image (Image)
	 */
	public ImagePanel(Image image) {
		this.image = image;
	}
	
	/**
	 * Mutator for the Image variable. Also calls the repaint method
	 * @param image (Image) (assigned to this.image)
	 */
	public void showImage(Image image) {
		this.image = image;
		repaint();
	}

	/**
	 * Draws the image.
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		if (image != null)
			g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
	}
}