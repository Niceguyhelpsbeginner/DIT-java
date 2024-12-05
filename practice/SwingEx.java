package practice;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class SwingEx extends JFrame {
	private Container contentPane;
	
	public SwingEx() {
		setTitle("tooltip example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		createToolBar();
		setVisible(true);
		setSize(400,150);
		
	}
	private void createToolBar() {
		JToolBar bar = new JToolBar("kitae Menu");
		bar.setBackground(Color.LIGHT_GRAY);
		
		JButton newBtn = new JButton("new");
		newBtn.setToolTipText("file created");
		bar.add(newBtn);
		
		JButton openBtn = new JButton(new ImageIcon("src/images/file.png"));
		openBtn.setToolTipText("file opened");
		
		bar.add(openBtn);
		bar.addSeparator();
		
		JButton saveBtn = new JButton(new ImageIcon("src/images/save.png"));
		saveBtn.setToolTipText("file saved");
		bar.add(saveBtn);
		bar.add(new JLabel("search"));
		
		JTextField tf = new JTextField("text field");
		tf.setToolTipText("enter the string youre looking for");
		bar.add(tf);
		contentPane.add(bar, BorderLayout.NORTH);
		
	}
	public static void main(String[] args) {
		new SwingEx();
	}
}
