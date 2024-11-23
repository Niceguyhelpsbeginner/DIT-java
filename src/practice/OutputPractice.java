package practice;

import java.io.*;

public class OutputPractice {
	public static void main(String[] args) {
		
		byte b[] = {7,51,3,4,-1,24};
		
		
		try {
			FileOutputStream fout = new FileOutputStream("C:\\Users\\seong\\OneDrive\\Desktop\\numbers.txt");
			
			for(int i = 0; i < b.length; i++) {
				fout.write(b[i]);
				
			}
			fout.close();
					
		}catch (IOException e) {
			System.out.println("error occured");
			return;
		}
		System.out.println("saved!");
	}
}
