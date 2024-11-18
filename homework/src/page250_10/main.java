package page250_10;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MonthlyDiary wholeMonth [] = new MonthlyDiary[30];
		for(int i = 0; i<30; i++) {
			wholeMonth[i] = new MonthlyDiary(i+1);
		}
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("2024 - october - diary");
			System.out.println("write: 1, read: 2, end: 3");
			int command = scanner.nextInt();
			if(command == 1) {
				int date = scanner.nextInt();
				wholeMonth[date-1].content = scanner.nextLine();
				System.out.println(date + " scheduled for "+ wholeMonth[date-1].content);
			}
			else if(command == 2) {
				for(int i = 0; i <wholeMonth.length;i++) {
					System.out.println(wholeMonth[i].content);
				}
			}
			else {
				break;
			}
		}
	}

}
