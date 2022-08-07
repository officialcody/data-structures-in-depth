package Recursion;

// Power Set
import java.util.*;

public class PowerSet {
    public static ArrayList<ArrayList<Integer> > getSubset(int[] set, int index) {
        ArrayList<ArrayList<Integer>> allSubsets;
        if (index < 0) {
            allSubsets = new ArrayList<ArrayList<Integer>>();
            allSubsets.add(new ArrayList<Integer>());
        } else {
            allSubsets = getSubset(set, index - 1);
            int item = set[index];
            ArrayList<ArrayList<Integer>> moreSubsets = new ArrayList<ArrayList<Integer>>();
 
            for (ArrayList<Integer> subset : allSubsets) {
                ArrayList<Integer> newSubset = new ArrayList<Integer>();
                newSubset.addAll(subset);
                newSubset.add(item);
                moreSubsets.add(newSubset);
            }
            allSubsets.addAll(moreSubsets);
        }
        return allSubsets;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] set = new int[10000000];
        for(int i=0;i<n;i++){
            set[i] = scan.nextInt();
        }
        ArrayList<ArrayList<Integer>> answer = getSubset(set, n - 1);
        System.out.println("Total Subsets: " + answer);
        scan.close();
    }
}
