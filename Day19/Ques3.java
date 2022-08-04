package Day19;

// Tiger Zinda Hai
import java.util.*;

public class Ques3 {
    /***
     * USING HASHMAP
     * @param arr
     * @param n
     * @return
     */
    public static int count_tabs (String arr[], int n) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        int count = 0;
        for(String str : arr){
            if(str.equals("END")){
                map.clear();
                count =0;
                continue;
            }
            if(map.containsKey(str)){
                map.remove(str);
                count--;
            } else {
                map.put(str, 1);
                count++;
            }
            
        }

        return count;
    }

    /****
     * USING HASHSET
     * @param arr
     * @param n
     * @return
     */
    public static int count_tabs2(String [] arr, int n){
        HashSet<String> hs = new HashSet<>();
        
        for(int i=n-1; i>=0; i--){
            if(arr[i] == "END"){
                break;
            }
            if(hs.contains(arr[i])){
                hs.remove(arr[i]);
            }
            else{
                hs.add(arr[i]);
            }
        }
        
        return hs.size();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String [] arr = new String[10000000];
        for(int i=0;i<n;i++){
            arr[i] = scan.next();
        }
        int count_tabs = count_tabs(arr, n);
        System.out.println("Number of tabs opened at last are: " + count_tabs);
        scan.close();
    }
}
