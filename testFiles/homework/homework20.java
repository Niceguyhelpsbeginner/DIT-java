package homework;

import java.util.Scanner;

// 구구단 퀴즈의 답을 검사하는 프로그램을 작성하라 랜덤하게 구구단의 답을 입력받아 정답인지 판단한다. 3번 틀리면 종료한다.
public class homework20 {
    public static void main(String[] args) {
        System.out.println("****구구단을 맞추는 퀴즈입니다. ****");
        int life = 3;
        Scanner scanner = new Scanner(System.in); 
        while(life > 0){
            int n = (int)(Math.random()*9 + 1);
            int m = (int)(Math.random()*9 + 1);
            System.out.print(n + "x" + m + "=");
            int answer = scanner.nextInt(); 
            if(n*m != answer){
                life -=1;
                System.out.println(3-life+"번 틀렸습니다. 분발하세요");
            }
            else{
                System.out.println("정답입니다. 잘했습니다.");
            }

        }
        System.out.println("3번 틀렸습니다. 퀴즈 종료합니다.");
        scanner.close();
    }    
}
