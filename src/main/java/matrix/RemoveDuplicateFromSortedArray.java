package matrix;

public class RemoveDuplicateFromSortedArray {

    public static void main(String[] args) {
        int[] array = {1,1,2,2,3,3,3,3,4};

        int i =0;
        for(int j =0;j<array.length - 1;j++){
            if(array[j] != array[j+1]){
                array[i++] = array[j];
            }
        }
        array[i++] = array[array.length - 1];
        for(int k=0;k<i;k++){
            System.out.println(array[k]);
        }


    }
}
