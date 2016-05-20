package edu.zhangfan.cs237.producer;

import com.google.common.io.Resources;
import com.google.gson.Gson;
import edu.zhangfan.cs237.common.DriverLocationEvent;
import edu.zhangfan.cs237.common.Event;
import edu.zhangfan.cs237.common.Type;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class SampleProducer {

  public static void main(String[] args) throws IOException {
    Producer<String, String> producer;
    try (InputStream in = Resources.getResource("producer.properties").openStream()) {
      Properties properties = new Properties();
      properties.load(in);
      producer = new KafkaProducer<>(properties);
    }

    Gson gson = new Gson();

    try {
      DriverLocationEvent location;
      Event event;
      for (int i = 0; i < 100; i++) {
        // sadly that Java does not natively support keyword arguments.
        location = new DriverLocationEvent(76, 6177, 3075, 3828, Type.DRIVER_LOCATION);
        producer.send(new ProducerRecord<>("test", Integer.toString(location.getBlockId()), gson.toJson(location)));
      }
    } catch (Throwable throwable) {
      System.out.println("error");
    } finally {
      producer.close();
    }

  }
}
