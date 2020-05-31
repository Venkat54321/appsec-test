package dp;

public class longestCommonSubsequenceRecursion {

    public static void main(String[] args) {
        String str1 = "AGGTAB";
        String str2 = "GXTXAYB";

        System.out.println(lcsPrint(str1.toCharArray(),str2.toCharArray(),str1.length(),str2.length()));
    }

    public static int lcsPrint(char[] str1,char[] str2,int i,int j){
        if(i ==0 || j==0){
            return 0;
        }else if(str1[i-1] == str2[j-1]){
            return 1 + lcsPrint(str1,str2,i-1,j-1);
        }else
            return Math.max(lcsPrint(str1,str2,i-1,j),lcsPrint(str1,str2,i,j-1));
    }
}
