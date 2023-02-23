// structure of Node
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data=data;
        this.next=null;
    }
}
public class LinkedListInsertion {
    // traverse
    public void traverse(Node head) {
        if (head==null) throw new IllegalArgumentException("Exception");
        else {
            Node temp = head;
            while (temp!=null) {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
    }
    // main method
    public static void main(String[] args) {
        LinkedListInsertion list = new LinkedListInsertion();
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        list.traverse(head);
    }
}
