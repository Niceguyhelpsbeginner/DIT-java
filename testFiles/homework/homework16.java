package homework;

public class homework16 {
    public static void main(String[] args) {
        int array[] = new int[10];
        int sum = 0; 
        for (int i = 0; i < 10; i++) {
            array[i] = (int) (Math.random() * 9) + 11;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(array[i]);
            sum += array[i];
        }
        double avg = (double)sum / 10;
        System.out.println(avg);
    }    
}
