package page656_10;

import javax.swing.*;

import page248_9.main;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;




public class ConnectTheWords extends JFrame {
	String [][] sentences = {{"You","are","dancing","queen"},
			{"you","are","my","sunshine"},
			{"dont","you","want","me","like","I","want","you","baby"}};
	private int sentence_index;
	public ConnectTheWords(){
		setTitle("connecting sentences");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(300,150);
		Container c = getContentPane();

		sentence_index = (int)(Math.random() * sentences.length);
		String [] sentence = sentences[sentence_index];
		JLabel labels [] = new JLabel[sentences[sentence_index].length];
		
		for(int i = 0; i<sentences[sentence_index].length; i++) {
			labels[i] = new JLabel(sentence[i]);
		}
		for(int i = 0; i< sentence.length; i++) {
			int x = (int)(Math.random() * 150 + 50);
			int y = (int)(Math.random() * 150 + 50);
			labels[i].setSize(20,20);
			labels[i].setLocation(x,y);
			labels[i].setForeground(Color.RED);
			c.add(labels[i]);
		}
	}
	
	public static void main(String[] args) {
		new ConnectTheWords();
	}
}
