package homework;

import java.util.Scanner;

public class homework8 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        byte status = Byte.parseByte(str,2);


        if((status & 0b00000001) != 0){
            System.out.println("전원 켜져 있음");
        }else{
            System.out.println("전원 꺼져있음");
        }
        if((status & 0b00000010) != 0){
            System.out.println("문 닫혀있음");
        }else{
            System.out.println("문 열려있음");
        }        if((status & 0b00000100) != 0){
            System.out.println("전구 정상 작동");
        }else{
            System.out.println("전구 손상됨");
        }        if((status & 0b00001000) == 0){
            System.out.println("냉장고 온도 3도 이상");
        }else{
            System.out.println("냉장고 온도 3도 미만");
        }        
    }
}