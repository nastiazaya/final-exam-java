package com.epam.consumer.services;

import lombok.SneakyThrows;

public interface Consumer {
    @SneakyThrows
    void consume(String dirToConsume, Long interval);
}
