package com.epam.consumer.services;

import com.epam.common.model.Quote;
import com.epam.producer.services.InjectValue;
import lombok.SneakyThrows;
import org.json.simple.JSONObject;

import java.io.FileWriter;

public class QuoterSaverImpl implements QuoterSaver {

    @InjectValue("consumer_output_location")
    private String locationDir;

    @SneakyThrows
    @Override
    public void save(Quote quote) {
        String timeStamp = String.valueOf(quote.getId());
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("ID" , quote.getId());
        jsonObject.put("text", quote.getText());
        jsonObject.put("status", quote.getStatus());
        FileWriter file = new FileWriter(locationDir + "quote_" + timeStamp);
        file.write(jsonObject.toJSONString());
        file.close();
    }
}
