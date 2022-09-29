package GFG.Arrays;

// Product array puzzle
import java.util.Scanner;

public class Ques50 {
    public static long[] productExceptSelf(int nums[], int n) {
	    long product = 1;
	    int numberOfZeros = 0;
	    for(int i=0;i<n;i++){
	        if(nums[i] != 0){
	            product*=nums[i];
	        } else {
	            numberOfZeros++;
	        }
	    }
	    
	    long [] answer = new long[n];
	    for(int i=0;i<n;i++){
	        if(numberOfZeros == 0) {
	            answer[i] = product/nums[i];
	        } else if(numberOfZeros == 1){
	            answer[i] = (nums[i] == 0) ? product : 0;
	        } else {
	            answer[i] = 0;
	        }
	    }
	    return answer;
	}

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = scan.nextInt();
        }
        long [] answer = productExceptSelf(nums, n);
        for(long i : answer){
            System.out.print(i + " ");
        }
        scan.close();
    }
}
