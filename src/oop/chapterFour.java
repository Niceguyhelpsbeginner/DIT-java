package oop;

import java.util.Scanner;

class Player {
	String nameOfThePlayer;
	public Player(String nameOfThePlayer) {
		this.nameOfThePlayer = nameOfThePlayer;
	}
	String word = "Father"; 
}


public class chapterFour {
	public static void main(String[] args) {
		Scanner scanner_main = new Scanner(System.in);
		System.out.println("lets play siritori");
		System.out.println("How many people will play the siritori?");
		int playersNumber = scanner_main.nextInt();
		Player [] players = new Player[playersNumber];
		
		for(int i = 0; i<players.length;i++) {
			System.out.println("player's name");
			String name = scanner_main.next();
			players[i] = new Player(name);
		}
		
		System.out.println("Lets begin with the word Father!");
		// game start!
		int order = 0;
		while (true){
			System.out.println(players[order].nameOfThePlayer);
			String new_word = scanner_main.next();
			if(new_word.charAt(0) != players[order].word.charAt(players[order].word.length() - 1)) {
				System.out.println(new_word.charAt(0));
				System.out.println(players[order].word.charAt(players[order].word.length() - 1));
				System.out.println("game over");
				break;
			}
			if(order == playersNumber - 1) {
				players[0].word = new_word;
			}
			else {
				players[order+1].word = new_word;				
			}
			order++;
			if(order >= playersNumber) {
				order = 0;
			}
		}
		scanner_main.close();
		
	}

}


















