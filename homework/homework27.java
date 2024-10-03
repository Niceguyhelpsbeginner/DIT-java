package homework;
import java.util.Scanner;

public class homework27 {
    public static void main(String[] args) {
        System.out.println("양의 정수를 입력하세요 -1은 입력 끝");
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;

        while (true) {
            try {
                String value = scanner.nextLine();
                int int_value = Integer.parseInt(value);

                if (int_value == -1) {
                    break;
                }

                if (int_value > 0) {
                    sum += int_value;
                    count++;
                }
            } catch (NumberFormatException e) {
                System.out.println("유효한 숫자를 입력하세요.");
                continue;
            }
        }

        if (count > 0) {
            System.out.println("평균: " + (double) sum / count);
        } else {
            System.out.println("유효한 양의 정수가 입력되지 않았습니다.");
        }

        scanner.close();
    }
}
