package oop;

class Tv {
	String name;
	int inch;
	int price;
	Tv (String name,int inch,int price){
		this.name = name;
		this.inch = inch;
		this.price = price;
	}
	
	public void show() {
		System.out.println("Television that is made by " + name + "and that is " + inch +"inch width" + "It's only "+ price + "000,000 won!");
	}
}

public class practicalPage245_1quiz {
	public static void main(String[] args) {
		Tv tv = new Tv("Samsung",50,300);
		tv.show();	
	}
}
