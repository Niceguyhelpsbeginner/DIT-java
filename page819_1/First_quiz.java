package page819_1;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.*;


public class First_quiz extends JFrame{
	private Container contentPane;
	
	public First_quiz() {
		setTitle("make a menu");
		contentPane = getContentPane();

		createMenu();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,150);
		setVisible(true);
		
	}
	public void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenu fileMenu = new JMenu("file");
		JMenu edit = new JMenu("edit");
		JMenu view= new JMenu("view");
		JMenu enter = new JMenu("enter");
		
		JMenuItem viewExpandItem = new JMenuItem("expand view");
		JMenuItem layer = new JMenuItem("layer");
		
		
		view.add(viewExpandItem);
		view.add(layer);
		
		mb.add(fileMenu);
		mb.add(edit);
		mb.add(view);
		mb.add(enter);
		setJMenuBar(mb);
		

		
	}
	public static void main(String[] args) {
		new First_quiz();
	}
}
