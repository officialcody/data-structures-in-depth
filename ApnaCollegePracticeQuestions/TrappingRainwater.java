package ApnaCollegePracticeQuestions;

/*** Trapping Rainwater
 * QUES => Given 'n' non-negative integers representing an elevation map where the width of each bar is 1.
 * Compute how much water it can trap after raining
 * 
 * TC => O(n)
 * SC => O(n)
 */ 
import java.util.*;

public class TrappingRainwater {
    public static int trappedRainwater(int [] heights, int n) {
        // for single and double bars, return 0
        if(n == 1 || n == 2) return 0;

        // calculate left max boundary
        int leftMax [] = new int[n];
        leftMax[0] = heights[0];
        for(int i=1;i<n;i++){
            leftMax[i] = Math.max(leftMax[i-1], heights[i]);
        }

        // calculate right max boundary
        int rightMax [] = new int[n];
        rightMax[n-1] = heights[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i] = Math.max(heights[i], rightMax[i+1]);
        }

        int trappedRainwater = 0;
        // loop
        for(int i=0;i<n;i++){
            // waterlevel = min(leftmax bound, rightmax bound)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            // trappedwater = waterlevel - height
            trappedRainwater += waterLevel - heights[i];
        }
        return trappedRainwater;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] heights = new int[100000];
        for(int i=0;i<n;i++){
            heights[i] = scan.nextInt();
        }
        int trappedRainwater = trappedRainwater(heights, n);
        System.out.println("Trapped Rainwater is: " + trappedRainwater + " units");
        scan.close();
    }
}
