package matrix;

public class PascalTriangale {

    public static void main(String[] args) {

        int levels = 5;
        int[][] array = new int[levels][levels];

        for(int i=0;i<levels;i++){
            for(int j=0;j<=i;j++){
                if(j==0 || i == j){
                    array[i][j] = 1;
                }else {
                    array[i][j] = array[i-1][j-1] + array[i-1][j];
                }
                System.out.print(array[i][j]);
            }
            System.out.println(" ");
        }
        System.out.println(array);
    }
}
