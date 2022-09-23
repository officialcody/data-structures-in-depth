package GFG.Strings;

// Reversing the vowels
import java.util.*;

public class Ques16 {
    public static boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ? true : false;
    }

    public static String reverseVowels(String s) {
        ArrayList<Character> vowels = new ArrayList<Character>();
        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                vowels.add(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder("");
        int pos = vowels.size() - 1;
        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                sb.append(vowels.get(pos));
                pos--;
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String reversedVowels = reverseVowels(str);
        System.out.println("After reversing vowels of the string");
        System.out.println(reversedVowels);
        scan.close();
    }
}
