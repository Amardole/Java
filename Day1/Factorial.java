package Day1;

public class Factorial {
    public static void main(String[] args) {
        int out =fact(6);
        System.out.println(out);

    }
    public static int fact(int n){
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result *i;
        }
        return result;
    }
}
