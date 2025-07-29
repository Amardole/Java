package Day1;

public class FactUsingRecursion {
    public static void main(String[] args) {
        System.out.println(factorial(6));
    }

    public static int factorial(int n){
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n-1); //using recursion
    }

}
