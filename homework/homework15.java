package homework;
// 양의 정수 10개를 입력받아 일차원 배열에 저장하는데, 모든 자릿수의 합이 9인것을 출력하라

import java.util.Scanner;

// 9의 배수는 모든 자리의 수를 합했을때 9가 나온다. 그러므로 9의 배수인지 체크만 하면 된다.
public class homework15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array[] = new int[10]; 
        System.out.println("양의 정수 10개 입력");
        for(int i = 0; i< 10; i++){
            array[i] = scanner.nextInt();
        }
        System.out.print("모든 자릿수를 합했을 때 9가 나오는 것은");
        for(int i = 0; i< 10; i++){
            if(array[i] % 9 == 0){
                System.out.print(array[i]+ "    ");
            }
        }
        scanner.close();

    }    
}
