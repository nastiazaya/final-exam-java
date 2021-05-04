package com.epam.producer.flow;

import lombok.AllArgsConstructor;
import com.epam.common.model.Quote;
import com.epam.producer.services.QuoteProducer;
import com.epam.producer.services.QuoterSaver;


@AllArgsConstructor
public class QuoterProducerFlowManager {
    private QuoteProducer producer;
    private QuoterSaver saver;

    public void saveQuote() {
        Quote quote = producer.producer();
        saver.save(quote);
    }
}
