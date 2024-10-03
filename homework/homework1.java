package homework;
// 2nd practice
import java.util.Scanner;

//110 page practice 
public class homework1 {
    static public void main(String[] args) {
       System.out.println("$1 worths 1200 won. Please enter dolloar amount");
       Scanner scanner = new Scanner(System.in);
       int dollars, won;
       dollars = scanner.nextInt();
       won = dollars * 1200;
       System.out.println("$" + dollars + " worths " + won);
       scanner.close();

    }
 }
 