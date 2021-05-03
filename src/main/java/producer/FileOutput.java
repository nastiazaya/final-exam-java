package producer;

import model.Quote;

public interface FileOutput {

    void writeToFile(Quote quote);
}
