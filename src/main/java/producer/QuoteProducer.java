package producer;

import model.Quote;
import model.Status;
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Random;

@NoArgsConstructor
public class QuoteProducer {
    private  final List<String> quotes = List.of("Hasta la vista, baby",
            "I like this car",
            "Come with me if you want to live",
            "I need your clothes, your boots, and your motorcycle",
            "2 b || ! 2 b");

    private Random random = new Random();



    public void start() {
        long id = System.nanoTime();
        Quote quote = createQyute(id);
        writeToFile(quote);
    }

    private Quote createQyute(long id){
        String randonQuote = quotes.get(random.nextInt(quotes.size()));
        Quote quote = Quote.builder()
                .id(id)
                .text(randonQuote)
                .status(Status.getStatus(randonQuote.length()))
                .build();
        return quote;
    }

    @SneakyThrows
    private void writeToFile(Quote quote){
        String filePath = "src/main/java/final_exam/objfile/" + quote.getId() + ".obj";
        File file = new File(filePath);
        file.createNewFile();
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(quote);
        oos.close();
        fos.close();
    }




}
