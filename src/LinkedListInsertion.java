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

    // size method
    public static int size(Node head) {
        Node temp = head;
        int count = 0;
        while (temp!=null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

    // insertAtFirst
    public static Node insertAtFirst(Node head, int data) {
        Node newNode =  new Node(data);
        if (head==null) {
            head = newNode;
            return head;
        }
        newNode.next = head;
        head = newNode;
        return head;
    }

    // insertAtLast
    public static Node insertAtLast(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return head;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode = head;
        return head;
    }

    // insertAtMid
    public static Node insertAtMid(Node head, int data) {
        Node newNode = new Node(data);
        int mid = (2+size(head)) / 2;
        if (mid==1) return insertAtFirst(head,data);
        else {
            Node temp = head;
            for (int i=mid; i>2; i--){
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        return head;
    }

    // insertAtPosition
    public static Node insertAtPosition(Node head,int data,int position) {
        int size = size(head);
        if (position<1 || position>(size+1)) throw new IllegalArgumentException("Exception");
        if (position==1) return insertAtFirst(head,data);
        else {
            Node newNode = new Node(data);
            Node temp = head;
            for (int i=2; i<position; i++){
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        return head;
    }

    // main method
    public static void main(String[] args) {
        LinkedListInsertion list = new LinkedListInsertion();
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

//        list.traverse(head);

//        System.out.println(size(head));

//        head = insertAtFirst(head,21);
//        list.traverse(head);

//        head = insertAtLast(head,21);
//        list.traverse(head);

//        head = insertAtMid(head,21);
//        list.traverse(head);

        head = insertAtPosition(head,21,3);
        list.traverse(head);
    }
}
