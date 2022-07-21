package Day5;

// FIRST and LAST Occurence of a number in an array

import java.util.*;

public class Ques2 {
    public static ArrayList<Long> find(long arr[], int n, int x) {
        long firstOccurence = -1;
        long lastOccurence = -1;
        boolean res = false;
        ArrayList<Long> result = new ArrayList<Long>();
        for(int i=0;i<n;i++){
            if(arr[i] == x){
                firstOccurence = i;
                result.add(firstOccurence);
                res = true;
                break;
            }
        }
        
        if(res == false){
            result.add(firstOccurence);
        }
        
        for(int i=0;i<n;i++){
            if(x == arr[i]){
                lastOccurence=i;
            }
        }
        result.add(lastOccurence);
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long [] arr = new long[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextLong();
        }
        int X = scan.nextInt();
        ArrayList<Long> ans = find(arr, n, X);
        System.out.println("First Occurence => " + ans.get(0));
        System.out.println("Last Occurence => " + ans.get(1));
        scan.close();
    }
}
