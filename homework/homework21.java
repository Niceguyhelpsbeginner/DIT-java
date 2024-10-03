package homework;

import java.util.Scanner;

public class homework21 {
    public static void main(String[] args) {
        String boyMiddleList[] = {"기","민","용","종","현","진","재","승","소","상","지"};
        String boyLastList[] = {"태","진","광","혁","우","철","빈","준","구","호","석"};
        String girlMiddleList[] = {"은","원","경","수","현","예","여","송","서","채","하"};
        String girlLastList[] = {"진","연","경","서","리","숙","미","원","린","희","수"};

        System.out.println("** 작명 프로그램이 실행됩니다. ***");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        while (!answer.equals("그만")) {
            System.out.println("남/여 선택");
            if(answer.equals("남")){
                System.out.println("성 입력");
                String Family_name = scanner.next();
                int index_mid = (int)(Math.random()*boyMiddleList.length);
                int index_last = (int)(Math.random()*boyLastList.length);
                System.out.println(Family_name + "추천이름: "+ boyMiddleList[index_mid] + boyLastList[index_last]);
            }
            else if(answer.equals("여")){
                System.out.println("성 입력");
                String Family_name = scanner.next();
                int index_mid = (int)(Math.random()*girlMiddleList.length);
                int index_last = (int)(Math.random()*girlLastList.length);
                System.out.println(Family_name + "추천이름: "+ girlMiddleList[index_mid] + girlLastList[index_last]);
            }
            else{
                System.out.println("남/여/그만중에서 입력하세요!");
            }
        }
        scanner.close();
    }
}
