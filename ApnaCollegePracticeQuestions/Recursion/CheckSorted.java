package ApnaCollegePracticeQuestions.Recursion;

import java.util.Scanner;

public class CheckSorted {
    public static boolean checkSorted(int [] arr, int pos) {
        if(pos == arr.length-1) {
            return true;
        }
        if(arr[pos] > arr[pos+1]){
            return false;
        }
        return checkSorted(arr, pos+1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        System.out.println(checkSorted(arr, 0));
        scan.close();
    }
}
