public class ArrayQueue {
    private Object[] a;
    private int size;

    // constructor
    public ArrayQueue(int capacity) {
        if (capacity<1) throw new IllegalArgumentException("Exception");
        a = new Object[capacity];
    }

    // isEmpty()
    public boolean isEmpty() {
        return size == 0;
    }



    // main method
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);

        System.out.println(queue.isEmpty());
    }
}
