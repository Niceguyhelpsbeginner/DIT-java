package page248_9;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Prediction game starts!");		
		
		System.out.println("How many people will play?");
		
		int playersNumber = scanner.nextInt();
		System.out.println(playersNumber + " people will play the game!");
		
		player[] players  = new player[playersNumber];
		
		for(int i = 0; i < playersNumber; i++) {
			System.out.println("player's name");
			String name = scanner.next();
			players[i] = new player(name);
		}
		System.out.println("game starts!");
		player winner;
		
		int hiddenAnswer = (int)(Math.random()* 100 +1);
		System.out.println("There is a correct answer between 1 and 100");
		for(int i = 0; i < playersNumber; i++) {
			System.out.println(players[i].name + " answers ");
			players[i].setNumber();
		}
		int counter = 1;
		while(true){
			System.out.println(counter + " times has been counted");
			winner = players[0];
			if(Math.abs(hiddenAnswer - winner.number) > Math.abs(hiddenAnswer - players[counter].number)) {
				winner = players[counter];
			}
			if(counter >= playersNumber - 1) {
				break;
			}
			counter++;
		}
		System.out.println("The correct answer is "+hiddenAnswer + " Therefore, the winner is "+ winner.name);
		scanner.close();
	}
}
