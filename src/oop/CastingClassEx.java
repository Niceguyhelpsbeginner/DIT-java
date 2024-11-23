package oop;

class Person extends Object{
	String name;
	String id;
	public Person(String name) {
		super();
		this.name = name;
	}
}
class Student extends Person {
	int grade;
	String department;
	
	public Student(String name) {
		super(name);
	}
}


public class CastingClassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p;
		Student st = new Student("John");
		//parents(ancestor)     children
		p = st;
	}

}










