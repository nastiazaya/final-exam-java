package com.epam.producer.services;

import lombok.SneakyThrows;
import com.epam.common.model.Quote;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


public class QuoterSaverImpl implements QuoterSaver {

    @InjectValue("producer_output_location")
    private String locationDir;

    @SneakyThrows
    @Override
    public void save(Quote quote) {
        String timeStamp = String.valueOf(quote.getId());
        File file = new File(locationDir + "quote_" + timeStamp);
        file.createNewFile();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject(quote);
    }
}
