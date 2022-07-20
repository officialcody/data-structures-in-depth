package Day4;

import java.util.Scanner;

class pair  
{  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }

    public void printPair(){
        System.out.println("Minimum: " + this.first);
        System.out.println("Maximum: " + this.second);
    }
}

public class Ques4 {
    static pair getMinMax(long a[], long n)  
    {
        long minimum = Integer.MAX_VALUE;
        long maximum = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(a[i] < minimum){
                minimum = a[i];
            }
            if(a[i] > maximum){
                maximum = a[i];
            }
        }
        pair p = new pair(minimum, maximum);
        return p;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long [] arr = new long[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextLong();
        }
        pair p = getMinMax(arr, n);
        p.printPair();
        scan.close();
    }
}
