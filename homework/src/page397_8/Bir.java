package page397_8;

import java.util.Calendar;
import java.util.Scanner;

public class Bir {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("today is 2024 11 13");
		
		String birthday = scanner.nextLine();
		
		String [] splited = birthday.split(" ");
		int year = Integer.parseInt(splited[0]);
		int month = Integer.parseInt(splited[1]);
		int day = Integer.parseInt(splited[2]);
		
		int man_year = 2024 - year - 1;
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, year);
		int sum = 0;
		for(int i = 1; i < month; i++) {
			calendar.set(Calendar.MONTH, i - 1);
			int date = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
			sum += date;
			
		}

		calendar.set(Calendar.MONTH, month - 1);
		int lived_day = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		sum += day;
		sum += man_year*365;
		System.out.println(sum + "days you have lived");
		scanner.close();
	}
}
