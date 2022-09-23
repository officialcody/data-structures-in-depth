package GFG.Strings;

// Pattern of Strings
import java.util.*;

public class Ques21 {
    public static ArrayList<String> pattern(String S) {
        ArrayList<String> answer = new ArrayList<String>();
        for(int i=S.length()-1;i>=0;i--){
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<=i;j++){
                sb.append(S.charAt(j));
            }
            answer.add(sb.toString());
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        ArrayList<String> answer = pattern(str);
        for(String pattern : answer){
            System.out.println(pattern);
        }
        scan.close();
    }
}
