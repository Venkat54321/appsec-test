package dp;

public class LongestIncreasingSubSequenceI {

    public static void main(String[] args) {

        int[] array = { 10, 22, 9, 33, 21, 50, 41, 60 };
        int globalMax = 0;
        for(int i =0;i<array.length;i++){
            int max = 0;
            int lastIndex = i;
            for(int j=i;j<array.length ;j++){
                if(array[j] >= array[i] && array[j] >= array[lastIndex]){
                    max ++;
                    lastIndex = j;
                }
            }
            if(max > globalMax){
                globalMax = max;
            }
        }
        System.out.println(globalMax);
    }
}
