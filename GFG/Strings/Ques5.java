package GFG.Strings;

// Remove Spaces
import java.util.*;

public class Ques5 {
    public static String removeSpaces(String S) {
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<S.length();i++){
            if(S.charAt(i) != ' '){
                sb.append(S.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String answer = removeSpaces(str);
        System.out.println("After removing spaces: ");
        System.out.println(answer);
        scan.close();
    }
}
