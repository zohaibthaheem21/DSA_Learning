public class LinkedListDeletion {
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

    // deleteFirst
    public static Node deleteFirst(Node head) {
        if (head==null || head.next==null) {
            return null;
        }
        return head.next;
    }

    // deleteLast
    public static Node deleteLast(Node head) {
        if (head==null || head.next==null) {
            return null;
        }
        else {
            Node temp = head;
            while (temp.next.next!=null) {
                temp = temp.next;
            }
            temp.next = null;
            return head;
        }
    }

    // deleteMid
    public static Node deleteMid(Node head) {
        if (head==null || head.next==null) {
            return null;
        }
        if (head.next.next!=null) {
            return head.next;
        }
        int mid = (1+size(head)) / 2;
        Node temp = head;
        for (int i=mid; i>2; i--) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }

    // deletePosition
    public static Node deletePosition(Node head,int position) {
        if (position<1 || position>(size(head))) throw new IllegalArgumentException("Exception");
        if (head==null) throw new IllegalArgumentException("Exception");
        if (position==1) return head.next;
        Node temp = head;
        for (int i=position; i>2; i--) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }

    // deleteTarget
    public static Node deleteTarget(Node head,int target) {
        if (head==null) return null;
        if (head.data==target) return head.next;
        for (Node n=head; n.next!=null; n=n.next) {
            if (n.next.data==target) {
                n.next = n.next.next;
                break;
            }
        }
        return head;
    }

    // main method
    public static void main(String[] args) {
        LinkedListDeletion list = new LinkedListDeletion();
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

//        list.traverse(head);

//        System.out.println(size(head));

//        head = deleteFirst(head);
//        list.traverse(head);

//        head = deleteLast(head);
//        list.traverse(head);

//        head = deleteMid(head);
//        list.traverse(head);

//        head = deletePosition(head,3);
//        list.traverse(head);

        head = deleteTarget(head,30);
        list.traverse(head);
    }
}