package dp;

public class LongestIncreasingSubSequenceI {

    public static void main(String[] args) {

        int[] array =  {50, 3, 10, 7, 40, 80};
        int globalMax = 0;
        for(int i =0;i<array.length;i++){
            int max = 1;
            int lastIndexSelected = 0;
            for(int j=i;j<array.length;j++){
                if(array[j] > array[i] && array[lastIndexSelected] < array[j]){
                    max ++;
                    lastIndexSelected = j;
                }
            }
            if(max > globalMax){
                globalMax = max;
            }
        }
        System.out.println(globalMax);
    }
}
