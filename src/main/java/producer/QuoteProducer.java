package producer;

import model.Quote;
import model.Status;
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


@NoArgsConstructor
public class QuoteProducer {

    private IDGenerade idGenerade = new IDGenerade();
    private QuoteGenetade randonQuote = new RandomQuote();


    public Quote producer(){

        String newQuote = randonQuote.getQuote();

        Quote quote = Quote.builder()
                .id(idGenerade.getNewID())
                .text(newQuote)
                .status(Status.getStatus(newQuote.length()))
                .build();

        return quote;
    }






}
