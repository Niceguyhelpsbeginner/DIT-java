package homework;

import java.util.Scanner;

public class homework14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array[] = new int[10]; 
        System.out.println("양의 정수 10개 입력");
        for(int i = 0; i< 10; i++){
            array[i] = scanner.nextInt();
        }
        System.out.print("4의 배수는 :");
        for(int i = 0; i< 10; i++){
            if(array[i] % 4 == 0){
                System.out.print(array[i]+ "    ");
            }
        }
        scanner.close();
    }
}
