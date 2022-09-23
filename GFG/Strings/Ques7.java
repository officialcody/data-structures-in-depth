package GFG.Strings;

// Delete Alternate Characters
import java.util.*;

public class Ques7 {
    public static String delAlternate(String S) {
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<S.length();i++){
            if(i%2==0){
                sb.append(S.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String answer = delAlternate(str);
        System.out.println("After deleting alternate characters");
        System.out.println(answer);
        scan.close();
    }
}
