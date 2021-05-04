package com.epam.consumer.services;

import com.epam.common.model.Quote;

import java.io.File;

public interface QuoteLoader {

    Quote load(File file);
}
