package multimediaProgramming.assignmentFour;

/**
 * @version 1.20 2 Jul 1998
 * @author Cay Horstmann
 */
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

class TextTestFrame extends JFrame implements DocumentListener {
	
	private JTextField hourField = new JTextField("12", 3);
	private JTextField minuteField = new JTextField("00", 3);
	// private JTextField 
	private ClockPanel clock = new ClockPanel();
	private int h = 12, m = 0;
	private JPanel panelEast = new JPanel(new FlowLayout()), panelSouth = new JPanel(new FlowLayout()), panelNorth = new JPanel(new FlowLayout());
	
	
	public TextTestFrame() {
		setTitle("TextTest");
		setSize(300, 200);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		Container contentPane = getContentPane();
		// create panel for text field and place it in SOUTH area
		hourField.getDocument().addDocumentListener(this);
		/* hourField.getDocument().addDocumentListener(new DocumentListener() {
			public void insertUpdate(DocumentEvent e) {
				setClock();
				System.out.println("insert");
			}

			public void removeUpdate(DocumentEvent e) {
				setClock();
				System.out.println("update");
			}

			public void changedUpdate(DocumentEvent e) {
				System.out.println("change");
			}
		}); */
		minuteField.getDocument().addDocumentListener(this);
		/* minuteField.getDocument().addDocumentListener(new DocumentListener() {
			public void insertUpdate(DocumentEvent e) {
				setClock();
			}

			public void removeUpdate(DocumentEvent e) {
				setClock();
			}

			public void changedUpdate(DocumentEvent e) {
				System.out.println("change");
			}
		}); */
		// panelSouth.add(hourField);
		// panelSouth.add(minuteField);
		clock.setPreferredSize(new Dimension(100, 100));
		panelSouth.add(hourField);
		panelSouth.add(minuteField);
		
		contentPane.add(clock, BorderLayout.WEST);
		contentPane.add(panelSouth, BorderLayout.SOUTH);
		// contentPane.add(panelEast, BorderLayout.EAST);
		setVisible(true);
	}

	// methods in DocumentListener
	public void insertUpdate(DocumentEvent e) {
		setClock();
	}

	public void removeUpdate(DocumentEvent e) {
		setClock();
	}

	public void changedUpdate(DocumentEvent e) {
	}
	
	public void setClock() {
		int pH = h, pM = m;
		try {
			if (!hourField.getText().isEmpty()) {
				h = Integer.parseInt(hourField.getText().trim());
			} 
			if (!minuteField.getText().isEmpty()) {
				m = Integer.parseInt(minuteField.getText().trim());
			}
		} catch (NumberFormatException e) {
			h = pH; 
			m = pM;
		}
		clock.setTime(h, m);			
	}

}