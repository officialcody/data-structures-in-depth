package GFG.Strings;

// Java Strings | Set 1
import java.util.*;

public class Ques6 {
    public static String conRevstr(String S1, String S2) {
        StringBuilder sb = new StringBuilder(S1);
        for(int i=0;i<S2.length();i++){
            sb.append(S2.charAt(i));
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.next();
        String str2 = scan.next();
        String convertedString = conRevstr(str1, str2);
        System.out.println("Converted string is: " + convertedString);
        scan.close();
    }
}
