package Day1;

import java.util.*;

// Palindromic Array
public class Ques5 {

    public static int palinArray(int[] a, int n) {
	    for(int i=0;i<n;i++){
	        if(!palindromeNumber(a[i])){
	            return 0;
	        }
	    }
	    return 1;
	}
	
	
	public static boolean palindromeNumber(int number){
	    int reversedNumber = 0;
	    int num = number;
	    while(num > 0){
	        int remainder = num % 10;
	        reversedNumber = reversedNumber * 10 + remainder;
	        num /= 10;
	    }
	    return reversedNumber == number;
	}

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[100];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        System.out.println(palinArray(arr, n));
        scan.close();
    }
}
