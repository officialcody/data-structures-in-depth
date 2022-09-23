package GFG.Strings;

// C++ Strings
import java.util.*;

public class Ques13 {
    public static String conCat(String s1 , String s2) {
        return s1+s2;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.next();
        String str2 = scan.next();
        String concatString = conCat(str1, str2);
        System.out.println("Concatenated String: " + concatString);
        scan.close();
    }
}
