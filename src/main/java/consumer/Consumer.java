package consumer;

import model.Quote;
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;

import consumer.FileOutput;

import java.io.File;


@NoArgsConstructor
public class Consumer {

    FileInput readObjFile = new FileInputFromObj();
    FileOutput wrireJsonFile = new FileOutputToJson();

    @SneakyThrows
    public void consumer(){
        File file = new File("src/main/java/objfile/");
        while (true){
            File[] files = file.listFiles();
            if(files != null){
                for (File nextFile : files){
                    Thread thread = new Thread(() -> {
                        Quote quote = readObjFile.readFromFile(nextFile);
                        wrireJsonFile.writeToFile(quote);
                        System.out.println("create: " + nextFile.getName());

                    });
                    thread.start();
                }
            }
            Thread.sleep(10000);
        }
    }
    }


