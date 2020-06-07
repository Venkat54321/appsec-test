package matrix;

public class RemoveElement {

    public static void main(String[] args) {
        int[] array = {3,2,2,3};
        int num = 3;

        int i = 0;
        int j =0;
        int n =array.length;
        while (n > j){
            if(array[j] == num){
                j++;
            }else {
                array[i] = array[j];
                i++;
                j++;

            }
        }
        for (int k=0;k<i;k++){
            System.out.println(array[k]);
        }


    }
}
