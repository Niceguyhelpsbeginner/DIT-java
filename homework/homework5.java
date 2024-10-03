package homework;
// 2nd practice
import java.util.Scanner;

//110 page practice 
public class homework5 {
    static public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer;
        int smaller = 0;
        int bigger = 99;
        int correct = 77;
        System.out.println("수를 결정하였습니다. 맞춰보세요");
        System.out.println(smaller + "-" + bigger);
        answer = scanner.nextInt();
        while (true) {
            if(answer < correct){
                smaller = answer;
                System.out.println("더 높게");
            }
            else if(answer > correct){
                bigger = answer;
                System.out.println("더 낮게");
            }
            else{
                break;
            }
            System.out.println(smaller + "-" + bigger + "의 사이의 수");
            answer = scanner.nextInt();
        }
        
        System.out.println("정답!");
    }
}
