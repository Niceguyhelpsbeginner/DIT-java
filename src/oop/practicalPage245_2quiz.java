package oop;


class Cube {
	int horizonal;
	int vertical;
	int height;
	
	Cube(int horizonal,int vertical, int height){
		this.horizonal = horizonal;
		this.vertical = vertical;
		this.height = height;
	}
	int getVolume() {
		return horizonal * vertical * height;
	}
	void increse(int horizonalExpansion, int verticalExpansion,int heightExpansion) {
		horizonal += horizonalExpansion;
		vertical += verticalExpansion;
		height += heightExpansion;
	}
	boolean isZero() {
		if(horizonal *vertical*height == 0) {
			return true;
		}
		else {
			return false;
		}
	}
}

public class practicalPage245_2quiz {

	public static void main(String[] args) {
		
		Cube cube = new Cube(1,2,3);
		System.out.println("The cube is big as "+ cube.getVolume());
	}

}
