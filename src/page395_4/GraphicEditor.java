package page395_4;

class Shape {
	public void draw() {
		System.out.println("Shape");
	}
	
}

class Circle extends GraphicEditor {
	public void draw() {
		System.out.println("Circle");
	}
	
}

public class GraphicEditor {
	
	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.draw();
	}
}