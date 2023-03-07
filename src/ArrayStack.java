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

    // pop()
    public int pop() {
        if (top<0) throw new IllegalArgumentException("Exception");
        int temp = a[top];
        top--;
        return temp;
    }

    // peek()
    public int peek() {
        if (top<0) throw new IllegalArgumentException("Exception");
        return a[top];
    }

    // isEmpty()
    public boolean isEmpty() {
        if (top<0) return true;
        return false;
    }

    // getSize()
//    public int getSize() {
//        return size;
//    }

    // search()
    public boolean search(int value) {
        for (int i=0; i<a.length; i++) {
            if (a[i] == value) {
                return true;
            }
        }
        return false;
    }

    // display()
    public void display() {
        while (!isEmpty()) {
            System.out.println(peek());
            pop();
        }
    }

    // main method
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);

//        System.out.println(stack.isEmpty());

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

//        System.out.println(stack.isEmpty());

//        System.out.println(stack.peek());
//
//        System.out.println(stack.pop());
//
//        System.out.println(stack.pop());

//        while (!stack.isEmpty()) {
//            System.out.println(stack.peek());
//            stack.pop();
//        }

//        stack.display();

//        System.out.println(stack.search(40));

//        System.out.println(stack.search(45));

        System.out.println(stack.size);
    }
}
