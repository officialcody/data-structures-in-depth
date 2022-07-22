package Day6;

import java.util.Scanner;

class Height {
	int feets;
	int inches;

	public Height(int feets, int inches) {
	    this.feets = feets;
	    this.inches = inches;
	}

    // public int getFeets(){
    //     return this.feets;
    // }

    // public void setFeets(int feets){
    //     this.feets = feets;
    // }

    // public int getInches(){
    //     return this.inches;
    // }

    // public void setInches(int inches){
    //     this.inches = inches;
    // }
}

public class Ques11 {
    public static int findMaximumHeight(Height arr[], int n) {
        int maxHeight = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int feets = arr[i].feets;
            int inches = arr[i].inches;
            int totalInches = feets * 12 + inches;
            if(totalInches > maxHeight){
                maxHeight = totalInches;
            }
        }
        return maxHeight;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Height [] arr = new Height[100000];
        for(int i=0;i<n;i++){
            arr[i] = new Height(scan.nextInt(), scan.nextInt());
        }

        int maximumHeight = findMaximumHeight(arr, n);
        System.out.println("Maximum height is: " + maximumHeight);
        scan.close();
    }
}
