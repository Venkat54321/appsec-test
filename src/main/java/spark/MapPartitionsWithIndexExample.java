package spark;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MapPartitionsWithIndexExample {

    public static void main(String[] args) {

        SparkConf conf = new SparkConf().setMaster("local[1]").setAppName("TestAPp").setMaster("local");
        JavaSparkContext context = new JavaSparkContext(conf);

        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        JavaRDD<Integer> javaRDD = context.parallelize(list);
        JavaRDD<Integer> partitionSums = javaRDD.mapPartitionsWithIndex((index,iter) -> {
            int sum = 0;
            while (iter.hasNext()) {
                sum += iter.next();
            }
            return Collections.singletonList(sum).iterator();
        },true);

        System.out.println("Output is : " +partitionSums.collect().toString());

    }
}
