public class ArrayInsertion {
    // traverse method
    public static void traverse(int[] array) {
        for (int i:array) {
            System.out.print(i+" ");
        }
    }

    // insertAtFirst
    public static int[] insertAtFirst(int[] array,int value) {
        int[] newArray = new int[array.length+1];
        newArray[0] = value;
        for (int i=1; i<newArray.length;  i++) {
            newArray[i] = array[i-1];
        }
        return newArray;
    }

    // insertAtLast
    public static int[] insertAtLast(int[] array, int value) {
        int[] newArray = new int[array.length+1];
        newArray[newArray.length-1] = value;
        for (int i=0; i<array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    // insertAtMid
    public static int[] insertAtMid(int[] array, int value) {
        int[] newArray = new int[array.length+1];
        int mid = (newArray.length-1) / 2;
        newArray[mid] = value;
        int count = 0;
        for (int i=0; i<newArray.length; i++) {
            if (i!=mid) {
                newArray[i] = array[count];
                count++;
            }
        }
        return newArray;
    }

    // insertAtPosition
    public static int[] insertAtPosition(int[] array, int value, int position) {
        if (position<1 || position>array.length+1) throw new IllegalArgumentException("Exception: insert correct position");
        int[] newArray = new int[array.length+1];
        newArray[position-1] = value;
        int count = 0;
        for (int i=0; i<newArray.length; i++) {
            if (i!=position-1) {
                newArray[i] = array[count];
                count++;
            }
        }
        return newArray;
    }

    // insertAtIndex
    public static int[] insertAtIndex(int[] array, int value, int  index) {
        if (index<0 || index>array.length-1) throw new IllegalArgumentException("Exception: insert correct index");
        int[] newArray = new int[array.length+1];
        newArray[index] = value;
        int count = 0;
        for (int i=0; i<newArray.length; i++) {
            if (i!=index) {
                newArray[i] = array[count];
                count++;
            }
        }
        return newArray;
    }

    // main method
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        traverse(array);
        System.out.println();

//        array = insertAtFirst(array,21);
//        traverse(array);

//        array = insertAtLast(array,21);
//        traverse(array);

//        array = insertAtMid(array,21);
//        traverse(array);

//        array = insertAtPosition(array,21,7);
//        traverse(array);

        array = insertAtIndex(array,21,7);
        traverse(array);
    }
}