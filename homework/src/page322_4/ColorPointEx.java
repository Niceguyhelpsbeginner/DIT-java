package page322_4;


public class ColorPointEx {
	public static void main(String[] args) {
		ColorPoint2 zeroPoint = new ColorPoint2();
		System.out.println("the dot is at " + zeroPoint.toString());
		
		ColorPoint2 cp = new ColorPoint2(10,10,"Red");
		cp.set("Blue");
		cp.set(10,20);
		System.out.println("the dot is at " + cp.toString());
		
		ColorPoint2 thresholdPoint = new ColorPoint2(100,100);
		System.out.println("The distance is " + cp.getDistance(thresholdPoint));
	}
}


class Point {
	
	private int x,y;
	public Point(int x, int y) {
		this.x =x;
		this.y =y;
		
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	protected void move(int x,int y) {
		this.x = x;
		this.y = y;
	}
}
class ColorPoint2 extends Point {
	private String color = "White";
	
	public ColorPoint2() {
		super(0,0);
	}
	public ColorPoint2(int x,int y, String color) {
		super(x,y);
		this.color = color;
	}
	public ColorPoint2(int x,int y) {
		super(x,y);
	}
	public void set(int x,int y) {
		move(x,y);
	}
	public void set(String color) {
		this.color = color;
	}
	public String toString() {
		return this.color + " and located at "+ getX() + "," + getY() ;
	}
	public double getDistance(ColorPoint2 colorPoint2) {
		return Math.sqrt(Math.pow(getX() - colorPoint2.getX(),2) + Math.pow(getY() - colorPoint2.getY(),2));
	}
}

class ColorPoint extends Point{
	public String color;
	public ColorPoint(int x, int y, String color) {
		super(x,y);
		this.color = color;
	}
	void setXY(int x, int y) {
		move(x,y);
	}
	void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return this.color + "(" + getX() + "," + getY() + ")";
	}
	
}



	
	

	
	
	
	
	
