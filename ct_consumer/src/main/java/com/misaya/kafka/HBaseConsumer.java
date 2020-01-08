package com.misaya.kafka;

import com.misaya.utils.PropertiesUtils;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

import java.util.ArrayList;
import java.util.Arrays;

public class HBaseConsumer    {


    public static void main(String[] args) {
        KafkaConsumer<String, String> kafkaConsumer = new KafkaConsumer<String, String>(PropertiesUtils.properties);
        kafkaConsumer.subscribe(Arrays.asList(PropertiesUtils.getPeoperty("kafka.topics")));
        while (true) {
            ConsumerRecords<String, String> records = kafkaConsumer.poll(1000);
            for (ConsumerRecord cr:records) {
                System.out.println(cr.value());
                
            }
        }
    }


}
