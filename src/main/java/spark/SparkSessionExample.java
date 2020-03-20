package spark;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;

public class SparkSessionExample {

    public static void main(String[] args) {

        SparkSession sparkSession = SparkSession
                                .builder().master("local")
                                .appName("TestApp")
                                .config("spark.some.config.option", "some-value")
                                .getOrCreate();

        Dataset<Row> dataset = sparkSession.read().json("/home/inct-venkates/test.json");
        dataset.printSchema();
    }
}
