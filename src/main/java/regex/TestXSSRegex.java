package regex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.URLDecoder;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestXSSRegex {

    public static void main(String[] args) throws Exception {

       // String regex = " <![\\-\\[A-Za-z]|<([A-Za-z]{1,12})[\\/ >]|<[^>]+>|(\\b)(on\\S+)(\\s*)=|javascript|(<\\s*)(\\/*)script/i";
        //String regex = "<![\\-\\[A-Za-z]|<([A-Za-z]{1,12})[\\/ >]";
        String regex = "<![\\-\\[A-Za-z]|<([A-Za-z]{1,12})[\\/ >]";
        Pattern pattern = Pattern.compile(regex);

        //List<String> allLines = Arrays.asList("<script\\x20type=\"text/javascript\">javascript:alert(1);</script>");

        List<String> allLines = Files.readAllLines(Paths.get("/home/inct-venkates/test-xss.txt"));
        for (String line : allLines) {
            line = URLDecoder.decode(line, "UTF-8");
            Matcher matcher = pattern.matcher(line);
            boolean isMatch = matcher.find();
            if(isMatch){
                System.out.println(line + "     ====      " + "is true" );
            }else {
                System.out.println(line + "     ====      " + "is false" );
            }
        }

    }
}
