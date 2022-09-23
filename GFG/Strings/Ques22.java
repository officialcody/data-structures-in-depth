package GFG.Strings;

// Extract the integers
import java.util.*;

public class Ques22 {
    public static ArrayList<String> extractIntegerWords(String s) {
        ArrayList<String> answer = new ArrayList<String>();
        for(int i=0;i<s.length();i++){
            StringBuilder sb = new StringBuilder("");
            while(Character.isDigit(s.charAt(i))){
                sb.append(s.charAt(i));
                if(i < s.length()-1){
                    i++;
                } else {
                    break;
                }
            }
            if(sb.length() > 0) { 
                answer.add(sb.toString()); 
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        ArrayList<String> answer = extractIntegerWords(str);
        for(String ans : answer){
            System.out.print(ans + " ");
        }
        scan.close();
    }
}
