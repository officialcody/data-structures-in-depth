package GFG.Strings;

// Remove Consecutive Characters
import java.util.*;

public class Ques33 {
    public static String removeConsecutiveCharacter(String S){
        StringBuilder sb = new StringBuilder();
        sb.append(S.charAt(0));
        for(int i=1;i<S.length();i++){
            if(S.charAt(i) != S.charAt(i-1)){
                sb.append(S.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String removedStr = removeConsecutiveCharacter(str);
        System.out.println("After removing");
        System.out.println(removedStr);
        scan.close();
    }
}
