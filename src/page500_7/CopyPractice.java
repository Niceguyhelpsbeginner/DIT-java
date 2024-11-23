package page500_7;

import java.io.*;

public class CopyPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("file copying..");
		System.out.println("print * on every 10%");
		File src = new File("C:\\Users\\seong\\OneDrive\\Desktop\\numbers.txt");
		File dest = new File("C:\\Users\\seong\\OneDrive\\Desktop\\copied.txt");
		
		int c;
		
		long size = src.length();
		long size_copied = size;
		int count = 1;
		
		try {
			FileReader fr = new FileReader(src);
			FileWriter fw = new FileWriter(dest);
			
			while((c = fr.read()) != -1) {
				fw.write(c);
				count++;
				if(10 * count / size_copied  >1) {
					System.out.print("*");
					count = 1;
				}
			}
			fr.close();
			fw.close();
			System.out.println(src.getPath() + "has been copied onto " +dest.getPath());
		}
		catch(IOException e) {
			System.out.println("error occured");
		}
	}

}
