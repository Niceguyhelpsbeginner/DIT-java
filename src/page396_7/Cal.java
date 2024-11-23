package page396_7;

import java.util.Calendar;
import java.util.Scanner;

public class Cal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar = Calendar.getInstance();
		Scanner scanner = new Scanner(System.in);
		System.out.println("what year?");
		int year = scanner.nextInt();
		calendar.set(Calendar.YEAR, year);
		String [] months = {"Jan","Feb","Mar","Apr","May","June","July","Oct","Sep","Aug","Nov","Dec"};
		
		for(int i =0; i<12; i++) {
			calendar.set(Calendar.MONTH,i);
			calendar.set(Calendar.DAY_OF_MONTH,1);
			int startday = calendar.get(Calendar.DAY_OF_WEEK);
			int lastday = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
			
			System.out.println(year +" " + months[i]);
			System.out.println("sun mon tue wen thu fri sat");
			
			for(int n = 0; n < startday; n++) {
				System.out.print(" ");
			}
			for(int j = 1; j<=lastday; j++) {
				System.out.print(" "+ j+ " ");
				if((startday + j )% 7 == 0) {
					System.out.println(" ");
				}
			}
			System.out.println("");
		}
		scanner.close();
	}

}
