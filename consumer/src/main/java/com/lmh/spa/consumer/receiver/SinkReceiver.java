package com.lmh.spa.consumer.receiver;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

//@EnableBinding(Sink.class)
//@Slf4j
//public class SinkReceiver {
//
//    @StreamListener(Sink.INPUT)
//    public void receive(Object payload) {
//        log.info("Received: " + payload);
//    }
//
//}
