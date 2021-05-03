package producer;


import lombok.NoArgsConstructor;
import model.Quote;

import java.util.List;
import java.util.Random;

@NoArgsConstructor
public class RandomQuote implements  QuoteGenetade{

    private  final List<String> quotes = List.of("Hasta la vista, baby",
            "I like this car",
            "Come with me if you want to live",
            "I need your clothes, your boots, and your motorcycle",
            "2 b || ! 2 b");

    private Random random = new Random();
    @Override
    public String getQuote() {
        return quotes.get(random.nextInt(quotes.size()));
    }
}
