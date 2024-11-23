package Competition;

import java.util.Scanner;

public class page112_9 {
	public static void main(String[] args) {
		System.out.println("Enter coordiates");
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		if((x == 10 || x== 200 )&&(y<300 && y>10)) {
			System.out.println("On the line!");
		}
		else if((y == 10 || y == 300) &&( x>=10 && x<=200) ){
			System.out.println("on ");
		}
		else if(x >10 && x < 200 && y >=10 && y <=300) {
			System.out.println("In the square");
		}
		else {
			System.out.println("out of the square");
		}
		scanner.close();
	}
}
