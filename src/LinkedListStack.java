public class LinkedListStack {

    // Node class
    public static class Node {
        int data;
        Node next;

        // Node class constructor
        public Node(int data) {
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;

    // isEmpty()
    public boolean isEmpty() {
        return head==null;
    }

    // push()
    public void push(int data) {
        Node newNode =  new Node(data);
        if (isEmpty()) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // pop()
    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        int top = head.data;
        head = head.next;
        return top;
    }

    // peek()
    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return head.data;
    }

    // search()
    public boolean search(int value) {
        for (Node n=head; n!=null; n=n.next) {
            if (n.data == value) {
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
        LinkedListStack list = new LinkedListStack();

        // isEmpty()
//        System.out.println(list.isEmpty());

        // push()
        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);
        list.push(50);

//        list.display();

        // isEmpty()
//        System.out.println(list.isEmpty());

        // peek()
//        System.out.println(list.peek());

        // pop()
//        System.out.println(list.pop());

        // peek()
//        System.out.println(list.peek());

        // pop()
//        System.out.println(list.pop());

        // search()
//        System.out.println(list.search(100));
    }
}