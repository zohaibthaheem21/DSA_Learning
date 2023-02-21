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

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        traverse(array);
        System.out.println();

//        array = insertAtFirst(array,21);
//        traverse(array);

        array = insertAtLast(array,21);
        traverse(array);
    }
}