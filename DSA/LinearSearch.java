package DSA;

import java.lang.reflect.Array;

public class LinearSearch {
    public static void main(String []  args){

        //declaration of sorted array
        int [] SortedArray = {1,2,3,4,5,6,7,8,9};
        int element= 12;

        int result = linearsearch(SortedArray,element);
        if (result == -1)
            System.out.println("Element Not Found In Array");
        else
            System.out.println("Element "+element+" found at index : "+result);
    }

    //defining function for operation
    public static int  linearsearch(int arr[], int key){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }

}
