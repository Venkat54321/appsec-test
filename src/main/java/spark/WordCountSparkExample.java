package spark;

import org.apache.spark.api.java.function.FlatMapFunction;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Encoders;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.streaming.StreamingQuery;

import java.util.Arrays;

public class WordCountSparkExample {

    public static void main(String[] args) throws Exception{

        SparkSession sparkSession = SparkSession.builder()
                                         .appName("Test")
                                         .master("local[1]")
                                         .getOrCreate();

            Dataset<Row> lines = sparkSession
                    .readStream()
                    .format("kafka")
                    .option("kafka.bootstrap.servers", "127.0.0.1:9092")
                    .option("subscribe", "MyTopic")
                    .load();

       // lines.selectExpr("CAST(key AS STRING)");

        /*Dataset<Row> lines = sparkSession
                              .readStream()
                              .format("socket")
                              .option("host","localhost")
                              .option("port",9999)
                              .load();*/

        // (1,2),(1,3),(2,6),(1,5),(2,1)

        // venkat is good
        //colortokens working

        Dataset<String> words = lines.selectExpr("CAST(value AS STRING)")
                                .as(Encoders.STRING())
                                .flatMap((FlatMapFunction<String, String>) x -> Arrays.asList(x.split(" ")).iterator(), Encoders.STRING());
            Dataset<Row> wordCount = words.groupBy("value").count();


            StreamingQuery query = wordCount.writeStream()
                                    .outputMode("complete")
                                    .format("console")
                                    .start();

            query.awaitTermination();



    }
}
