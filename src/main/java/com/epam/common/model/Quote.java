package com.epam.common.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.io.Serializable;

@Getter
@Builder
@AllArgsConstructor
public class Quote implements Serializable {
    private long id;
    private String text;
    private Status status;

}
