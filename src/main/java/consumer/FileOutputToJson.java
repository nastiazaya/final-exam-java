package consumer;

import lombok.SneakyThrows;
import model.Quote;
import org.json.simple.JSONObject;
import consumer.FileOutput;

import java.io.FileWriter;

public class FileOutputToJson implements FileOutput {
    @SneakyThrows
    @Override
    public void writeToFile(Quote quote) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("ID" , quote.getId());
        jsonObject.put("text", quote.getText());
        jsonObject.put("status", quote.getStatus());
        FileWriter file = new FileWriter("src/main/java/jsonfile/" + quote.getId() + ".json");
        file.write(jsonObject.toJSONString());
        file.close();
    }
}
