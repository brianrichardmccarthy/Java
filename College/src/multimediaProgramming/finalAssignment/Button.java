package multimediaProgramming.finalAssignment;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Button extends JButton {
	
	private boolean state = false;
	private String name;
	
	public Button(boolean state, String name) {
		setText(name);
		setState(state);
	}

	public void setName(String name) {
		setText(this.name = name);
	}
	
	public void setState(boolean state) {
		setEnabled(this.state = state);
	}
	
	public void press() {
		setState(!state);
	}

	public boolean getState() {
		return state;
	}

	public String getName() {
		return name;
	}
	
	
	
}