import java.security.PublicKey;

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

    // size()
    public int size() {
        return size;
    }

    // first()
    public Object first() {
        if (isEmpty()) throw new IllegalArgumentException("Exception");
        return a[0];
    }

    // add()
    public void add(Object data) {
        if (size == a.length) resize();
        a[size++] = data;
    }

    // remove()
    public Object remove() {
        if (isEmpty()) throw new IllegalArgumentException("Exception");
        Object data = a[0];
        System.arraycopy(a,1,a,0,--size);
        return data;
    }

    // resize()
    public void resize() {
        Object[] aa = a;
        a = new Object[size*2];
        System.arraycopy(a,0,aa,0,size);
    }

    // main method
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);

        System.out.println("isEmpty : "+queue.isEmpty());

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        while (!queue.isEmpty()) {
            System.out.println(queue.first());
            queue.remove();
        }

//        System.out.println("first : "+queue.first());

//        System.out.println("Size : "+queue.size());

//        System.out.println("remove : "+queue.remove());
    }
}
