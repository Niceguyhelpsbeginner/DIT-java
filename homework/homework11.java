package homework;


//p 166. 2번 문제

// 2-1 이 코드는 양의 4의 배수가 배열에 있을때 마다 출력하는 코드이다.
//2-3 
// public class homework11 {
//     public static void main(String[] args) {
//         int n[] = {1,-2,6,20,5,72,-16,256};
//         int i = 0;
//         while (i<n.length) {
//             if(n[i] > 0 && n[i] % 4 ==0){
//                 System.out.println(n[i] + "");
//             }
//             i++;
//         }
//     }
// }
//2-4
public class homework11 {
    public static void main(String[] args) {
        int n[] = {1,-2,6,20,5,72,-16,256};
        int i = 0;
        do {
            i++;
            if(n[i] > 0 && n[i] % 4 ==0){
                System.out.println(n[i] + "");
            }
        }while (i<n.length);
    }
}
