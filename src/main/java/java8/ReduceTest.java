package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class ReduceTest {

    public static void main(String[] args) {

        String str = "Hello this is Venkat.i'm fine";

        List<String> stringList = Collections.singletonList("Hello this is Venkat hello");
        long val =  stringList.stream().map(t -> t.split(" ")).count();

        System.out.println(val);
    }
}
