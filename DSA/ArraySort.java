package DSA;

public class ArraySort {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 5, 6};
        boolean isSorted = true;

        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i - 1]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted)
            System.out.println("Array is Sorted");
        else
            System.out.println("Array is Not Sorted");
    }
}
