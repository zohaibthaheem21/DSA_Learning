public class LinkedListQueue {
    private static class Node {
        private Object data;
        private Node next = this;
        private Node pre = this;

        // constructor
        public Node (Object data) {
            this.data=data;
        }

        // constructor
        public Node(Object data, Node pre, Node next) {
            this.data=data;
            this.pre=pre;
            this.next=next;
        }
    }

    private int size = 0;

    private Node head = new Node(null);

    // isEmpty()
    public boolean isEmpty() {
        return size == 0;
    }

    // size()
    public int size() {
        return size;
    }

    // add()
    public void add(Object data) {
        head.pre.next = new Node(data,head.pre,head);
        head.pre = head.pre.next;
        size++;
    }

    // remove()
    public Object remove() {
        if (isEmpty()) throw new IllegalArgumentException("Exception");
        Object temp = head.next.data;
        head.next = head.next.next;
        size--;
        return temp;
    }

    // first()
    public Object first() {
        if (isEmpty()) throw new IllegalArgumentException("Exception");
        return head.next.data;
    }

    // main method
    public static void main(String[] args) {
        LinkedListQueue queue = new LinkedListQueue();

//        System.out.println("isEmpty "+queue.isEmpty());

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        while (!queue.isEmpty()) {
            System.out.println(queue.first());
            System.out.println(queue.remove());
        }

//        System.out.println("isEmpty "+queue.isEmpty());
//
//        System.out.println("Remove "+queue.remove());
//        System.out.println("Size "+queue.size);
//        System.out.println("first "+queue.first());
    }
}
