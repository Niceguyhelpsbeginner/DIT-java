package page549_7;

import java.awt.*;
import javax.swing.*;

public class Calculator extends JFrame{
	public Calculator() {
		super("java swing calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		c.add(new NorthPanel(),BorderLayout.NORTH);
		c.add(new CenterPanel(), BorderLayout.CENTER);
		c.add(new SouthPanel(), BorderLayout.SOUTH);
		
		setVisible(true);
		setSize(500,500);
		
		
	}
	class NorthPanel extends JPanel {
		public NorthPanel() {
			GridLayout grid = new GridLayout(1,2);
			grid.setHgap(0);
			setLayout(grid);
			setBackground(Color.lightGray);
			
//			new FlowLayout(FlowLayout.CENTER,10,10);
			
			add(new JLabel("equation"));
			add(new JTextField(" "));
		}
		
	}
	class CenterPanel extends JPanel {
		public CenterPanel() {
			GridLayout grid = new GridLayout(4,5);
			grid.setVgap(3);
			setLayout(grid);
			String [] buttons = {"c","un","bk","/","7","8","9","x","4","5","6","-","1","2","3","+","0",".","=","%"};
			for(int i = 0; i<buttons.length; i++) {
				JButton current = new JButton(buttons[i]);
				add(current);
				if(buttons[i].equals("=")) {
					current.setBackground(Color.CYAN);
				}
			}
			
		}
	}
	class SouthPanel extends JPanel {
		public SouthPanel() {
			new FlowLayout(FlowLayout.CENTER, 10,20);
			add(new JButton("start!"));
			setBackground(Color.YELLOW);
		}
	}
	
	public static void main(String[] args) {
		new Calculator();
	}
}
