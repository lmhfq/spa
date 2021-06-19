package com.lmh.spa.consumer.listener;

import com.lmh.spa.consumer.topic.TestTopic;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@EnableBinding(TestTopic.class)
public class TestListener {

    @StreamListener(value = TestTopic.INPUT)
    public void receiveV1(String payload, @Header("version") String version) {
        log.info("Received v1 : " + payload + ", " + version);

        throw new RuntimeException("Message consumer failed!");
    }

//    @StreamListener(value = TestTopic.INPUT)
//    public void receiveV2(String payload, @Header("version") String version) {
//        log.info("Received v2 : " + payload + ", " + version);
//    }
}
