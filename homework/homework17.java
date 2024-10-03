package homework;

import java.util.Scanner;

public class homework17 {
    public static void main(String[] args) {
        System.out.println("정수 몇개 지정하시겠습니까?");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();
        int sum = 0;
        int array[] = new int[quantity];        
        for(int i = 0; i< quantity; i++){
            array[i] = (int)(Math.random() * 100);
            System.out.println(array[i]);
            sum += array[i];
        }
        System.out.println("평균은 " + (double)sum/quantity);
    }    
}
