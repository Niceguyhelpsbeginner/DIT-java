package Competition;




public class Star {
	public static void main(String[] args) {
		for(int i =1; i <=10; i++) {
			for(int j = 10; j>i; j--) {
				System.out.print(" ");
			}
			for(int m = 0;m <i;m++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
