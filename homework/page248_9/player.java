package page248_9;

import java.util.Scanner;

public class player {
	String name;
	int number;
	public Scanner scanner = new Scanner(System.in);
	player(String name){
		this.name = name;
	}
	
	void setNumber() {
		number = scanner.nextInt();
	}
}
