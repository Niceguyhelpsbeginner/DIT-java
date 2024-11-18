package page395_5;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input all the grade");
		Scanner scanner = new Scanner(System.in);
		int score;
		int sum = 0;
		
		
		String grades = scanner.nextLine();
		
		String [] gradeArray = grades.split(" ");
		
		for(int i = 0; i<gradeArray.length; i++) {
			gradeArray[i] = gradeArray[i].toUpperCase();
			if(gradeArray[i].equals("A")) {
				score = 100;	
			}
			else if(gradeArray[i].equals("B")) {
				score = 90;
			}else if(gradeArray[i].equals("C")) {
				score = 80;
			}else if(gradeArray[i].equals("D")) {
				score = 70;
			}
			else if(gradeArray[i].equals("F")) {
				score = 0;
			}
			else {
				System.out.println("error occured");
				return;
			}
			sum += score;
		}
		System.out.println((float)sum/gradeArray.length);
		scanner.close();
	}

}
