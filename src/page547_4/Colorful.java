package page547_4;

import javax.swing.*;
import java.awt.*;


public class Colorful extends JFrame{
	public Colorful() {
		setTitle("Frame thats positioned with ten buttons");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Color [] color = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN,Color.BLUE,Color.MAGENTA,Color.GRAY,Color.PINK,Color.lightGray}; 
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		new FlowLayout(FlowLayout.CENTER, 0, 0);
		JButton one = new JButton("1");
		c.add(one);
		one.setBackground(color[0]);
		JButton two = new JButton("2");
		c.add(two);

		two.setBackground(color[1]);
		JButton three = new JButton("3");
		c.add(three);

		three.setBackground(color[2]);
		JButton four = new JButton("4");
		c.add(four);

		four.setBackground(color[3]);
		JButton five = new JButton("5");
		c.add(five);

		five.setBackground(color[4]);
		JButton six = new JButton("6");
		c.add(six);

		six.setBackground(color[5]);
		JButton seven = new JButton("7");
		c.add(seven);

		seven.setBackground(color[6]);
		JButton eight = new JButton("8");
		c.add(eight);

		eight.setBackground(color[7]);
		JButton nine = new JButton("9");
		c.add(nine);

		nine.setBackground(color[8]);

		setVisible(true);
		setSize(440,150);
		
	}
	public static void main(String[] args) {
		new Colorful();
	}
}
