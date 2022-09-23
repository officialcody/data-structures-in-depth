package GFG.Strings;

// Program to print reciprocal of letters - copy
import java.util.*;

public class Ques24 {
    public static String reciprocalString(String S){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<S.length();i++){
            char currentCharacter = S.charAt(i);
            if(currentCharacter >= 'a' && currentCharacter <= 'z') {
                sb.append((char)('z'-currentCharacter+'a'));
            } else if(currentCharacter >= 'A' && currentCharacter <= 'Z') {
                sb.append((char)('Z'-currentCharacter+'A'));
            } else {
                sb.append(currentCharacter);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String reciprocalString = reciprocalString(str);
        System.out.println("After reciprocating the string");
        System.out.println(reciprocalString);
        scan.close();
    }
}
