package page252_13;

public class Seat {
	public String [] seated_status = {"--- ","--- ","--- ","--- ","--- ","--- ","--- ","--- ","--- ","--- "};
	void show() {
		for(int i = 0; i<seated_status.length; i++) {
			System.out.print(seated_status[i]);
		}
		System.out.println("");
	}
	void cancel(String name) {
		boolean isChanged = false;
		for(int i =0; i<seated_status.length;i++) {
			if(name.equals(seated_status[i])) {
				seated_status[i] = "--- ";
				isChanged = true;
			}
		}
		if(isChanged) {
			System.out.println("changed");			
		}
		else {
			System.out.println("unchanged");
		}
	}
}
