package page503_13;

import java.io.*;
import java.util.Scanner;

public class FileExplorer {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("File explorer");
        Scanner scanner = new Scanner(System.in);
        String answer = "default";
        File f = new File("C:\\");
        
        while (!answer.equals("stop")) {
            System.out.println("[" + f.getPath() + "]");
            
            // 파일 목록 가져오기
            File[] files = f.listFiles();
            if (files != null) { // null 체크: 디렉터리가 비어있을 경우
                for (File file : files) {
                    if (file.isFile()) {
                        // 파일이면 "file" 출력
                        System.out.print("file ");
                        System.out.print(file.length() + " bytes ");
                        System.out.println(file.getName());
                    } else if (file.isDirectory()) {
                        // 디렉터리이면 "dir" 출력
                        System.out.print("dir ");
                        System.out.print(file.length() + " bytes ");
                        System.out.println(file.getName());
                    }
                }
            } else {
                System.out.println("Error: Unable to list files.");
            }
            
            // 사용자의 입력을 받음
            System.out.print("Enter command (or 'stop' to exit): ");
            answer = scanner.nextLine();
            
            // 디렉터리 변경을 처리하려면 아래 코드를 추가할 수 있습니다.
            if (answer.equals("up")) {
                // 상위 디렉터리로 이동
                f = f.getParentFile();
            } else if (answer.equals("down") && f.listFiles() != null) {
                // 특정 디렉터리로 이동
                System.out.print("Enter directory name: ");
                String dirName = scanner.nextLine();
                File newDir = new File(f, dirName);
                if (newDir.isDirectory()) {
                    f = newDir;
                } else {
                    System.out.println("Not a valid directory.");
                }
            }
        }
        
        scanner.close();
    }
}
