package DSA;

public class SecLargeNo {
    public static void main(String[] args) {
        int a[] = {2, 6, 4, 9, 5, 48, 6};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i]>first){
                second = first;
                first = a[i];
            } else if (a[i] > second && a[i] != first) {
                second =a[i];
            }
        }
        System.out.println(second);
    }
}
