package multimediaProgramming.finalAssignment;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MediaPlayer extends JFrame {

	private static final Toolkit KIT = Toolkit.getDefaultToolkit();
	private static final Dimension SCREENSIZE = KIT.getScreenSize();
	private static final int HEIGHT = SCREENSIZE.height, WIDTH = SCREENSIZE.width;

	private Button play = new Button(false, "Play"), stop = new Button(false, "Stop");
	private String title = "Media Player";
	private Container pane = getContentPane();

	public MediaPlayer() {
		addNorth();
		set();
	}

	private JPanel newPanel() {
		return new JPanel(new FlowLayout());
	}

	private void addNorth() {
		JPanel north = newPanel();
		north.add(play);
		north.add(stop);
		pane.add(north, BorderLayout.NORTH);
	}

	private void set() {
		setTitle(title);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(WIDTH / 2, HEIGHT / 2);
		setLocation(WIDTH / 4, HEIGHT / 4);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MediaPlayer();
	}

}