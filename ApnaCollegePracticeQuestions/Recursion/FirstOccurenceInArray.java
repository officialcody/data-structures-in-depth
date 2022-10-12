package ApnaCollegePracticeQuestions.Recursion;

import java.util.Scanner;

public class FirstOccurenceInArray {
    public static int firstOccurenceInArray(int n, int [] arr, int target, int pos) {
        if(pos == n) {
            return -1;
        }
        if(arr[pos] == target) {
            return pos;
        }
        return firstOccurenceInArray(n, arr, target, pos+1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[n];
        int target = scan.nextInt();
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int firstOccurence = firstOccurenceInArray(n, arr, target, 0);
        if(firstOccurence == -1) {
            System.out.println("Not found");
        } else {
            System.out.println(target + " found at index: " + firstOccurence);
        }
        scan.close();
    }
}
