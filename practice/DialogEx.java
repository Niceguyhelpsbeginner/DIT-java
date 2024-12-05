package practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyDialog extends JDialog {
	private JTextField tf = new JTextField(10);
	private JButton jb = new JButton("ok");
	
	public MyDialog(JFrame frame, String title) {
		super(frame,title);
		setLayout(new FlowLayout());
		add(tf);
		add(jb);
		setSize(200,150);
		jb.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		
	}
	
}
public class DialogEx extends JFrame {
	private MyDialog dia;
	
	public DialogEx() {
		super("dialog ex frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton btn = new JButton("show dialog");
		dia = new MyDialog(this,"Test dialog");
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dia.setVisible(true);
			}
		});
		getContentPane().add(btn);
		setSize(250,200);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new DialogEx();
	}
}











