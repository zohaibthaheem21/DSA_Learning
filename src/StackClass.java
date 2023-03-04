public class StackClass {
    // Node class
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;

    // isEmpty()
    public static boolean isEmpty() {
        return head == null;
    }

    // push
    public void push(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // pop
    public static int pop() {
        if (isEmpty()) {
            return -1;
        }
        int top = head.data;
        head = head.next;
        return top;
    }

    // peek
    public static int peek() {
        if (isEmpty()) {
            return -1;
        }
        return head.data;
    }

    // main method
    public static void main(String[] args) {
        StackClass s = new StackClass();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}