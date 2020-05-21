package matrix;

public class MatrixRotateBy90Degree {

    public static void main(String[] args) {

        int[][] matrix = { { 1,2,3,4},
                           {5,6,7,8},
                           { 9,10,11,12},
                           { 13,14,15,16} };

        printMatrix(matrix);
        System.out.println("======================");
        rotate(matrix);
        printMatrix(matrix);
    }

    public static void rotate(int[][] matrix){

        int row = 0;
        int col = 0;
        int maxRow = matrix[0].length - 1;
        int maxCol = matrix[1].length - 1;


        while (row < maxRow && col < maxCol){

            int previous = matrix[row + 1][col];
            for(int i=col;i<maxCol;i++){
                int current = matrix[row][i];
                matrix[row][i] = previous;
                previous = current;
            }
            row++;
            for(int i=row;i < maxRow;i++){
                int current = matrix[i][maxCol];
                matrix[i][maxCol] = previous;
                previous = current;
            }
            maxCol--;

            if(row < maxRow +1){
                for(int i =maxCol;i>=col;i--){
                    int current = matrix[maxRow][i];
                    matrix[maxRow][i] = previous;
                    previous = current;

                }
            }
            maxRow --;

            if(col < maxCol + 1){
                for(int i=maxRow;i>=row;i--){
                    int current = matrix[i][col];
                    matrix[i][col] = previous;
                    previous = current;
                }
            }
            col++;

        }

    }


    public static void printMatrix(int[][] matrix){

        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix.length; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");

    }


}
