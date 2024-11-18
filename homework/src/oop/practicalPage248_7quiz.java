package oop;

public class practicalPage248_7quiz {
    public static void main(String[] args) {
        Memo a = new Memo("Yu seung yeon", "10:10", "got java assignment");
        Memo b = new Memo("park chae won", "10:15", "exchange student to chicago!");
        Memo c = new Memo("kim gyeong mi", "11:30", "I fell in love!");

        a.show();
        if (a.isSameName(b)) {
            System.out.println("They are identical");
        } else {
            System.out.println("No they aren't identical");
        }

        System.out.println(c.getName() + "'s memo is as long as " + c.length() + " characters");
    }
}
