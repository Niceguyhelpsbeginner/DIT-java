package Competition;


class Rectangle{
	int x,y,width,height;
	public Rectangle(int x,int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		
	}
	public boolean isSquare() {
		if(this.width == this.height) {
			return true;
		}
		return false;
	}
	public boolean contains(Rectangle r) {
		return this.x <= r.x && this.x + this.width >= r.x + r.width  
				&& this.y <= r.y && this.y + this.height >= r.y +r.height; 
	}
	public void show() {
		System.out.println("("+ this.x + "," + this.y + "), The area is " + this.width + "x" + this.height);
	}
}
public class Withgeon {
	public static void main(String[] args) {
		Rectangle a = new Rectangle(3,3,6,6);
		Rectangle b = new Rectangle(4,4,2,3);
		
		a.show();
		
		if(a.isSquare()) {
			System.out.println("a is square");
			
		}
		else
			System.out.println("a is Rectangle");
		if(a.contains(b)) System.out.println("a includes b");
	}
	
}
