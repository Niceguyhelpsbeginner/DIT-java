package page655_5;

import javax.swing.*;

import page248_9.main;

import java.awt.*;

public class HorizonalSlider extends JFrame {
	public HorizonalSlider() {
		setTitle("slider making example ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JSlider slider = new JSlider(JSlider.HORIZONTAL,0,200,100);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(50);
		slider.setMinorTickSpacing(10);
		c.add(slider);
		
		setSize(300,100);
		setVisible(true);
		JLabel valueLabel = new JLabel();
		while (true) {
			
			int val = slider.getValue();
			valueLabel.setText(String.valueOf(val));
			c.add(valueLabel);
		}
		
	}
	
	public static void main(String[] args) {
		new HorizonalSlider();
	}
}
