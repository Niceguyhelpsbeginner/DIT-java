package page488_1;

import java.util.Scanner;
import java.util.Vector;

public class First {
	public static void main(String[] args) {
		System.out.println("Enter Integers(if you put -1, it would be ended immediately.");
		Vector<Integer> v = new Vector<Integer>();
		Scanner scanner = new Scanner(System.in);
		int answer = scanner.nextInt();
		int smallest = answer;
		while(answer != -1) {
			answer = scanner.nextInt();
			v.add(answer);
			if(smallest > v.get(v.size()-1) && answer != -1) {
				smallest = v.get(v.size()-1);
			}
			
		}
		System.out.println(smallest);
		
		
		scanner.close();
	}
}
