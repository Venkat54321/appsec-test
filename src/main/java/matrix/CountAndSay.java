package matrix;

public class CountAndSay {

    public static void main(String[] args) {
        int position = 5;
        String result = getCountAndSay("1",1,position);
        System.out.println(result);
    }

    public static String getCountAndSay(String str,int nth,int position){
        StringBuilder sb = new StringBuilder();
        if(nth == position){
            return str;
        }
        char[] chars = str.toCharArray();
        int i = 0;
        int j = 0;
        int n = chars.length - 1;
        while (n >= i){
            int count = 0;
            while (j <= n && chars[i] == chars[j] ){
                count++;
                j++;
            }
            sb.append(count).append(chars[i]);
            i = j;
        }
        return getCountAndSay(sb.toString(),nth + 1,position);
    }
}
