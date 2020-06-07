package dp;

public class longestCommonSubsequenceDP {

    public static void main(String[] args) {
        String str1 = "AGGTAB";
        String str2 = "GXTXAYB";

        int[][] m = new int[str1.length() + 1][str2.length() + 1];

        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();
        for(int i =0;i <= c1.length;i++){
            for(int j=0;j <= c2.length;j++){
                if(i ==0 || j==0){
                    m[i][j] = 0;
                }
                else if(c1[i-1] == c2[j-1]){
                    m[i][j] = 1 + m[i-1][j-1];
                }else {
                    m[i][j] = Math.max(m[i-1][j],m[i][j-1]);
                }
            }
        }
        printLCS(m,str1.length(),str2.length(),str1,str2);
    }

    public static void printLCS(int[][] matrix,int m,int n,String str1,String str2){

        int i = m;
        int j = n;
        int length = matrix[m][n];
        System.out.println("Total lenght is :" + length);
        char[] lcs = new char[length+1];
        while (i > 0 && j > 0){
            if(str1.charAt(i-1) == str2.charAt(j-1)){
                lcs[length-1] = str1.charAt(i-1);
                i--;
                j--;
                length--;
            }else if(matrix[i-1][j] > matrix[i][j-1]){
                i--;
            }else {
                j--;
            }
        }
        System.out.println(lcs);

    }
}
