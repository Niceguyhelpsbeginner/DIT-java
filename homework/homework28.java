package homework;
import java.util.Scanner;

public class homework28 {
    public static void main(String[] args) {
        String[] coffee = {"핫아메리카노", "아이스아메리카노", "카푸치노", "라떼"};
        int[] price = {3000, 3500, 4000, 5000};
        
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("주문>>");
            String order = scanner.nextLine();
            
            if (order.equals("그만")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            
            boolean found = false;
            for (int i = 0; i < coffee.length; i++) {
                if (order.startsWith(coffee[i])) {
                    found = true;
                    try {
                        int quantity = Integer.parseInt(order.substring(coffee[i].length()).trim());
                        int total = price[i] * quantity;
                        System.out.println("가격은 " + total + "원입니다.");
                    } catch (NumberFormatException e) {
                        System.out.println("잔 수는 양의 정수로 입력해주세요!");
                    }
                    break;
                }
            }
            
            if (!found) {
                System.out.println(order + "는 없는 메뉴입니다.");
            }
        }
        
        scanner.close();
    }
}
