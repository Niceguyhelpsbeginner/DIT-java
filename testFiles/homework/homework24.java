package homework;

import java.util.Scanner;
import java.util.InputMismatchException;

public class homework24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("곱하고자 하는 정수 2개 입력>>");
            try {
                int n = scanner.nextInt();
                int m = scanner.nextInt();
                System.out.println(n + " x " + m + " = " + (n * m));
                break;
            } catch (InputMismatchException e) {
                String ex = scanner.nextLine();
                System.out.println(ex + "는 정수가 아닙니다. 다시 입력하세요.");
            }
        }

        scanner.close();
    }
}
