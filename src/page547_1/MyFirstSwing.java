package page547_1;


import javax.swing.*;
import java.awt.*;

public class MyFirstSwing extends JFrame{
	public MyFirstSwing() {
		setTitle("Make a window using swing");
		setSize(400,150);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.YELLOW);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFirstSwing frame = new MyFirstSwing();
		
	}

}
