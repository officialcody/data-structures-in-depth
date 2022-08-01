package Day16;

// Punish the students

/***
 * QUES - A Professor conducts a Computer Science paper for N students. He had strictly instructed all students to sit 
 * according to their roll numbers. However when he started checking the papers, he found out that all the papers were 
 * randomly ordered because the students had sat randomly during the exam instead of sitting according to their roll 
 * numbers. The order is given in list of integers roll[ ]. The professor became very angry and he wanted to teach the 
 * students a lesson. He decided to sort the papers according to roll numbers by Bubble Sort and count the number of 
 * swaps required for each and every student and deduct as many marks of a student as were the number of swaps required 
 * for that student. The marks of every student is given in list of integers marks[ ] in the order in which they were 
 * sitting. However he also has to maintain the class average greater than or equal to a set minimum avg, else he may 
 * lose his job. The Professor wants to know whether he should punish the students or save his job.
 * 
 * Input:
 *  N = 5 
 *  average = 68
 *  rolls[] = {3, 2, 4, 1, 5}
 *  marks[] = {50, 67, 89, 79, 58}
 * Output: 0
 *  Explanation: Overall number of swaps required is 8. Hence the class average would become (50 + 67 + 89 + 79 + 58 - 8) / 5 = 67
 *  Since 67 is less than the required minimum (68), he will not punish the class to save his Job.
 * 
 */
import java.util.*;

class Ques3 {

    public static int shouldPunish (int roll[], int marks[], int n, double avg) {
        int swaps = 0;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(roll[j] > roll[j+1]){
                    int temp = roll[j];
                    roll[j] = roll[j+1];
                    roll[j+1] = temp;
                    swaps++;
                }
            }
        }
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += marks[i];
        }
        double average = (sum - swaps)/n;
        if(average < avg){
            return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int rolls[] = new int[1000000];
        for(int i=0;i<n;i++){
            rolls[i] = scan.nextInt();
        }
        int marks[] = new int[1000000];
        for(int i=0;i<n;i++){
            marks[i] = scan.nextInt();
        }
        double average = scan.nextDouble();
        int shouldPunish = shouldPunish(rolls, marks, n, average);
        if(shouldPunish == 0){
            System.out.println("Professor should not punish the students");
        } else {
            System.out.println("Teacher should punish the students");
        }
        scan.close();
    }
}