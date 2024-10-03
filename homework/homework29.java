package homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class homework29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] studentNumbers = new int[10];  // 학번 배열
        int[] scores = new int[10];          // 점수 배열

        // 10명의 학생의 학번과 점수 입력받기
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + "번째 학생의 학번: ");
            studentNumbers[i] = scanner.nextInt();
            System.out.print((i + 1) + "번째 학생의 점수: ");
            scores[i] = scanner.nextInt();
        }

        while (true) {
            try {
                System.out.println("학번으로 검색: 1, 점수로 검색: 2, 끝내려면 3>>");
                int choice = scanner.nextInt();
                if (choice == 1) {
                    // 학번으로 검색
                    System.out.print("학번 입력: ");
                    int studentNumber = scanner.nextInt();
                    boolean found = false;
                    for (int i = 0; i < 10; i++) {
                        if (studentNumbers[i] == studentNumber) {
                            System.out.println(studentNumber + "번 학생의 점수는 " + scores[i] + "점입니다.");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println(studentNumber + "번 학생은 없습니다.");
                    }
                } else if (choice == 2) {
                    // 점수로 검색
                    System.out.print("점수 입력: ");
                    int score = scanner.nextInt();
                    boolean found = false;
                    for (int i = 0; i < 10; i++) {
                        if (scores[i] == score) {
                            System.out.println(score + "점 학생은 " + studentNumbers[i] + "번 입니다.");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println(score + "점 학생은 없습니다.");
                    }
                } else if (choice == 3) {
                    // 프로그램 종료
                    System.out.println("프로그램을 종료합니다.");
                    break;
                } else {
                    System.out.println("잘못된 입력입니다. 다시 시도하세요.");
                }
            } catch (InputMismatchException e) {
                System.out.println("경고!! 정수를 입력하세요.");
                scanner.next(); // 잘못된 입력을 소비하고 다시 입력받도록 함
            }
        }
        scanner.close();
    }
}
