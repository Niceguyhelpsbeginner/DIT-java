package page322_5;


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

class Point3D extends Point {
	int z;
	public Point3D(int x, int y, int z) {
		super(x,y);
		this.z = z;
	}
	public void moveUp(int z) {
		this.z += z;
	}
	public void moveDown(int z) {
		this.z -= z;
	}
	public void move(int x, int y) {
		move(x,y);
	}
	public void move(int x, int y, int z) {
		move(x,y);
		this.z = z;
	}
	public String toString() {
		return "The dot is at " + getX() + "," + getY();
	}
}

public class ColorPoint5 {
	public static void main(String[] args) {
		Point3D p = new Point3D(3,2,1);
		System.out.println(p.toString());
		
		p.moveUp(3);
		System.out.println(p.toString());
		
		p.moveDown(2);
		System.out.println(p.toString());
		
		p.move(5,5);
		System.out.println(p.toString());
		
		p.move(100,200,300);
		System.out.println(p.toString());
		
	}
}
