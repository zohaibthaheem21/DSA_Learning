public class ArrayMethods {
    // traverse
    public static void traverse(int[] array) {
        for (int i:array) {
            System.out.print(i+" ");
        }
    }

    // isAscending()
    public static boolean isAscending(int[] array) {
        for (int i=0; i<array.length-1; i++) {
            if (array[i]>array[i+1]) return false;
        }
        return true;
    }

    // isDescending()
    public static boolean isDescending(int[] array) {
        for (int i=0; i<array.length-1; i++) {
            if (array[i]<array[i+1]) return false;
        }
        return true;
    }

    // isSorted()
    public static boolean isSorted(int[] array) {
        if (isAscending(array) || isDescending(array)) return true;
        return false;
    }

    // maximum
    public static int maximum(int[] array) {
        int mx = 0;
        for (int i=0; i<array.length; i++) {
            if (array[mx]<array[i]) {
                mx = i;
            }
        }
        return array[mx];
    }

    // minimum
    public static int minimum(int[] array) {
        int mi = 0;
        for (int i=0; i<array.length; i++) {
            if (array[mi]>array[i]) {
                mi = i;
            }
        }
        return array[mi];
    }

    //  medium
    public static int medium(int[] array) {
        return array[(array.length-1) / 2];
    }

    //  copy()
    public static int[] copy(int[] array) {
        int[] newArray = new int[array.length];
        for (int i=0;  i<array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    // copyThrice()
    public static int[] copyThrice(int[] array) {
        int[] newArray = new int[array.length*3];
        int count = 0;
        for (int i=0; i<3; i++) {
            for (int j=0; j<array.length; j++) {
                newArray[count] = array[j];
                count++;
            }
        }
        return newArray;
    }

    // reverse()
    public static void reverse(int[] array) {
        for (int i=0; i<array.length/2; i++) {
            int temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
    }

    // main method
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        traverse(array);
        System.out.println();

//        System.out.println(isAscending(array));

//        System.out.println(isDescending(array));

//        System.out.println(isSorted(array));

//        System.out.println(maximum(array));

//        System.out.println(minimum(array));

//        System.out.println(medium(array));

//        array = copy(array);
//        traverse(array);

//        array = copyThrice(array);
//        traverse(array);

        reverse(array);
        traverse(array);
    }
}
