package Day15;

// Sorting Employees
import java.util.*;

class Node {
    int salary;
    String name;
    public void setSalary(int a) {
        this.salary=a;
    }
    public void setName(String s) {
        this.name=s;
    }
}

public class Ques7 {
    public static void sortRecords(Node arr[],int n) {
        Arrays.sort(arr, new Comparator<Node>(){
           public int compare(Node emp1, Node emp2){
               if(emp1.salary == emp2.salary){
                   return emp1.name.compareTo(emp2.name);
               } else if(emp1.salary > emp2.salary){
                   return 1;
               } else {
                   return -1;
               }
           } 
        });
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Node [] arr = new Node[1000];
        for(int i=0;i<n;i++){
            arr[i].setName(scan.next());
            arr[i].setSalary(scan.nextInt());
        }
        System.out.println("After sorting employee array");
        sortRecords(arr, n);
        for(Node i : arr){
            System.out.println(i.name + " " + i.salary);
        }
        scan.close();
    }
}
