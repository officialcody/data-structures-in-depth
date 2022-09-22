package ApnaCollegePracticeQuestions;

/****
 * String Compression
 * 
 * Example - 1:
 * INPUT => "aaaabbbccddd"
 * OUTPUT => "a4b3c2d3"
 * 
 * Example - 2:
 * INPUT => "abc"
 * OUTPUT => "abc"
 * 
 * Example - 3:
 * INPUT => "aabccccdd"
 * OUTPUT => "a2bc4d2"
 */

import java.util.*;

public class CompressString {
    public static String compressStringShradhaDidi(String str) {
        String newString = "";
        for(int i=0;i<str.length();i++){
            Integer count = 1;
            while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newString += str.charAt(i);
            if(count > 1){
                newString += count.toString();
            }
        }
        return newString;
    }

    public static String compressStringShradhaDidi2(String str) {
        StringBuilder newString = new StringBuilder("");
        for(int i=0;i<str.length();i++){
            Integer count = 1;
            while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newString.append(str.charAt(i));
            if(count > 1){
                newString.append(count.toString());
            }
        }
        return newString.toString();
    }

    public static String compressStringUsingHashMap(String str){
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        for(int i=0;i<str.length();i++){
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }
        StringBuilder answer = new StringBuilder("");
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() > 1){
                answer.append(entry.getKey().toString());
                answer.append(entry.getValue().toString());
            } else {
                answer.append(entry.getKey().toString());
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String answer1 = compressStringShradhaDidi(str);
        String answer2 = compressStringShradhaDidi2(str);
        String answer3 = compressStringUsingHashMap(str);
        System.out.println("Answer 1 => " + answer1);
        System.out.println("Answer 2 => " + answer2);
        System.out.println("Answer 3 => " + answer3);
        scan.close();
    }
}
