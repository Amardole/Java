//sum of Natural No Using Recursion functions
package Day1;

public class sumofnaturalnoRecu {
    public static void main(String[] args) {
        System.out.println(sumOfNaturalNo(6));

    }
    public static int sumOfNaturalNo(int n){
        if (n == 1)
            return 1;
        return n + sumOfNaturalNo(n-1);
    }
}
