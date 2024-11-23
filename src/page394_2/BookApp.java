package page394_2;

public class BookApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book a = new Book("kitae", "good java", "hajin");
		Book b = new Book("kitae", "good java", "yeorin");
		
		System.out.println(a);
		System.out.println(b);
		if(a.equals(b)) {
			System.out.println("same");
		}
		else {
			System.out.println("diff");
		}
	}

}
