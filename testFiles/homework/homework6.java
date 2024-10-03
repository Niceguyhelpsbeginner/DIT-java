package homework;

import java.util.Scanner;

// p 113
public class homework6 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        double result;
        System.out.println("연산 입력");
        
        double firstNumber = scanner.nextDouble();
        String operation = scanner.next();
        double secondNumber = scanner.nextDouble();
        switch (operation) {
            case "더하기":
                result = firstNumber + secondNumber;
                System.out.println(firstNumber + "더하기" + secondNumber+ "의 계산 결과는 " + result);
                break;
                
            case "빼기":
                result = firstNumber - secondNumber;
                System.out.println(firstNumber + "빼기" + secondNumber+ "의 계산 결과는 " + result);
                break;
            
            case "나누기":
                result = firstNumber / secondNumber;
                System.out.println(firstNumber + "나누기" + secondNumber+ "의 계산 결과는 " + result);
                break;
                
            
            case "곱하기":
                result = firstNumber * secondNumber;
                System.out.println(firstNumber + "곱하기" + secondNumber+ "의 계산 결과는 " + result);
                break;
                    
            default:
                break;

            scanner.close();

        }
        
}

// public class homework6 {
//     public static void main(String args[]){
//         Scanner scanner = new Scanner(System.in);
//         double result;
//         System.out.println("연산 입력");
        
//         double firstNumber = scanner.nextDouble();
//         String operation = scanner.next();
//         double secondNumber = scanner.nextDouble();
//         if(operation.equals("더하기")){
//             result = firstNumber + secondNumber;
//             System.out.println(firstNumber + "더하기" + secondNumber+ "의 계산 결과는 " + result);
//         }
//         else if(operation.equals("빼기")){
//             result = firstNumber - secondNumber;
//             System.out.println(firstNumber + "빼기" + secondNumber+ "의 계산 결과는 " + result);
//         }
//         else if(operation.equals("곱하기")){
//             result = firstNumber * secondNumber;
//             System.out.println(firstNumber + "곱하기" + secondNumber+ "의 계산 결과는 " + result);
//         }
//         else if(operation.equals("나누기")){
//             result = firstNumber - secondNumber;
//             System.out.println(firstNumber + "나누기" + secondNumber+ "의 계산 결과는 " + result);
//         }  
//     }
// }
