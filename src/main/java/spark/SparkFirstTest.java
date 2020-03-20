package spark;

import org.apache.spark.Partition;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import scala.Tuple1;
import scala.Tuple2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SparkFirstTest {

    public static void main(String[] args) throws Exception {

        SparkConf conf = new SparkConf().setMaster("local[1]").setAppName("TestAPp").setMaster("local");
        JavaSparkContext context = new JavaSparkContext(conf);

        List<Integer> list = Arrays.asList(1,2,3,4,5);

        JavaRDD<Integer> javaRDD = context.parallelize(list);

        Integer sum = javaRDD.reduce(Integer::sum);

        System.out.println("Value is : " + sum);


    }
}
