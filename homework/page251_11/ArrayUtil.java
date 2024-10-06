package page251_11;

public class ArrayUtil {
	public static int [] concat(int [] a, int [] b) {
		int a_length = a.length;
		int b_length = b.length;
		int [] concated = new int [a_length+ b_length];
		for(int i = 0; i <a_length; i++) {
			concated[i] = a[i];
		}
		for(int i = a_length; i < concated.length;i++) {
			concated[i] = b[i-a_length];
		}
		return concated;
	}
	public static void print(int[] a) {
		for(int i = 0; i<a.length;i++) {
			System.out.print(a[i]+ "  ");
		}
	}
}
