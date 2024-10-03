package homework;

import java.util.Scanner;

public class homework26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("양의 정수를 입력하세요");
        int sum = 0;
        int count = 0;
        while (true) {
            try {
                String integer = scanner.nextLine();
                sum += Integer.parseInt(integer);
                count++;
                
            } catch (Exception e) {
                count--;
                String ex = scanner.nextLine();
                System.out.println(ex+"제외");
            }
            if(count >= 10){
                break;
            }
        }
        
        System.out.println("평균은" + (double)sum/10);
    }
}
