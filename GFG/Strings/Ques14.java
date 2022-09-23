package GFG.Strings;

// Count type of Characters
import java.util.*;

public class Ques14 {
    public static int[] countCharacterTypes(String s) {
        int [] answer = new int[4];
        Arrays.fill(answer, 0);
        for(int i=0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i))){
                answer[0]++;
            } else if(Character.isLowerCase(s.charAt(i))){
                answer[1]++;
            } else if(Character.isDigit(s.charAt(i))) {
                answer[2]++;
            } else {
                answer[3]++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int [] answer = countCharacterTypes(str);
        System.out.println("Number of uppercase characters: " + answer[0]);
        System.out.println("Number of lowercase characters: " + answer[1]);
        System.out.println("Number of numeric characters: " + answer[2]);
        System.out.println("Number of special characters: " + answer[3]);
        scan.close();
    }
}
