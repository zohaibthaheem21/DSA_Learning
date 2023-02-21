public class ArrayDeletion {
    // traverse
    public static void traverse(int[] array) {
        for (int i:array) {
            System.out.print(i+" ");
        }
    }

    // deleteFirst
    public static int[] deleteFirst(int[] array) {
        int[] newArray = new int[array.length-1];
        for (int i=1; i<array.length; i++) {
            newArray[i-1] = array[i];
        }
        return newArray;
    }

    // deleteLast
    public static int[] deleteLast(int[] array) {
        int[] newArray = new int[array.length-1];
        for (int i=0; i<newArray.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    // deleteMid
    public static int[] deleteMid(int[] array) {
        int[] newArray = new int[array.length-1];
        int mid = (newArray.length-1) / 2;
        int count = 0;
        for (int  i=0; i<array.length; i++) {
            if (i==mid) continue;
            newArray[count] = array[i];
            count++;
        }
        return newArray;
    }

    // deleteAtPosition
    public static int[] deleteAtPosition(int[] array, int position) {
        if (position<1 || position>array.length+1) throw new IllegalArgumentException("Exception: insert correct position");
        int[] newArray = new int[array.length-1];
        int count = 0;
        for (int i=0; i<array.length; i++) {
            if (i==position-1) continue;
            newArray[count] = array[i];
            count++;
        }
        return newArray;
    }

    // deleteAtIndex
    public static int[] deleteAtIndex(int[] array, int index) {
        if (index<0 || index>array.length-1) throw new IllegalArgumentException("Exception: insert correct index");
        int[] newArray = new int[array.length-1];
        int count = 0;
        for (int i=0; i<array.length; i++) {
            if (i==index) continue;
            newArray[count] = array[i];
            count++;
        }
        return newArray;
    }

    // deleteTarget
    public static int[] deleteTarget(int[] array, int target) {
        int[] newArray = new int[array.length-1];
        int count = 0;
        for (int i=0;  i<array.length; i++) {
            if (array[i]==target) continue;
            newArray[count] = array[i];
            count++;
        }
        return newArray;
    }

    // main method
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        traverse(array);
        System.out.println();

//        array = deleteFirst(array);
//        traverse(array);

//        array = deleteLast(array);
//        traverse(array);

//        array = deleteMid(array);
//        traverse(array);

//        array = deleteAtPosition(array,5);
//        traverse(array);

//        array = deleteAtIndex(array,5);
//        traverse(array);

        array = deleteTarget(array,5);
        traverse(array);
    }
}