package homework;

import java.util.Scanner;

public class homework9 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int byteValue = scanner.nextInt();
        System.out.println("자동차 상태 입력");
        int temperature = byteValue;
        if(byteValue > 256){
            System.out.println("아무 의미 없음");
        }
        if(byteValue < 256 && byteValue >128) {
            System.out.println("달리는중");
            temperature -= 128;
            byteValue -= 128;
        }
        else {
            System.out.println("멈춤");
        }
        
        if (byteValue< 128 && byteValue > 64){
            System.out.println("에어컨");
            temperature -= 64;
            byteValue -= 64;
        }
        else {
            System.out.println(temperature);
            System.out.println("에어컨 끔");
        }
        System.out.println("온도는 " + temperature);
    }
}
