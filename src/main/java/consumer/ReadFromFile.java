package consumer;

import model.Quote;

import java.io.File;

public interface ReadFromFile {
    Quote readFromFile(File file);
}
