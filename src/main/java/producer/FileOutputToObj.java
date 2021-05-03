package producer;

import lombok.SneakyThrows;
import model.Quote;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class FileOutputToObj implements FileOutput {
    @SneakyThrows
    @Override
    public void writeToFile(Quote quote) {
        String filePath = "src/main/java/objfile/" + quote.getId() + ".obj";
        File file = new File(filePath);
        file.createNewFile();
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(quote);
        oos.close();
        fos.close();

    }
}
