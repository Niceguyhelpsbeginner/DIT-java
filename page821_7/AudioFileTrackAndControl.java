package page821_7;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.*;
import java.awt.event.*;




public class AudioFileTrackAndControl extends JFrame{
	private Container contantPane;
	private JLabel imageLabel = new JLabel();
	
	public AudioFileTrackAndControl () {
		setTitle("AudioFileTrackAndControl");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contantPane = getContentPane();
		createMenu();
		setVisible(true);
		setSize(400,150);
		
	}
	
	public void createMenu() {
		JMenuBar bar = new JMenuBar();
		
		JMenu audio = new JMenu("audio");
		JMenuItem playItem = new JMenuItem("play");
		JMenuItem quitItem = new JMenuItem("quit");
		playItem.addActionListener(new OpenActionListener());
		
		audio.add(playItem);
		audio.add(quitItem);
		bar.add(audio);
		setJMenuBar(bar);
		
		
	}
	class OpenActionListener implements ActionListener {
		private JFileChooser chooser;
		
		public OpenActionListener() {	
			chooser = new JFileChooser();
		}
		public void actionPerformed(ActionEvent e) {
			FileNameExtensionFilter filter = new FileNameExtensionFilter(
					"JPG & GIF Images",
					"jpg","gif"
					,"wav");
			chooser.setFileFilter(filter);
		
		
		int ret = chooser.showOpenDialog(null);
		
		if (ret != JFileChooser.APPROVE_OPTION) {
			JOptionPane.showMessageDialog(null, "file wasnt chosen", "warning", JOptionPane.WARNING_MESSAGE);
			return;
			
		}
		String filePath = chooser.getSelectedFile().getPath();
		
		String subedPath = filePath.substring(filePath.lastIndexOf("\\") + 1);
		System.out.println(subedPath);
		if (subedPath.equals("national anthem verses1.wav")) {
			new AudioPlayer();
			
		}
		imageLabel.setIcon(new ImageIcon(filePath));
		pack();
		}
	}
	public static void main(String[] args) {
		new AudioFileTrackAndControl();
	}
}