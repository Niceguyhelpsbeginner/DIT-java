package page396_6;

import java.util.Scanner;

public class Rotate {
	public static void main(String[] args) {
		System.out.println("Input Strings!");
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		String line = scanner.nextLine();
		while(true) {
			
			String back = line.substring(1);
			line = back + line.charAt(0);
			System.out.println(line);
			if(count >=line.length() -1) {
				break;
			}
			count++;
		}
		
		
		scanner.close();
	}
}
