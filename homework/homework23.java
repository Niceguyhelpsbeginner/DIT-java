package homework;

import java.util.Scanner;

public class homework23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*** 겜블링 게임을 시작합니다 ***");
        while (true) {
            System.out.println("엔터키 입력");
            int firstNum =(int)(Math.random()*3);
            int secondNum =(int)(Math.random()*3);
            int thirdNum =(int)(Math.random()*3);
            int firstAnswer = scanner.nextInt(); 
            int secondAnswer = scanner.nextInt(); 
            int thirdAnswer = scanner.nextInt();
            boolean condition = (firstNum == firstAnswer) && (secondNum == secondAnswer) && (thirdNum == thirdAnswer);
            if(condition){
                System.out.println("성공! 대박났어요!");
                System.out.println("계속 하시겠습니까? (yes/no)");
                String yesOrNo = scanner.nextLine();
                if(yesOrNo.equals("no")){
                    System.out.println("게임을 종료합니다");
                    break;
                }
            }
        }
        scanner.close();
    }
}
