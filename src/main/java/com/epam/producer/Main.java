package com.epam.producer;


import com.epam.infra.ApplicationContext;
import com.epam.infra.JavaConfig;
import com.epam.producer.flow.QuoterProducerFlowManager;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ApplicationContext(JavaConfig.builder().packagesToScan("com.epam").build());
        QuoterProducerFlowManager flowManager = context.getObject(QuoterProducerFlowManager.class);
        flowManager.saveQuote();
    }
}
