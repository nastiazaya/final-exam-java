package com.epam.producer.services;


import lombok.NoArgsConstructor;

@NoArgsConstructor
public class IdGeneratorImpl implements IdGenerator {

    public long getNewID(){
        return System.nanoTime();
    }
}
