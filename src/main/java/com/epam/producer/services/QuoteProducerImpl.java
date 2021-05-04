package com.epam.producer.services;

import com.epam.infra.Singleton;
import com.epam.common.model.Quote;
import com.epam.common.model.Status;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Singleton
public class QuoteProducerImpl {

    private IdGeneratorImpl idGeneratorImpl;
    private QuoteGenerator randonQuote;


    public Quote producer(){

        String newQuote = randonQuote.getQuoteText();

        Quote quote = Quote.builder()
                .id(idGeneratorImpl.getNewID())
                .text(newQuote)
                .status(Status.getStatus(newQuote.length()))
                .build();

        return quote;
    }






}
