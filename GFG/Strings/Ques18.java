package GFG.Strings;

// Remove characters from alphanumeric string
import java.util.*;

public class Ques18 {
    public static String removeCharacters(String S) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<S.length();i++){
            if(Character.isDigit(S.charAt(i))){
                sb.append(S.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String onlyNumbers = removeCharacters(str);
        System.out.println("After removing characters: " + onlyNumbers);
        scan.close();
    }
}
