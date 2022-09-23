package GFG.Strings;

// Check if a string is Isogram or not
import java.util.*;

public class Ques30 {
    public static boolean isIsogram(String data){
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i=0;i<data.length();i++){
            map.put(data.charAt(i), map.getOrDefault(data.charAt(i), 0) + 1);
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() > 1){
                return false;
            }
        }
        return true;
    }

    public static boolean isIsogram2(String data){
        HashSet<Character> table= new HashSet<Character>();
        for(int i=0;i<data.length();i++){
            table.add(data.charAt(i));
        }
        if(table.size()==data.length()) { 
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        if(isIsogram(str)){
            System.out.println("It is an Isogram");
        } else {
            System.out.println("It is not an Isogram");
        }
        scan.close();
    }
}
