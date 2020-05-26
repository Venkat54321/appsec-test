package matrix;

public class MaximunSubSquareMatrixWith1s {

    public static void main(String[] args) {

        int[][] matrix = {{0, 1, 1, 0, 1},
                {1, 1, 0, 1, 0},
                {0, 1, 1, 1, 0},
                {1, 1, 1, 1, 0},
                {1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0}};

        int max = maximumSquareMatrix(matrix,matrix.length,matrix[0].length);
        System.out.println(max);
    }

    public static int maximumSquareMatrix(int[][] matrix,int row,int col){
        int max = 0;
        int[][] table = new int[row][col];

        for(int i =0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i ==0 || j==0 ){
                    table[i][j] = matrix[i][j];
                    max = table[i][j] > max ? table[i][j] : max;
                }
                else if(matrix[i][j] == 0){
                    table[i][j] = 0;
                }else {
                    table[i][j] = min(table[i-1][j],table[i][j-1],table[i-1][j-1]) + 1;
                    max = table[i][j] > max ? table[i][j] : max;
                }
            }
        }
        return max;
    }

    public static int min(int i,int j,int k){
        return (i <=j && i <=k)?i:( j<=i && j<=k ?j:k);
    }
}
