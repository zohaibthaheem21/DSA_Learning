public class BinaryTree {
    Object root;
    BinaryTree left,right;


    // constructor with one parameter
    BinaryTree(Object root) {
        this.root=root;
    }

    // constructor with three parameters
    BinaryTree(Object root, BinaryTree left, BinaryTree right) {
        this.root=root;
        this.left=left;
        this.right=right;
    }

    // getters

    Object getRoot() {
        return root;
    }

    BinaryTree getLeft() {
        return left;
    }

    BinaryTree getRight() {
        return right;
    }


    // isLeaf()
    boolean isLeaf() {
        return (left==null && right==null);
    }

    // toString()
    public String toString() {
        StringBuffer buf = new StringBuffer();
        if (left!=null) {
            buf.append(left.toString() + ",");
        }   buf.append(root);
            if (right!=null) {
                buf.append(right.toString());
            }
            return buf+" ";
    }

    // preOrder()
    public String preOrder() {
        StringBuffer buf = new StringBuffer();
        buf.append(root);
        if (left!=null) {
            buf.append(left.preOrder()+",");
        }
        if (right!=null) {
            buf.append(right.preOrder());
        }
        return buf+" ";
    }

    // postOrder
    public String postorder() {
        StringBuffer buf = new StringBuffer();
        if (left!=null) {
            buf.append(left.postorder()+",");
        }
        if (right!=null) {
            buf.append(right.postorder());
        }
        buf.append(root);
        return buf+" ";
    }

    // Search()
    public boolean Search(Object data) {
        String flag = toString();
        return flag.contains(data.toString());
    }

    // size()
    public int size() {
        if (left==null && right==null) {
            return 1;
        }
        if (left==null) {
            return 1 + right.size();
        }
        if (right==null) {
            return 1 + left.size();
        }
        return 1 + left.size() + right.size();
    }

    // height()
    public int height() {
        if (root==null) {
            return -1;
        }

        int leftC = 0, rightC = 0;

        if (left!=null) {
            leftC = 1 + left.height();
        }
        if (right!=null) {
            rightC = 1 + right.height();
        }
        return leftC > rightC ? leftC : rightC;
    }

    // isFull()
    public boolean isFull() {
        return size()==(int)Math.pow(2,height()+1) - 1;
    }

    // main method
    public static void main(String[] args) {
        BinaryTree c = new BinaryTree("c");
        BinaryTree d = new BinaryTree("d");
        BinaryTree b = new BinaryTree("b",c,d);
        BinaryTree f = new BinaryTree("f");
        BinaryTree e = new BinaryTree("e",null,f);
        BinaryTree a = new BinaryTree("a",b,e);

        // check either isLeaf or not
//        System.out.println(b.isLeaf());

        System.out.println(a.toString());
        System.out.println(a.preOrder());
        System.out.println(a.postorder());

        System.out.println(a.size());

        System.out.println(a.height());

    }
}