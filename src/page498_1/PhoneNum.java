package page498_1;

import java.io.*;
import java.util.Scanner;

public class PhoneNum {
	public static void main(String[] args) {
		System.out.println("phone number input program");
		Scanner scanner = new Scanner(System.in);
		FileWriter fout = null;
		
		try {
			fout = new FileWriter("C:\\Users\\seong\\OneDrive\\Desktop\\numbers.txt");
			String answer;
			while(true) {
				System.out.print("name and phone number >>");
				answer = scanner.nextLine();
				if(answer.equals("stop")) {
					break;
				}
				fout.write(answer,0,answer.length());
				fout.write("\r\n",0,2);
				
			}
			fout.close();
		}
		catch(IOException e){
			System.out.println("error occured!");
		}
		scanner.close();
	}
}
