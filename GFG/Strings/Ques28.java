package GFG.Strings;

// Anagram of String
import java.util.*;

public class Ques28 {
    public static int remAnagrams(String s,String s1) {
	    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	    for(int i=0;i<s.length();i++){
	        map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
	    }
	    for(int i=0;i<s1.length();i++){
	        map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0)-1);
	    }
	    int count = 0;
	    for(Map.Entry<Character, Integer> entry : map.entrySet()){
	        count += (int)Math.abs(entry.getValue());
	    }
	    return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.next();
        String s2 = scan.next();
        int minimumOperations = remAnagrams(s1, s2);
        System.out.println("Minimum operations to make strings anagrams: " + minimumOperations);
        scan.close();
    }
}
