package matrix;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class ImplementStrStartingLength {

    public static void main(String[] args) {

        String str1 = "aaaaa";
        String str2 = "bba";
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        int i = 0;
        int j = 0;
        int ni = str1.length();
        int nj = str2.length();
        int result = -1;
        if(ni == 0 && nj == 0){
            result = -1;
        }

        while (ni > i && nj > j){
            if(ch1[i] == ch2[j]){
                i++;
                j++;
                if(nj == j){
                    result = i - j;
                    break;
                }
            }else {
                i++;
                j = 0;
            }
        }
        System.out.println(result);

    }
}
