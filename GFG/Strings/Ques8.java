package GFG.Strings;

// Count of camel case characters
import java.util.Scanner;

public class Ques8 {
    public static int countCamelCase (String s) {
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i))){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int uppercasecharacters = countCamelCase(str);
        System.out.println("Number of camel case characters: " + uppercasecharacters);
        scan.close();
    }
}
