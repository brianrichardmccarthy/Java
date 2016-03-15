package multimediaProgramming.assignmentFour;

import java.awt.Graphics;

import javax.swing.JPanel;

class ClockPanel extends JPanel {  

	private int minutes = 0;
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawOval(0, 0, 100, 100);
		double hourAngle = 2 * Math.PI * (minutes - 3 * 60) / (12 * 60);
		double minuteAngle = 2 * Math.PI * (minutes - 15) / 60;
		g.drawLine(50, 50, 50 + (int)(30 * Math.cos(hourAngle)), 50 + (int)(30 * Math.sin(hourAngle)));
		g.drawLine(50, 50, 50 + (int)(45 * Math.cos(minuteAngle)), 50 + (int)(45 * Math.sin(minuteAngle)));
   }

   public void setTime(int h, int m) {  minutes = h * 60 + m;
      repaint();
   }

}