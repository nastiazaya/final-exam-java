package com.epam.producer.services;



public class IdGeneratorImpl implements IdGenerator {

    public long getNewID(){
        return System.nanoTime();
    }
}
