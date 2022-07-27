package Day11;

import java.util.*;

class Ques1 {
    public static int countPairs(int arr1[],int arr2[], int M, int N, int x) { 
        int i=0;
        int j = N-1;
        int count = 0;
        while(i<M && j >= 0){
            int sum = arr1[i] + arr2[j];
            if(sum == x){
                count++;
                j--;
            } else if(sum > x){
                j--;
            } else if(sum < x){
                i++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int arr1[] = new int[100000];
        for(int i=0;i<m;i++){
            arr1[i] = scan.nextInt();
        }
        int n = scan.nextInt();
        int arr2[] = new int[100000];
        for(int i=0;i<n;i++){
            arr2[i] = scan.nextInt();
        }
        int target = scan.nextInt();
        int answer = countPairs(arr1, arr2, m, n, target);
        switch(answer){
            case 0:
                System.out.println("No pairs found");
                break;
            case 1:
                System.out.println(answer + " pair found");
                break;
            default:
                System.out.println("Number of pairs in arrays having sum " + target + " are " + answer);
        }
        scan.close();
    }
}