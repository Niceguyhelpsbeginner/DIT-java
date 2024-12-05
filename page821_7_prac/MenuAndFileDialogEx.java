package page821_7_prac;


import javax.swing.*;
import javax.swing.filechooser.*;
import java.awt.*;
import java.awt.event.*;


public class MenuAndFileDialogEx extends JFrame {
	private JLabel imageLabel = new JLabel();
	
	public MenuAndFileDialogEx() {
		setTitle("shit fuck title");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.add(imageLabel);
		createMenu();
		setSize(300,200);
		setVisible(true);
		
	}
	private void createMenu() {
		JMenuBar jb = new JMenuBar();
		JMenu file = new JMenu("File");
		JMenuItem open = new JMenuItem("open");
		
		open.addActionListener(new OpenActionListener());
		file.add(open);
		jb.add(file);
		
		setJMenuBar(jb);
		
		}
	// open
	class OpenActionListener implements ActionListener {
		private JFileChooser chooser;
		
		public OpenActionListener() {	
			chooser = new JFileChooser();
		}
		public void actionPerformed(ActionEvent e) {
			FileNameExtensionFilter filter = new FileNameExtensionFilter(
					"JPG & GIF Images",
					"jpg","gif");
			chooser.setFileFilter(filter);
		
		
		int ret = chooser.showOpenDialog(null);
		
		if (ret != JFileChooser.APPROVE_OPTION) {
			JOptionPane.showMessageDialog(null, "file wasnt chosen", "warning", JOptionPane.WARNING_MESSAGE);
			return;
			
		}
		String filePath = chooser.getSelectedFile().getPath();
		imageLabel.setIcon(new ImageIcon(filePath));
		pack();
		}
	}
	public static void main(String[] args) {
		new MenuAndFileDialogEx();
	}
}