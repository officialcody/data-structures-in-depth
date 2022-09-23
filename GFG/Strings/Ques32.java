package GFG.Strings;

// Sandwiched Vowels
import java.util.*;

public class Ques32 {
    public static boolean isVowel(char c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            return true;
        }
        return false;
    }

    public static String Sandwiched_Vowel(String str){
        int len = str.length();
        if(len <= 2) return str;
        StringBuilder ans =new StringBuilder();
        ans.append(str.charAt(0));
        for(int i = 1; i < len -1; i++){
            char pre = str.charAt(i-1);
            char ch  = str.charAt(i);
            char next = str.charAt(i+1);
            if(isVowel(pre) || !isVowel(ch) || isVowel(next)){
                ans.append(ch);
            }
        }
        ans.append(str.charAt(len-1));
        return ans.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String sandwichedVowels = Sandwiched_Vowel(str);
        System.out.println("Sandwiched vowels are: " + sandwichedVowels);
        scan.close();
    }
}
