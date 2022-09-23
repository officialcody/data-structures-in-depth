package GFG.Arrays;

import java.util.*;

public class Ques10 {
    /***
     * Binary Search to count less than a particular number
     * 
     * @param arr
     * @param n
     * @param number
     * @return
     */
    public static int binarySearch(int [] arr, int n, int number){
        int low = 0;
        int high = n - 1;
        int count = 0;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] <= number){
                count += mid - low + 1;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return count;
    }

    /****
     * Logic to count elements of second array less than or equal to element of first array
     * @param arr1
     * @param arr2
     * @param m
     * @param n
     * @return
     */
    public static ArrayList<Integer> countEleLessThanOrEqual(int arr1[], int arr2[], int m, int n) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        Arrays.sort(arr2);
        for(int i=0;i<m;i++){
            int number = arr1[i];
            int count = binarySearch(arr2, n, number);
            answer.add(count);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr1 = new int[100000];
        for(int i=0;i<n;i++){
            arr1[i] = scan.nextInt();
        }
        int m = scan.nextInt();
        int [] arr2 = new int[100000];
        for(int i=0;i<m;i++){
            arr2[i] = scan.nextInt();
        }
        ArrayList<Integer> answer = countEleLessThanOrEqual(arr1, arr2, m, n);
        for(int num : answer){
            System.out.print(num + " ");
        }
        scan.close();
    }
}
