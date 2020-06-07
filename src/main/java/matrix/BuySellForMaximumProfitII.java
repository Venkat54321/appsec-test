package matrix;

public class BuySellForMaximumProfitII {

    public static void main(String[] args) {
        int[] array = {7, 1, 5, 3, 6, 4};

        int i =array[0];
        int j = array[0];
        int k = 0;
        int maxProfit = 0;
        int n = array.length;

        while (k < n-1 ){

            while (k < n-1 && array[k] >= array[k+1]){
                k++;
            }
            i = array[i];
            while (k < n-1 && array[k] <= array[k + 1]){
                k++;
            }
            j = array[j];
            maxProfit = maxProfit + (j - i);
        }
        System.out.println(maxProfit);


    }
}
