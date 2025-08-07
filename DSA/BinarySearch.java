package DSA;

public class BinarySearch {
    public static void main(String[] args) {
        int Numbers[] = {12,22,33,35,56,89,99,100,110,120,130,140,160,180,190,200,201,230,260,280,290};
        int key = 160;
        int res = binarySearch(Numbers,key);
        if (res == -1)
            System.out.println("Element Not Found In array");
        else
            System.out.println("Element "+ key+" Found at index "+res);
    }

    public static int binarySearch(int [] arr , int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = (start+end)/2;

            if (arr[mid] == key)
                return mid;
            else if (key < arr[mid]) {
                end= mid-1;
            }
            else
                start = mid+1;
        }
        return  -1;
    }

}
