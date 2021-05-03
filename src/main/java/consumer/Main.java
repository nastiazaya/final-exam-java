package consumer;

import lombok.SneakyThrows;

import java.io.File;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        Consumer consumer = new Consumer();
        consumer.consumer();
    }
}
