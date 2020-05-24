package matrix;

public class FindTheElementAppearOnce {

    public static void main(String[] args) {

        int[] array = {2,4,5,8,1,2,4,8,5};
        int result = 0;
        for(int i=0;i<array.length;i++){
            result = result^array[i];
        }
        System.out.println(result);
    }
}
