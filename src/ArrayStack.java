public class ArrayStack {
    int[] a;
    int size;
    int top;

    // constructor
    public ArrayStack(int size) {
        this.size = size;
        top = -1;
        a = new int[size];
    }

    // push()
    public void push(int data) {
        if (top == size-1) throw new IllegalArgumentException("Exception");
        top++;
        a[top] = data;
    }

    // main method
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
    }
}
