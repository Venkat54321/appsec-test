package java8;

import java.util.Arrays;
import java.util.List;

public class FilterTest {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        list.stream().filter(t -> t%2 == 0)
                     .map(t -> "Number is :  " + t +" ")
                     .forEach(System.out::println);
    }
}
