package com.epam.producer;

import com.epam.common.model.Quote;
import com.epam.common.model.Status;
import com.epam.producer.services.*;
import org.junit.Assert;
import org.junit.Test;


import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class IntegrationTestForProducer {
    @Test
    public void testThatProducerCanGenerateQuote() {

        IdGenerator idGeneratorMock = mock(IdGenerator.class);

        when(idGeneratorMock.getNewID()).thenReturn(10L);

        QuoteGenerator quoterGeneratorMock = mock(QuoteGenerator.class);

        when(quoterGeneratorMock.getQuoteText()).thenReturn("I'll be back");

        QuoteProducer producer = new QuoteProducerImpl(idGeneratorMock,quoterGeneratorMock);


        Quote quote = producer.producer();
        Assert.assertNotNull(quote);
        Assert.assertNotNull(quote.getText());
        Assert.assertNotNull(quote.getStatus());
        Assert.assertNotEquals(0, quote.getId());

        if (quote.getText().length() < 10) {
            Assert.assertSame(quote.getStatus(), Status.SHORT);
        }

    }
}