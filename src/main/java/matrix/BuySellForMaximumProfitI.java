package matrix;

public class BuySellForMaximumProfitI {

    public static void main(String[] args) {

        int[] array = {100,180,260,310,40,535,695};

        int i = 0;
        int j =1;
        int n = array.length;
        int profit = 0;
        while (n > j){
            if(array[i] < array[j]){
                int diff = array[j] - array[i];
                if(profit < diff){
                    profit = diff;
                }
            }else {
                i = j;
            }
            j++;
        }
        System.out.println(profit);
    }
}
