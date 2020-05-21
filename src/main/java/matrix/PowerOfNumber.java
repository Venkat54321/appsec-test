package matrix;

public class PowerOfNumber {

    public static void main(String[] args) {

        //power(X,n)
        System.out.println(power(10,5));

    }

    public static int power(int x,int n){

        int result = 1;
        for(int i =1;i<=n;i++){
            result = result * x;
        }


        return result;

    }
}
