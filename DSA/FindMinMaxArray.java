package DSA;
public class FindMinMaxArray {
    public static void main(String[] args) {
        int [] arr = {9,14,85,2,56,7,88,99,4,5,6,7};

        int maxresult = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>maxresult)
                maxresult = arr[i];
        }
        System.out.println("Max No Is: "+maxresult);

        int minresult = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minresult)
                minresult = arr[i];
        }
        System.out.println("Min No Is: "+minresult);
    }
}
