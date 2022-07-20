package Day4;

import java.util.Scanner;

public class Ques1 {
    static int minDist(int a[], int n, int x, int y) {
        int len = n;
        int firstIndex = -1;
        int lastIndex = -1;
        for(int i=0;i<n;i++){
            if(a[i]==x){
                firstIndex = i;
                if(lastIndex != -1){
                    len = Math.min(len, Math.abs(lastIndex - firstIndex));
                }
            }else if(a[i] == y){
                lastIndex = i;
                if(firstIndex != -1){
                    len = Math.min(len, Math.abs(lastIndex - firstIndex));
                }
            }
        }
        if(firstIndex==-1 || lastIndex==-1){
            return -1;
        }
        return len;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int x = scan.nextInt();
        int y = scan.nextInt();
        int ans = minDist(arr, n, x, y);
        System.out.println("Minimum distance is: " + ans);
        scan.close();
    }
}
