package matrix;

import java.util.HashMap;

class SumTwoNum {


    public static void main(String[] args) {
        int[] array = {3,3};
        int[] result = twoSum(array, 6);
        System.out.println(result);

    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        int k = 0;
        while (k < nums.length){
            int diff = target - nums[k];
            if(map.containsKey(diff) && map.get(diff) != k){
                System.out.println("Pair found :" + k +" " + map.get(diff));
                result[0] = k;
                result[1] = map.get(diff);
                break;
            }
            k++;
        }
        return result;
    }
}
