package Day6;

// Binary Array Sorting

import java.util.*;

public class Ques7 {
    /*
     * Sorting using Arrays.sort()
     */
    public static void binSort(int A[], int N) {
        Arrays.sort(A);
    }

    /**
     * Count total zeros and then loop uptill zeroCount to insert 0's and then loop from zeroCount to N to insert 1's
     * @param A Array
     * @param N Number of Elements in Array
     */
    public static void binSort2(int A[], int N){
        int zeroCount = 0;
        
        for(int number : A){
            if(number == 0){
                zeroCount++;
            }
        }
        for(int num=0;num<zeroCount;num++){
            A[num] = 0;
        }
        for(int num=zeroCount;num<N;num++){
            A[num] = 1;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int [] A = new int[100000];
        for(int i=0;i<N;i++){
            A[i] = scan.nextInt();
        }
        System.out.println("Array before sorting");
        for(int i: A){
            System.out.println(i + " ");
        }
        binSort(A, N);
        System.out.println("Array after sorting");
        for(int i: A){
            System.out.println(i + " ");
        }
        scan.close();
    }


}
