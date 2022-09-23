package GFG.Strings;

// Reverse a String
import java.util.*;

public class Ques4 {
    public static String reverseStr(String S) {
        StringBuilder sb = new StringBuilder("");
        for(int i=S.length()-1;i>=0;i--){
            sb.append(S.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String reversedString = reverseStr(str);
        System.out.println("Reversed String is: " + reversedString);
        scan.close();
    }
}
