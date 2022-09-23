package GFG.Strings;

// Front-Back Transformation - copy
import java.util.*;

public class Ques19 {
    public static String convert(String s) { 
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char currentCharacter = s.charAt(i);
            if(currentCharacter >= 'a' && currentCharacter <= 'z'){
                sb.append((char)('z'- currentCharacter + 'a'));
            } else {
                sb.append((char)('Z'- currentCharacter + 'A'));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String answer = convert(str);
        System.out.println("After conversion: " + answer);
        scan.close();
    }
}
