package page253_14;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VArrayEx v = new VArrayEx(5);
		System.out.println("capacity is " + v.getCapacity() + ", the size is " + v.getSize());
		
		for(int i = 0; i<7; i++) {
			v.add(i);
		}
		System.out.println("capacity is " + v.getCapacity() + ", the size is " + v.getSize());
		v.printAll();
		v.insert(3,100);
		v.insert(5,200);
		System.out.println("capacity is " + v.getCapacity() + ", the size is " + v.getSize());
		v.printAll();
		v.remove(10);
		System.out.println("capacity is " + v.getCapacity() + ", the size is " + v.getSize());
		v.printAll();
		for(int i =50;i<55;i++) {
			v.add(i);
		}
		System.out.println("capacity is " + v.getCapacity() + ", the size is " + v.getSize());
		v.printAll();
	}

}
