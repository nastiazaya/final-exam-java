package consumer;

import model.Quote;

import java.io.File;

public interface FileInput {
    Quote readFromFile(File file);
}
