package page393_1;

public class NumberoneMain {
	public static void main(String[] args) {
		StudentApp a = new StudentApp("kitae", 23);
		StudentApp b = new StudentApp("kitae", 77);
		
		System.out.println(a);
		
		if(a.equals(b)) {
			System.out.println("same");
		}
		else {
			System.out.println("they are different");
		}
	}
}
