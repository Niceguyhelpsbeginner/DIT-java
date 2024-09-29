package homework;

import java.util.Scanner;

public class homework19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array[][] = new int[4][4];
        for(int i = 0; i<4;i++){
            for(int j = 0; j<4; j++){
                array[i][j] = (int)(Math.random()*255);
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("임계값 입력");
        int threshold = scanner.nextInt();
        for(int i = 0; i<4;i++){
            for(int j = 0; j<4; j++){
                if(threshold < array[i][j]) {
                    array[i][j] = 255;
                }
                else {
                    array[i][j] = 0;
                }
                System.out.print(array[i][j]+ " ");
            }
            System.out.println(" ");
        }
        scanner.close();
    }
}
