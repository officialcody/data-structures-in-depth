package GFG.Strings;

// Print first letter of every word in the string
import java.util.*;

public class Ques34 {
    public static String firstAlphabet(String S) {
        StringBuilder sb = new StringBuilder("");
        sb.append(S.charAt(0));
        for(int i=1;i<S.length();i++){
            if(S.charAt(i) == ' ' && i < S.length()-1){
                i++;
                sb.append(S.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String firstAlphabets = firstAlphabet(str);
        System.out.println("First letter of each word : " + firstAlphabets);
        scan.close();
    }
}
