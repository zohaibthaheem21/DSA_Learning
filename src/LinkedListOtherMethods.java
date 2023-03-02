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

    // highest method
    public int highest(Node head){
        int highest=head.data;
        for(Node n=head.next;n!=null;n=n.next){
            if(highest<n.data)highest=n.data;
        }
        return highest;
    }

    // lowest method
    public int lowest(Node head){
        int lowest=head.data;
        for(Node n=head.next;n!=null;n=n.next){
            if(lowest>n.data)lowest=n.data;
        }
        return lowest;
    }

    // mid method
    public int mid(Node head){
        if(head==null)throw new IllegalArgumentException("LinkedList does not exist");
        int mid=(1+size(head))/2;
        Node temp=head;
        for(int i=mid;i>1;i--){
            temp=temp.next;
        }
        return temp.data;
    }
    public int frequency(Node head,int value) {
        int count = 0;
        for (Node n=head;n!=null; n=n.next) {
            if (n.data==value) {
                count++;
            }
        }
        return count;
    }

    // frequency

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

//        System.out.println(list.sorted(head));

//        System.out.println(list.highest(head));

//        System.out.println(list.lowest(head));

//        System.out.println(list.mid(head));

        System.out.println(list.frequency(head,10));
    }
}