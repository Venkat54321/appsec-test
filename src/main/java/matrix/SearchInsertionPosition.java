package matrix;

public class SearchInsertionPosition {

    public static void main(String[] args) {

        int[] array = {1, 3,5};
        int target = 5;
        System.out.println(insertionPosition(array, target));
    }

    public static int insertionPosition(int[] array, int target) {
        int i = 1;
        int j = array.length - 2;
        int n = array.length;
        if(array[array.length - 1] == target){
            return array.length - 1;
        }
        if(target < array[0] )
            return 0;
        if(target > array[array.length - 1]){
            return array.length;
        }
        while (n > i) {
            int mid = (i + j) / 2;
            if (array[mid] == target) {
                return mid;
            }
            if (array[mid] < target && array[mid + 1] > target ) {
                return mid + 1;
            } else if ( array[mid] > target && array[mid - 1] < target) {
                return mid;
            }
            if (array[mid] < target) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return 0;
    }
}
