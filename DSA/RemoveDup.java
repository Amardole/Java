//here we remove duplicate numbers from sorted array.

package DSA;

public class RemoveDup {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,4,5,6,7,8,8,9,15,56,88,88,99};
        int newarr[]=new int[arr.length];
        int no = Integer.MIN_VALUE;
        int j =0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > no){
                no = arr[i];
                newarr[j++] = arr[i];
            }
        }

        //New Array element display loop
        for (int i = 0; i < j; i++) {
            System.out.println(newarr[i]);
        }
    }
}
