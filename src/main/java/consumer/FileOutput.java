package consumer;

import model.Quote;

public interface FileOutput {

    void writeToFile(Quote quote);
}
