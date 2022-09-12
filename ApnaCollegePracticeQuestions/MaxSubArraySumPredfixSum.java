package ApnaCollegePracticeQuestions;

public class MaxSubArraySumPredfixSum {
    public static void maxSubArraySumPredfixSum(int [] arr, int n){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefixSum[] = new int[n];

        prefixSum[0] = arr[0];
        // Calculate Prefix Array
        for(int i=1;i<n;i++){
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                currSum = i == 0 ? prefixSum[j] : prefixSum[j] - prefixSum[i-1];
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }

        System.out.println("Maximum Sum of a subarray is: " + maxSum);

    }

    public static void main(String[] args) {
        int numbers [] = new int[]{1,-2,6,-1,3};
        maxSubArraySumPredfixSum(numbers, 5);
    }
}
