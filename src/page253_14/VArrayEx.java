package page253_14;

public class VArrayEx {
    int capacity;
    int size = 0;
    int[] array;

    VArrayEx(int capacity) {
        this.capacity = capacity;
        this.array = new int[capacity];
    }

    int getCapacity() {
        return capacity;
    }

    int getSize() {
        return size;
    }

    void add(int n) {
        if (size >= capacity) {
            resize();
        }
        array[size] = n;
        size++;
    }

    void resize() {
        capacity *= 2;
        int[] newArray = new int[capacity];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }

    void printAll() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    void insert(int index, int value) {
        if (index >= 0 && index < size) {
            array[index] = value;
        }
    }

    void remove(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            array[size - 1] = 0; 
            size--;
        }
    }
}
