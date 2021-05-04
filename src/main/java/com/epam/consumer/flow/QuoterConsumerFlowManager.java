package com.epam.consumer.flow;

import com.epam.consumer.services.Consumer;
import com.epam.producer.services.InjectValue;

public class QuoterConsumerFlowManager {

    @InjectValue("consumer_input_location")
    private String locationDir;
    private Consumer consumer;

    public QuoterConsumerFlowManager(Consumer consumer){
        this.consumer = consumer;
    }

    public void convertQuoteToJson(){
        consumer.consume(locationDir, 10000L);
    }

}
