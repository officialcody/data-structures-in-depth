package GFG.Strings;

// Maximum Occuring Character
import java.util.*;

public class Ques29 {
    public static char getMaxOccuringChar(String line) {
        TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();
        for(int i=0;i<line.length();i++){
            map.put(line.charAt(i), map.getOrDefault(line.charAt(i), 0)+1);
        }
        char maxCharacter = 'a';
        int max = Integer.MIN_VALUE;
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() > max){
                if(entry.getKey() >= maxCharacter) {
                    maxCharacter = entry.getKey();
                    max = entry.getValue();
                }
            }
        }
        return maxCharacter;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        char answer = getMaxOccuringChar(line);
        System.out.println("Maximum occuring character is: " + answer);
        scan.close();
    }
}
