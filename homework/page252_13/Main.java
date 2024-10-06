package page252_13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("concert hall reservation system");
		Scanner scanner = new Scanner(System.in);
		Seat S_seat = new Seat();
		Seat A_seat = new Seat();
		Seat B_seat = new Seat();
		while(true) {
			System.out.println("reserve:1 , look over:2 , cancel:3 , end process:4");
			int command = scanner.nextInt();
			if(command == 1) {
				System.out.println("S(1) A(2) B(3) ");
				int reserve_command = scanner.nextInt();
				if(reserve_command == 1) {
					S_seat.show();
					String reserving_name = scanner.next();
					int reserving_seat = scanner.nextInt();
					S_seat.seated_status[reserving_seat-1] = reserving_name;
				}
				else if(reserve_command ==2) {
					A_seat.show();
					String reserving_name = scanner.next();
					int reserving_seat = scanner.nextInt();
					A_seat.seated_status[reserving_seat-1] = reserving_name;
				}else if(reserve_command == 3) {
					B_seat.show();
					String reserving_name = scanner.next();
					int reserving_seat = scanner.nextInt();
					B_seat.seated_status[reserving_seat-1] = reserving_name;
				}
				else {
					System.out.println("choose a number from 1,2,3");
				}
				
			}else if(command ==2) {
				S_seat.show();
				A_seat.show();
				B_seat.show();
			}else if(command == 3) {
				System.out.println("S(1) A(2) B(3) ");
				int canceling_seat = scanner.nextInt();
				if(canceling_seat == 1) {
					S_seat.show();
					String canceling_name = scanner.nextLine();
					S_seat.cancel(canceling_name);
				}
				else if(canceling_seat == 2) {
					A_seat.show();
					String canceling_name = scanner.nextLine();
					A_seat.cancel(canceling_name);
				}
				else if(canceling_seat ==3) {
					B_seat.show();
					String canceling_name = scanner.nextLine();
					B_seat.cancel(canceling_name);
				}
			}else if(command == 4) {
				break;
			}
		}
		scanner.close();
	}

}
