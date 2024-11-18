package page393_1;

public class StudentApp {
	String name;
	int stnum;
	StudentApp(String name, int stnum){
		this.name = name;
		this.stnum = stnum;
	}
	public String toString() {
		return "student number is " + stnum + " and name is " + name;
	}
	
}
