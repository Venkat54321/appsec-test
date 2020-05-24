package matrix;

public class LastIndexInSortedArray {

    public static void main(String[] args) {

        int[] array = {0, 1, 2, 2, 4, 5, 5, 5, 8};
        for(int i=array.length-1;i>0;i--){
            if(array[i] == array[i-1]){
                System.out.println("The number is : " + array[i]);
                break;
            }
        }

    }
}
