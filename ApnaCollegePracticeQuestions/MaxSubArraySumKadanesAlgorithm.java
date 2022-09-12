package ApnaCollegePracticeQuestions;

public class MaxSubArraySumKadanesAlgorithm {
    public static int kadanesAlgorithm(int numbers[], int n){
        // Check if there are no positive numbers
        boolean hasNoPositives = false;
        for(int i=0;i<n;i++){
            if(numbers[i] > 0){
                hasNoPositives = true;
                break;
            }
        }

        // If no positive numbers found in the array return the smallest negative number as maximum sum
        // else use kadanes algorithm to find the maximum subarray sum
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        if(hasNoPositives) {
            for(int i=0;i<n;i++){
                maxSum = Math.min(numbers[i], maxSum);
            }
        } else {
            for(int i=0;i<n;i++){
                currSum += numbers[i];
                if(currSum < 0){
                    currSum = 0;
                }
                maxSum = Math.max(currSum, maxSum);
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int numbers [] = new int[]{-2,-3,4,-1,-2,1,5,-3};
        int maximumSum = kadanesAlgorithm(numbers, 8);
        System.out.println("Maximum subarray sum is: " + maximumSum);
    }
}
