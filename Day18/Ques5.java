package Day18;

// Print k smallest elements in their original order
import java.util.*;

public class Ques5 {
     public static ArrayList<Integer> kSmallestElements(int arr[], int n, int k) {
        ArrayList<Integer> a=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        int m_i=-1;
        for(int i=0;i<n;i++) {
            max=Integer.MIN_VALUE;
            m_i=-1;
            if(i<k) {
               a.add(arr[i]);
            }
            else{
                for(int j=0;j<a.size();j++) {
                    if(a.get(j)>=max) {
                       max=a.get(j);
                       m_i=j;
                    }
                }
                if(arr[i]<max) {
                   a.remove(m_i);
                   a.add(arr[i]);
                }
            }
        }
       return a;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[1000000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int k = scan.nextInt();
        ArrayList<Integer> answer = kSmallestElements(arr, n, k);
        for(int i: answer){
            System.out.print(i + " ");
        }
        scan.close();
    }
}
