package com.playtika.services.automation.humidity;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.stereotype.Component;

@Component
public class HumidityProvider {
    private static final int MIN_HUMIDITY = 0;
    private static final int MAX_HUMIDITY = 101;

    public int getCurrentPercent() {
        return ThreadLocalRandom.current().nextInt(MIN_HUMIDITY, MAX_HUMIDITY);
    }
}
