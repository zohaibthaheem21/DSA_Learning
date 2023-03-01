public class LinkedListOtherMethods {
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

    // update method
    public void update(Node head,int target,int replacement) {
        for (Node n=head; n!=null; n=n.next) {
            if (n.data==target) {
                n.data = replacement;
                break;
            }
        }
    }

    // search method
    public boolean search(Node head, int target) {
        for (Node n=head; n!=null; n=n.next) {
            if (n.data==target) {
                return true;
            }
        }
        return false;
    }

    // isAscending method
    public boolean isAscending(Node head) {
        if (head==null || head.next==null) return true;
        for (Node n=head; n.next.next!=null; n=n.next) {
            if (n.data > n.next.data) {
                return false;
            }
        }
        return true;
    }

    // isDescending method
    public boolean isDescending(Node head) {
        if (head==null || head.next==null) {
            return true;
        }
        for (Node n=head; n.next.next!=null; n=n.next){
            if (n.data < n.next.data) return false;
        }
        return true;
    }

    // isSorted
    public boolean sorted(Node head) {
        return (isAscending(head) || isDescending(head));
    }

    // main method
    public static void main(String[] args) {
        LinkedListOtherMethods list = new LinkedListOtherMethods();
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

//        list.traverse(head);

//        System.out.println(size(head));

//        list.update(head,10,21);
//        list.traverse(head);

//        System.out.println(list.search(head,10));

//        System.out.println(list.isAscending(head));

//        System.out.println(list.isDescending(head));

        System.out.println(list.sorted(head));
    }
}