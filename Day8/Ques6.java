package Day8;

import java.util.Scanner;

public class Ques6 {
    // public int lastIndex( String s) {
    //     return s.lastIndexOf("1");
    // }
    public static int lastIndex(String s) {
        int lastIndex = -1;
        for(int i=0;i<s.length();i++){
            if((char)s.charAt(i) == '1'){
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int lastIndexOf1 = lastIndex(s);
        System.out.println("Last index of 1 in string " + s + " is: " + lastIndexOf1);
        scan.close();
    }
}
