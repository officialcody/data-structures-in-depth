package ApnaCollegePracticeQuestions;

import java.util.Scanner;

public class ConvertFirstLetterToUpperCase {
    public static String firstToUpperCase(String str){
        StringBuilder sb = new StringBuilder("");
        sb.append(Character.toUpperCase(str.charAt(0)));
        for(int i=1;i<str.length();i++){
            if(str.charAt(i) == ' ' && i < str.length() - 1){
                sb.append(i);
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        String capitalizedString = firstToUpperCase(sentence);
        System.out.println("Capitalized String is:");
        System.out.println(capitalizedString);
        scan.close();
    }
}
