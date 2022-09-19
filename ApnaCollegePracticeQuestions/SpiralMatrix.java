package ApnaCollegePracticeQuestions;

public class SpiralMatrix {
    
    public static void printSpiralMatrix(int [][] matrix) {
        int startRow = 0;
        int endRow = matrix.length-1;
        int startColumn = 0;
        int endColumn = matrix[0].length - 1;
        while(startRow <= endRow && startColumn <= endColumn){
            // print top
            for(int j=startColumn;j<=endColumn;j++){
                System.out.print(matrix[startRow][j] + " ");
            }
            // print right
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endColumn] + " ");
            }
            // print bottom
            for(int j=endColumn-1;j>=startColumn;j--){
                if(startRow == endRow){
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }
            // print left
            for(int i=endRow-1;i>=startRow+1;i--){
                if(startColumn == endColumn){
                    break;
                }
                System.out.print(matrix[i][startColumn] + " ");
            }

            startColumn++;
            startRow++;
            endColumn--;
            endRow--;
        }
    }
}
