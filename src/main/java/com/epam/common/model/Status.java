package com.epam.common.model;

import java.util.Arrays;

public enum Status {
    SHORT(0,9,"short"),
    MEDIUM(10,19,"medium"),
    LONG(20,200,"long");

    private final int min;
    private final int max;
    private final String status;

    Status(int min, int max,String status) {
        this.min = min;
        this.max = max;
        this.status = status;
    }

    public static Status getStatus(int length){
        Status[] status = values();
          return Arrays.stream(status).filter(item -> length >= item.min && length <= item.max)
            .findFirst()
                .orElseThrow(() -> new IllegalStateException(length + " not supported"));
    }

    @Override
    public String toString() {

        return status;
    }
}
