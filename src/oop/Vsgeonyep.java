package oop;

class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    protected void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class ColorPoint2 extends Point {
    private String color;

    public ColorPoint2(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    public void set(String color) {
        this.color = color;
    }

    public void set(int x, int y) {
        move(x, y);
    }

    @Override
    public String toString() {
        return color + "색의 (" + getX() + "," + getY() + ")의 점";
    }

    public double getDistance(Point other) {
        int dx = getX() - other.getX();
        int dy = getY() - other.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
}

public class Vsgeonyep{
    public static void main(String[] args) {
        ColorPoint2 zeroPoint = new ColorPoint2(0, 0, "WHITE"); // (0,0) 위치의 "WHITE" 색점
        System.out.println(zeroPoint.toString() + "입니다.");

        ColorPoint2 cp = new ColorPoint2(10, 10, "RED"); // (10,10) 위치의 "RED" 색점
        cp.set("BLUE");
        cp.set(10, 20);
        System.out.println(cp.toString() + "입니다.");

        ColorPoint2 thresholdPoint = new ColorPoint2(100, 100, "BLACK"); // (100,100) 위치의 "BLACK" 점
        System.out.println("cp에서 임계점까지의 거리는 " + cp.getDistance(thresholdPoint));
    }
}
