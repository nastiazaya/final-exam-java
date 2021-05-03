package consumer;

import lombok.SneakyThrows;

import java.io.File;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        Consumer consumer = new Consumer();
        File file = new File("src/main/java/final_exam/objfile/");
        while (true){
            File[] files = file.listFiles();
            if(files != null){
                for (File nextFile : files){
                    Thread thread = new Thread(() -> {
                        consumer.start(nextFile);
                        System.out.println("create: " + nextFile.getName());

                    });
                    thread.start();
                }
            }
            Thread.sleep(10000);
        }
    }
}
