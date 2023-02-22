public class ArraySearching {
    // traverse
    public static void traverse(int[] array) {
        for (int i:array) {
            System.out.print(i+" ");
        }
    }

    // linearSearch
    public static int linearSearch(int[] array,int target) {
        for (int i=0; i<array.length; i++) {
            if (array[i]==target) {
                return i;
            }
        }
        return -1;
    }

    // binarySearch
    public static int binarySearch(int[] array,int target) {
        int mi = 0;
        int mx = array.length-1;
        int m;
        while (mi<mx) {
            m = (mi+mx) / 2;
            if (target==array[m]) return m;
            else if (target<array[m]) mi = m+1;
            else mx = m-1;
        }
        return -1;
    }

    // update
    public static void update(int[] array,int target,int replacement) {
        int i = linearSearch(array,target);
        if (i<0) return;
        array[i] = replacement;
    }

    // main method
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        traverse(array);
        System.out.println();

//        System.out.println(linearSearch(array,5));

//        System.out.println(binarySearch(array,5));

        update(array,5,21);
        traverse(array);
    }
}
