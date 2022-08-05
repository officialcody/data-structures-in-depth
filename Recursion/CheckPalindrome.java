package Recursion;

import java.util.*;

public class CheckPalindrome {
    public static boolean checkPalindrome(int left, int right, String str){
        if(left >= right) return true;
        if(!(str.charAt(left) == str.charAt(right))) return false;
        return checkPalindrome(left+1, right-1, str);
    }

    public static boolean isPalindrome(String str) {
        return checkPalindrome(0, str.length()-1, str);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        boolean isPalindrome = isPalindrome(str);
        if(isPalindrome) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("Its not a Palindrome");
        }
        scan.close();
    }

}
