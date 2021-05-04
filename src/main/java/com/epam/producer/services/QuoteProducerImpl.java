package com.epam.producer.services;

import com.epam.infra.Singleton;
import com.epam.common.model.Quote;
import com.epam.common.model.Status;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Singleton
public class QuoteProducerImpl implements QuoteProducer {

    private final IdGenerator idGeneratorImpl;
    private final QuoteGenerator randomQuote;

    @Override
    public Quote producer(){

        String newQuote = randomQuote.getQuoteText();

        Quote quote = Quote.builder()
                .id(idGeneratorImpl.getNewID())
                .text(newQuote)
                .status(Status.getStatus(newQuote.length()))
                .build();

        return quote;
    }






}
