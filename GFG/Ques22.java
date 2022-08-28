package GFG;

import java.util.*;

public class Ques22 {
    public static int minSum(int a[], int b[], int n) {
        int aMin1=Integer.MAX_VALUE;
        int aMin2=aMin1;
        int aIndx1=0;
        int aIndx2=0;
        
        int bMin1=aMin1;
        int bMin2=aMin1;
        int bIndx1=0;
        int bIndx2=0;
        
        for(int i=0; i<n; i++){
            if(aMin1>a[i]){ 
                aMin2=aMin1; 
                aMin1=a[i]; 
                aIndx2=aIndx1; 
                aIndx1=i;
            }   
            else if(aMin2>a[i]){ 
                aMin2=a[i]; 
                aIndx2=i;
            }
            
            if(bMin1>b[i]){ 
                bMin2=bMin1; 
                bMin1=b[i]; 
                bIndx2=bIndx1; 
                bIndx1=i; 
            }    
            else if(bMin2>b[i]){ 
                bMin2=b[i]; 
                bIndx2=i;
            }
        }
        
        if(aIndx1 != bIndx1){ 
            return aMin1+bMin1;
        }
        return Math.min(aMin1+bMin2,aMin2+bMin1); 
     }
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int [] brr = new int[100000];
        for(int i=0;i<n;i++){
            brr[i] = scan.nextInt();
        }
        int answer = minSum(arr, brr, n);
        System.out.println("Minimum sum is: " + answer);
        scan.close();
     }
}
