package GFG.Strings;

// Repeated Character
import java.util.*;

public class Ques35 {
    public static char firstRep(String S) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        for(int i=0;i<S.length();i++){
            map.put(S.charAt(i), map.getOrDefault(S.charAt(i), 0)+1);
        }
        char answer = '#';
        int minIndex = S.length()-1;
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() >= 2) {
                minIndex = Math.min(minIndex, S.indexOf(entry.getKey()));
                answer = S.charAt(minIndex);
            }
        }
        return answer;
    }

    public static char firstRep2(String S) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        for(int i=0;i<S.length();i++){
            map.put(S.charAt(i), map.getOrDefault(S.charAt(i), 0)+1);
        }
        char answer = '#';
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() > 1) {
               answer = entry.getKey();
               break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        char firstRepeatingCharacter = firstRep(str);
        System.out.println("First repeating character is: " + firstRepeatingCharacter);
        scan.close();
    }
}
