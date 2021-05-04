package com.epam.producer.services;


import com.epam.infra.InjectByType;
import com.epam.infra.RandomUtil;
import com.epam.infra.Singleton;
import com.epam.producer.repos.QuoterRepo;

import java.util.List;


@Singleton
public class RandomQuote implements QuoteGenerator {

    @InjectByType
    private final QuoterRepo quoterRepo;
    private List<String> allQuotes;


    public RandomQuote(QuoterRepo quoterRepo) {
        this.quoterRepo = quoterRepo;
        allQuotes = quoterRepo.getAllQuotes();

    }

    @Override
    public String getQuoteText() {
        return RandomUtil.getRandomItem(quoterRepo.getAllQuotes());
    }
}
