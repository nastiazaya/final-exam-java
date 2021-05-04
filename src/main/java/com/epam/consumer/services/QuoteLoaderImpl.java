package com.epam.consumer.services;

import com.epam.common.model.Quote;
import lombok.SneakyThrows;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class QuoteLoaderImpl implements QuoteLoader{
    @SneakyThrows
    @Override
    public Quote load(File file) {
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream oos = new ObjectInputStream(fis);
        Quote quote = (Quote) oos.readObject();

        return quote;
    }
}
