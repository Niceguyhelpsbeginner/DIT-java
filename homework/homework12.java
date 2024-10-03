package homework;

import java.util.Scanner;

public class homework12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positive_int = 0;
        System.out.println("양의 정수 입력");
        while (positive_int <=0 ) {
            positive_int = scanner.nextInt();
        }
        for(int i = positive_int; i>=0; i--){
            for(int j=1;j <=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
