package homework;

import java.util.Scanner;

public class homework3 {
        static public void main(String[] args) {
      System.out.println("enter your birthday");
      Scanner scanner = new Scanner(System.in);
      int tteockbboki, kimmali,zzolmyeon;
      
      int tteockbboki_price = 2000;
      int kimmali_price = 1000;
      int zzolmyeon_price = 3000;
      int total_price;
      System.out.println("how many portion of tteockbboki");
      tteockbboki = scanner.nextInt();
      System.out.println("how many portion of kimmali");
      kimmali = scanner.nextInt();
      System.out.println("how many portion of zzolmyeon");
      zzolmyeon = scanner.nextInt();
      total_price = tteockbboki * tteockbboki_price + kimmali * kimmali_price + zzolmyeon * zzolmyeon_price;
      System.out.println("The total price is" + total_price);
      scanner.close();
   }

}
