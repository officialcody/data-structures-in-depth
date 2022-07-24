package Day8;

// Java 1-d and 2-d Array
import java.util.*;

public class Ques16 {
    public static ArrayList<Integer> leftDiagonalSumAndMaxIn2D1DArray(int a[][], int b[], int n) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        int leftDiagonalSum = 0;
        for(int i=0;i<n;i++){
            leftDiagonalSum += a[i][i];
        }
        int maxIn1DArray = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(b[i] > maxIn1DArray){
                maxIn1DArray = b[i];
            }
        }
        answer.add(leftDiagonalSum);
        answer.add(maxIn1DArray);
        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a [][] = new int[100000][100000];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j] = scan.nextInt();
            }
        }

        int b [] = new int[100000];
        for(int i=0;i<n;i++){
            b[i]=scan.nextInt();
        }

        ArrayList<Integer> answer = leftDiagonalSumAndMaxIn2D1DArray(a, b, n);
        System.out.println("Left diagonal sum is: " + answer.get(0));
        System.out.println("Max element in second array is: " + answer.get(1));
        scan.close();
    }
}
