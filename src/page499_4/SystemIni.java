package page499_4;

import java.io.*;

public class SystemIni {
	public static void main(String[] args) {
		
		try {
			
		
		BufferedOutputStream bout = new BufferedOutputStream(System.out, 20);
		FileReader fin = new FileReader("C:\\Windows\\system.ini");
		int c;
		int count = 48;
		while((c = fin.read()) != -1) {
			bout.write((char)c);
			if(c == '\n') {
				bout.write((char)count);
				bout.write((char)20); // blank ascii code
				count++;
			}
		}
		
		fin.close();
		bout.close();
		}
		catch (IOException e){
			System.out.println("error");
		}
		
		System.out.println("done");
		
	}
}
