package GFG.Strings;

// Reverse a String
import java.util.*;

public class Ques25 {
    public static String reverseWord(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            sb.append(str.charAt(i));
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String reversedString = reverseWord(str);
        System.out.println("Reversed String => " + reversedString);
        scan.close();
    }
}
