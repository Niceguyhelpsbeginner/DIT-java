package page501_10;

import java.io.*;
import java.util.*;

public class PhoneReader {

    public static void main(String[] args) {
        int c;
        int newLineCounter = 0;  // 라인 번호
        HashMap<String, String> list = new HashMap<>();
        boolean isNameTurn = true;
        String name = "";
        String phoneNumber = "";

        try {
            FileReader fin = new FileReader("C:\\Users\\seong\\OneDrive\\Desktop\\numbers.txt");
            
            while ((c = fin.read()) != -1) {
                char currentChar = (char) c;

                if (currentChar == '\n') {
                    // 새로운 줄에서 name과 phoneNumber를 HashMap에 저장
                    if (!name.isEmpty() && !phoneNumber.isEmpty()) {
                        list.put(name.trim(), phoneNumber.trim());
                    }
                    newLineCounter++;
                    isNameTurn = true;  // 이름을 읽을 차례로 되돌림
                    name = "";
                    phoneNumber = "";
                } else if (currentChar == ' ') {
                    isNameTurn = false;  // 공백을 만나면 전화번호 부분으로 전환
                } else {
                    // 이름 또는 전화번호에 문자를 추가
                    if (isNameTurn) {
                        name += currentChar;
                    } else {
                        phoneNumber += currentChar;
                    }
                }
            }

            // 마지막 줄 처리 (파일 끝에서 줄 바꿈이 없는 경우 처리)
            if (!name.isEmpty() && !phoneNumber.isEmpty()) {
                list.put(name.trim(), phoneNumber.trim());
            }

            fin.close();
            System.out.println("Read " + newLineCounter + " phone numbers.");

        } catch (IOException e) {
            System.out.println("Error reading file!");
        }

        Scanner scanner = new Scanner(System.in);
        String answer;
        while (true) {
            System.out.print("Enter name (or 'stop' to quit): ");
            answer = scanner.nextLine();
            
            if (answer.equals("stop")) {
                break;
            }

            // 입력한 이름에 해당하는 전화번호 출력
            String phone = list.get(answer);
            if (phone != null) {
                System.out.println("Phone Number: " + phone);
            } else {
                System.out.println("Name not found!");
            }
        }

        scanner.close();
    }
}
