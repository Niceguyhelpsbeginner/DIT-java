package practice;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b[] = new byte [6];
		
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\seong\\OneDrive\\Desktop\\numbers.txt");
			int n =0;
			int c;
			
			while((c = fin.read()) != -1) {
				b[n] = (byte)c;
				System.out.print(b[n] + " ");
				n++;
				
			}
			System.out.println("output array value onto console");
			
//			for(int j =0; j<b.length; j++) {
//				System.out.print(b[j] + " ");
//			}
			fin.close();
			System.out.println(" ");
		}
		catch(IOException e){
			System.out.println("error occured!");
		}
		
		System.out.println("try and catch end");
	}

}
