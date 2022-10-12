package ApnaCollegePracticeQuestions.Recursion;

import java.util.*;

public class LastOccurenceInArray {
    public static int lastOccurenceInArray(int n, int [] arr, int target, int pos) {
        if(pos == n) {
            return -1;
        }
        int isFound = lastOccurenceInArray(n, arr, target, pos+1);
        if(arr[pos] == target && isFound == -1) {
            return pos;
        }
        return isFound;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int target = scan.nextInt();
        int lastOccurence = lastOccurenceInArray(n, arr, target, 0);
        if(lastOccurence == -1) {
            System.out.println("Not found");
        } else {
            System.out.println(target + " found at index: " + lastOccurence);
        }
        scan.close();
    }
}
