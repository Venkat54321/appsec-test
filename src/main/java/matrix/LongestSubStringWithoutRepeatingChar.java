package matrix;

import java.util.HashSet;

public class LongestSubStringWithoutRepeatingChar {

    public static void main(String[] args) {
        String s = "geeksforgeeks";
        int i =0;
        int j =0;
        int max= 0;
        HashSet<Character> hashSet  = new HashSet<>();
        while (j < s.length()){
            if(!hashSet.contains(s.charAt(j))){
                hashSet.add(s.charAt(j));
                j++;
                max = Math.max(max,hashSet.size());
            }else {
                hashSet.remove(s.charAt(j));
                i++;
            }
        }
        System.out.println(max);
    }
}
