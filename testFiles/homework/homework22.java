package homework;

import java.util.Scanner;

public class homework22 {
    public static void main(String[] args) {
        String course [] = {"C","C++","python","java","html5"};
        String grade [] = {"A","B+","B","A+","D"};
        Scanner scanner = new Scanner(System.in);
        while(true){
        System.out.println("과목");
        String courseName = scanner.next();
        for(int i = 0; i <course.length; i++){
            if(course[i].equals(courseName)){
                System.out.println(grade[i]);
            }
        }
            if (courseName.equals("그만")) {
                break;
            }
        }
        
    }
}
