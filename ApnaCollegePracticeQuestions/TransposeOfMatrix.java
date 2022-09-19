package ApnaCollegePracticeQuestions;

public class TransposeOfMatrix {
    public static void transpose(int [][] matrix, int n, int m){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
