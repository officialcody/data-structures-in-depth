package GFG.Strings;

// Sorting Employees
import java.util.*;

class node {
    int salary;
    String name;
    public void setSalary(int a) {
        this.salary=a;
    }
    public void setName(String s) {
        this.name=s;
    }
}

public class Ques31 {
    public static void sortRecords(node arr[],int n) {
        Arrays.sort(arr, new Comparator<node>(){
           public int compare(node emp1, node emp2){
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
        node[] employees = new node[n];
        for(int i=0;i<n;i++){
            employees[i].salary = scan.nextInt();
            employees[i].name = scan.next();
        }
        sortRecords(employees, n);
        System.out.println("After sorting employees");
        for(node a : employees){
            System.out.println(a.salary + " " + a.name);
        }
        scan.close();
    }
}
