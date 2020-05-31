package matrix;

import org.apache.spark.sql.sources.In;

import java.util.HashMap;
import java.util.Map;

public class ConvertNumberToWord {

        static Map<Integer,String> singleDigitMap = new HashMap<>();
        static Map<Integer,String> tensDigitsMap = new HashMap<>();
        static Map<Integer,String> teenDigitsMap = new HashMap<>();
        static Map<Integer,String> threeDigitsMap = new HashMap<>();
        static Map<Integer,String> fourDigitsMap = new HashMap<>();
        static {
            singleDigitMap.put(1, "one");
            singleDigitMap.put(2, "two");
            singleDigitMap.put(3, "Three");
            singleDigitMap.put(4, "four");
            singleDigitMap.put(5, "five");
            singleDigitMap.put(6, "six");
            singleDigitMap.put(7, "seven");
            singleDigitMap.put(8, "eight");
            singleDigitMap.put(9, "nine");

            tensDigitsMap.put(10, "ten");
            tensDigitsMap.put(20, "twenty");
            tensDigitsMap.put(30, "Thirty");
            tensDigitsMap.put(40, "forty");
            tensDigitsMap.put(50, "Fifty");
            tensDigitsMap.put(60, "sixty");
            tensDigitsMap.put(70, "seventy");
            tensDigitsMap.put(80, "eight");
            tensDigitsMap.put(90, "ninety");

            threeDigitsMap.put(100, "hundred");

            fourDigitsMap.put(1000, "thousand");

            teenDigitsMap.put(11, "eleven");
            teenDigitsMap.put(12, "twelve");
            teenDigitsMap.put(13, "thirteen");
            teenDigitsMap.put(14, "fourteen");
            teenDigitsMap.put(15, "fifteen");
            teenDigitsMap.put(16, "sixteen");
            teenDigitsMap.put(17, "seventeen");
            teenDigitsMap.put(18, "eighteen");
            teenDigitsMap.put(19, "nineteen");
        }

    public static void main(String[] args) {
        StringBuilder finaStr= new StringBuilder();
        int num = 1255;
        int i = 1;
        while (num > 0){
            int rem = num % 10;
            num = num / 10;
             String value = getStringValue(i,rem);
            i ++;
            finaStr = new StringBuilder(value + " " + finaStr + " ");
        }
        System.out.println(finaStr);
    }

    public static String getStringValue(int i,int rem){
            String s = "";

        switch (i){
            case 1 :
                    s = singleDigitMap.get(rem);
                    break;
            case 2 : String remStr = String.valueOf(rem);
                     remStr = remStr + "0";
                     Integer value = Integer.valueOf(remStr);
                     s = tensDigitsMap.get(value);
                     break;
            case 3 :
                     s =  singleDigitMap.get(rem);
                     break;
            case 4:  String remStr2 = String.valueOf(rem);
                     remStr2 = remStr2 + "000";
                     Integer value2 = Integer.valueOf(remStr2);
                     s =  fourDigitsMap.get(value2);
                     break;
        }
        return s;
    }
}
