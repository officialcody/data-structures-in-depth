package ApnaCollegePracticeQuestions.ArraysAssignment;

/****
 * Question 1:
 *      Given an integer array nums, return true if any value appears at least twice in the array, 
 *      and return false if every element is distinct.
 * Example 1:
 *      Input:nums = [1, 2, 3, 1]
 *      Output:   true 
 * Example 2:
 *      Input:nums = [1, 2, 3, 4]
 *      Output:   false
 * Example 3:
 *      Input:nums = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2]
 *      Output:   true
 */

import java.util.*;

public class Ques1 {
    public static boolean hasDuplicates(int [] numbers, int n) {
        boolean hasDuplicates = false;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int num : numbers) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > 1) {
                hasDuplicates = true;
                break;
            }
        }
        return hasDuplicates;
    }

    public static boolean hasDuplicates2(int [] numbers, int n) {
        boolean hasDuplicates = false;
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            if(nums.contains(numbers[i])) {
                hasDuplicates = true;
                break;
            } else {
                nums.add(numbers[i]);
            }
        }
        return hasDuplicates;
    }

    public static void main(String[] args) {
        int [] test1 = new int[]{1, 2, 3, 1};
        int [] test2 = new int[]{1, 2, 3, 4};
        int [] test3 = new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println("USING HashMap");
        System.out.println("TC - 1: " + hasDuplicates(test1, 4));
        System.out.println("TC - 2: " + hasDuplicates(test2, 4));
        System.out.println("TC - 3: " + hasDuplicates(test3, 10));
        System.out.println();
        System.out.println("USING ArrayList");
        System.out.println("TC - 1: " + hasDuplicates2(test1, 4));
        System.out.println("TC - 2: " + hasDuplicates2(test2, 4));
        System.out.println("TC - 3: " + hasDuplicates2(test3, 10));
    }
}
