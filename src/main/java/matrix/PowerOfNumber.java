package matrix;

public class PowerOfNumber {

    public static void main(String[] args) {

        //power(X,n)
        //System.out.println(power1(10,5));
        System.out.println(power2(10,5));

    }

    public static int power1(int x,int n){

        int result = 1;
        for(int i =1;i<=n;i++){
            result = result * x;
        }
        return result;
    }

    public static int power2(int x,int n){
        if(n == 0){
            return 1;
        }
        else if(n %2 == 0){
            int y = power2(x, n/2);
            return y * y;
        }else {
            return x * power2(x,n-1);
        }

    }
}
