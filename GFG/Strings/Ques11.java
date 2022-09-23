package GFG.Strings;

// Remove vowels from string
import java.util.*;

public class Ques11 {
    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ? true : false;
    }

    public static String removeVowels(String S) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<S.length();i++){
            if(isVowel(S.charAt(i))){
                continue;
            } else {
                sb.append(S.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String withoutVowels = removeVowels(str);
        System.out.println("Without vowels string: " + withoutVowels);
        scan.close();
    }
}
