package spark;

import org.apache.spark.api.java.function.MapFunction;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Encoder;
import org.apache.spark.sql.Encoders;
import org.apache.spark.sql.SparkSession;

import java.util.Arrays;

public class IntegerDataSetExample {

    public static void main(String[] args) {

        SparkSession session = SparkSession.builder()
                                     .master("local")
                                     .appName("Test")
                                     .getOrCreate();

        Encoder integerEncoder = Encoders.INT();
        Dataset integerDataSet = session.createDataset(Arrays.asList(1,2,3,4,5),integerEncoder);
        Dataset map = integerDataSet.map((MapFunction<Integer,Integer>) t -> t + 1, integerEncoder);
        map.collect();

    }
}
