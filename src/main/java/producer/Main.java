package producer;

import model.Quote;

public class Main {
    public static void main(String[] args) {

        QuoteProducer quoteProducer = new QuoteProducer();
        Quote quote = quoteProducer.producer();
        FileOutput writeObjFile = new FileOutputToObj();
        writeObjFile.writeToFile(quote);
    }
}
