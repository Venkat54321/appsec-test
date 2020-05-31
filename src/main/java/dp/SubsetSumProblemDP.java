package dp;

public class SubsetSumProblemDP {

    public static void main(String[] args) {

        int[] array = {2,3,5,7,10};
        int sum = 14;
        boolean[][] matrix = new boolean[array.length][sum+1];

        for(int i=0;i<array.length;i++){
            for(int j=0;j<=sum;j++){
                if(j==0){
                    matrix[i][j] = true;
                }else if(i == 0 && j == array[i]){
                     matrix[i][j] = true;
                }else if(i == 0) {
                    matrix[i][j] = false;
                }
                if( j < array[i]){
                    if(i > 0) {
                        matrix[i][j] = matrix[i - 1][j];
                    }
                }else {
                    if(i > 0) {
                        matrix[i][j] = matrix[i - 1][j] || matrix[i - 1][j - array[i]];
                    }
                }
            }
        }
        System.out.println(matrix);
    }
}
