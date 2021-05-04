package com.epam.consumer.services;


import com.epam.infra.Singleton;
import com.epam.common.model.Quote;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

import java.io.File;


@AllArgsConstructor
@Singleton
public class FileConsumer implements Consumer {

    private QuoteLoader quoteLoader;
    private QuoterSaver quoterSaver;


    @SneakyThrows
    @Override
    public void consume(String dirToConsume, Long interval) {
        File file = new File(dirToConsume);
        while (true) {
            File[] files = file.listFiles();
            if (files != null) {
                for (File nextFile : files) {
                    Thread thread = new Thread(() -> {
                        Quote quote = quoteLoader.load(nextFile);
                        quoterSaver.save(quote);
                    });
                    thread.start();
                }
            }
            Thread.sleep(interval);
        }
    }
}


