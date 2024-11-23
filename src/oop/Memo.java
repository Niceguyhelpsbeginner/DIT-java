package oop;

public class Memo {
    String name;
    String time;
    String content;

    public Memo(String name, String time, String content) {
        this.name = name;
        this.time = time;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void show() {
        System.out.println(name + ", " + time + " " + content);
    }

    public boolean isSameName(Memo other) {
        return name.equals(other.name);
    }

    public int length() {
        return content.length();
    }
}
