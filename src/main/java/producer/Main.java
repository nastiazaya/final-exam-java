package producer;

import model.Quote;

public class Main {
    public static void main(String[] args) {

        QuoteProducer quoteProducer = new QuoteProducer();
        Quote quote = quoteProducer.producer();
        WriteToFile writeObjFile = new WriteObjFile();
        writeObjFile.writeToFile(quote);
    }
}
