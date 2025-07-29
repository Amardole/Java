package Day1;

import java.util.Locale;

public class stringoperations {
    public static void main(String[] args) {
        String str = "Amar";
        String str1 = "amar";

        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.charAt(2));

        System.out.println(str == str1);
        System.out.println(str.equals(str1));
        System.out.println(str.compareToIgnoreCase(str1));
        System.out.println(str.compareTo(str1));






    }
}
