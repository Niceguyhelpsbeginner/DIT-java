package homework;

import java.util.Scanner;

// p 112 9번 문제
public class homework7 {
    public static void main(String args[]){
        System.out.println("점 (x,y) 의 좌표 입력");
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        boolean condition = firstNum < 200 && firstNum > 10 && secondNum < 300 && secondNum >10;
        if(condition){
            System.out.println("점 ("+ firstNum + "," + secondNum + ") 는 사각형 안에 있습니다.");
        }
        else {
            System.out.println("점 ("+ firstNum + "," + secondNum + ") 는 사각형 밖에 있습니다.");
        }
    }         
}
