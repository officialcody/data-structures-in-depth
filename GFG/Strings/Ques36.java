package GFG.Strings;

// Length of Last word
import java.util.*;

public class Ques36 {
    public static int findLength(String s) {
        StringBuilder sb = new StringBuilder("");
        s=s.trim();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i) == ' '){
                break;
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString().length();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int findLengthLastWord = findLength(str);
        System.out.println("Length of the last word is: " + findLengthLastWord);
        scan.close();
    }
}
