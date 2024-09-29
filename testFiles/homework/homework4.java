package homework;

import java.util.Scanner;

public class homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your destination:");
        String destination = scanner.nextLine();

        System.out.println("How many people are you?");
        int number_of_people = scanner.nextInt();

        System.out.println("How long will you stay?");
        int travel_days = scanner.nextInt();

        System.out.println("Flight fee per person:");
        int flight_fee = scanner.nextInt();

        System.out.println("Accommodation cost per room per night:");
        int hotel_fee = scanner.nextInt();

        int hotel_room = (number_of_people + 1) / 2;  
        int total_fee = hotel_room * hotel_fee * travel_days + flight_fee * number_of_people;

        System.out.println(travel_days + " days of travel to " + destination + " costs " + total_fee + " won.");
        
        scanner.close();

}
}