package consumer;

import lombok.SneakyThrows;
import model.Quote;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadObjFile implements  ReadFromFile{
    @SneakyThrows
    @Override
    public Quote readFromFile(File file) {
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream oos = new ObjectInputStream(fis);
        Quote quote = (Quote) oos.readObject();
        fis.close();
        oos.close();
        return quote;
    }
}
