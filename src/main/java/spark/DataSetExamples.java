package spark;

import org.apache.spark.api.java.function.MapFunction;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Encoder;
import org.apache.spark.sql.Encoders;
import org.apache.spark.sql.SparkSession;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

public class DataSetExamples {

    public static void main(String[] args) {

        SparkSession sparkSession = SparkSession.builder()
                             .master("local")
                             .appName("Test")
                             .getOrCreate();

        Person person = new Person();

        person.setName("Venkat");
        person.setAge(27);

        Encoder<Person> encoder = Encoders.bean(Person.class);
        Dataset<Person> dataset = sparkSession.createDataset(Collections.singletonList(person),encoder);

       dataset.show();



    }
}
