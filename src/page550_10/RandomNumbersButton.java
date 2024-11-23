package page550_10;

import java.awt.*;
import javax.swing.*;

public class RandomNumbersButton extends JFrame{
	public RandomNumbersButton() {
		super("west Grid Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new BorderLayout());
		
		
		c.add(new WestPanel(), BorderLayout.WEST);
		c.add(new CenterPanel(),BorderLayout.CENTER);

		setVisible(true);
		setSize(300,200);
	}
	class WestPanel extends JPanel{
		public WestPanel() {
			Color [] color = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN,Color.BLUE,Color.MAGENTA,Color.GRAY,Color.PINK,Color.lightGray,Color.BLACK};
			GridLayout grid = new GridLayout(color.length,1);
			setLayout(grid);
			
			for(int i = 0; i<color.length; i++) {
				JButton current = new JButton();
				add(current);
				current.setBackground(color[i]);
				
			}
			
			
		}
	}
	class CenterPanel extends JPanel {
		public CenterPanel() {
			String [] numbers = {"0","1","2","3","4","5","6","7","8","9"};
			setLayout(null);
			JLabel labels [] = new JLabel[10];
			
			for(int i = 0; i < numbers.length; i++) {
				labels[i] = new JLabel(numbers[i]);
				
			}
			
			for(int i = 0; i < numbers.length; i++) {
				int x = (int)(Math.random() * 150 + 50);
				int y = (int)(Math.random() * 150 + 50);
				labels[i].setSize(20,20);
				labels[i].setLocation(x,y);
				labels[i].setForeground(Color.RED);
				add(labels[i]);
				
			}
			
			
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RandomNumbersButton();
	}

}
