package GFG.Strings;

// Split Strings
import java.util.*;

public class Ques20 {
    public static List<String> splitString(String S) {
        StringBuilder letters = new StringBuilder("");
        StringBuilder numbers = new StringBuilder("");
        StringBuilder specialCharacters = new StringBuilder();
        
        for(int i=0;i<S.length();i++){
            char currentCharacter = S.charAt(i);
            if(Character.isLetter(currentCharacter)){
                letters.append(currentCharacter);
            } else if(Character.isDigit(currentCharacter)){
                numbers.append(currentCharacter);
            } else {
                specialCharacters.append(currentCharacter);
            }
        }
        
        List<String> answer = new ArrayList<String>();
        answer.add(letters.toString().length() > 0 ? letters.toString() : "-1");
        answer.add(numbers.toString().length() > 0 ? numbers.toString() : "-1");
        answer.add(specialCharacters.toString().length() > 0 ? specialCharacters.toString() : "-1");
        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        List<String> answer = splitString(str);
        if(answer.get(0).equals("-1")){
            System.out.println("No letters Found");
        } else {
            System.out.println("Letters: " + answer.get(0));
        }
        if(answer.get(1).equals("-1")){
            System.out.println("No numbers Found");
        } else {
            System.out.println("Numbers: " + answer.get(1));
        }
        if(answer.get(2).equals("-1")){
            System.out.println("No special characters Found");
        } else {
            System.out.println("Special Characters: " + answer.get(2));
        }
        scan.close();
    }
}
