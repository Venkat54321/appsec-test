package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReduceTest {

    public static void main(String[] args) {

        String str = "Hello this is Venkat.i'm fine";

        List<String> stringList = Collections.singletonList("Hello this is Venkat hello");


        //find the difference b/w below two logic

        Stream<Object> objectStream = stringList.stream()
                .flatMap(t -> {
                    String[] s = t.split(" ");
                    return Arrays.stream(s);
                });


       /* Stream<Object> objectStream = stringList.stream()
                .map(t -> {
                    String[] s = t.split(" ");
                    return Arrays.stream(s);
                });

*/
        long count = objectStream.count();

        //System.out.println(coun);
    }
}
