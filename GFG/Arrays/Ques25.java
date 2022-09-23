package GFG.Arrays;

// Rahul lucky-unlucky
import java.util.*;

class Ques25 {
    public static boolean isLucky(char ch){
        return ch == 'H' ? true : false;
    }
    
    public static char flipCoin(char ch){
        return ch == 'H' ? 'T' : 'H';
    }
    public static int flippedIndexes(char a[], long n, long getAnswer[]) {
        int count = 0;
        for(int i=0;i<n-1;i++){
            if(!isLucky(a[i])){
                getAnswer[count] = i+1;
                count++;
                a[i+1] = flipCoin(a[i+1]);
            }
        }
        if(!isLucky(a[(int)n-1])){
            getAnswer[count] = n;
            count++;
        }
        System.out.println("Flipped indexes");
        for(long num : getAnswer){
            System.out.print(num + " ");
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        char [] arr = new char[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.next().charAt(i);
        }
        long [] getAnswer = new long[(int)n];
        int count = flippedIndexes(arr, n, getAnswer);
        System.out.println("Number of indexes flipped: " + count);
        scan.close();
    }
}