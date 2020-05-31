package dp;

public class SubsetSumProblemRecursion {

    public static void main(String[] args) {
        int[] array = {3, 34, 4, 12, 5, 2};
        int sum = 9;
        System.out.println(isSubSet(array,array.length,sum));
    }

    public static boolean isSubSet(int[] array,int n,int sum){
        if(sum == 0)
            return true;
        if(n==0 && sum != 0)
            return false;
        return isSubSet(array,n-1,sum) || isSubSet(array,n-1,sum-array[n-1]);
    }
}
