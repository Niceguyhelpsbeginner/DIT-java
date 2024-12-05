package practice;

import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;


public class AudioPlayer extends JFrame {
	private JButton btn[] = {
			new JButton("play"),
			new JButton("stop"),
			new JButton("play again")
	};
	
	private Clip clip;
	
	public AudioPlayer() {
		setTitle("Audio control");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,150);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		MyActionListener al = new MyActionListener();
		
		
		for (int i = 0; i< btn.length; i++) {
			c.add(btn[i]);
			btn[i].addActionListener(al);
		}
		setVisible(true);
		loadAudio("src/audios/national anthem verses1.wav");
	}
	private void loadAudio(String pathName) {
	    try {
	        clip = AudioSystem.getClip();
	        File audioFile = new File(pathName);

	        // 오디오 파일 스트림 열기
	        AudioInputStream baseAudioStream = AudioSystem.getAudioInputStream(audioFile);

	        // 변환할 포맷 정의 (44100Hz, 16bit, 2채널)
	        AudioFormat baseFormat = baseAudioStream.getFormat();
	        AudioFormat targetFormat = new AudioFormat(
	            AudioFormat.Encoding.PCM_SIGNED, // 인코딩 방식
	            44100,                           // 샘플 레이트
	            16,                              // 비트 심도
	            2,                               // 채널 (스테레오)
	            4,                               // 프레임당 바이트 수
	            44100,                           // 프레임 레이트
	            false                            // 리틀 엔디언
	        );

	        // 포맷 변환
	        AudioInputStream convertedAudioStream = AudioSystem.getAudioInputStream(targetFormat, baseAudioStream);

	        // 클립에 오디오 데이터 로드
	        clip.open(convertedAudioStream);

	    } catch (LineUnavailableException e) {
	        e.printStackTrace();
	    } catch (UnsupportedAudioFileException e) {
	        e.printStackTrace();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}

	class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			switch (e.getActionCommand()) {
			case "play":
				clip.start();
				break;
			case "stop":
				clip.stop();
				break;
			case "play again":
				clip.setFramePosition(0);
				clip.start();
				break;
				
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AudioPlayer();
	}

}
