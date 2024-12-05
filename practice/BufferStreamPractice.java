package practice;

import java.io.*;
import java.util.Scanner;

public class BufferStreamPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fin = null;
		int c;
		
		try {
			fin = new FileReader("C:\\Users\\seong\\OneDrive\\Desktop\\hangul.txt");
			BufferedOutputStream out = new BufferedOutputStream(System.out, 5);
			
			while((c = fin.read()) != -1) {
				out.write(c);
			}
			new Scanner(System.in).nextLine();
			
			out.flush();
			fin.close();
			out.close();
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("code ended");
		
		
	}

}
