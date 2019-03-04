package com.playtika.services.automation.temperature;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemperatureController {

    private TemperatureProvider temperatureProvider;

    @Autowired
    public TemperatureController(TemperatureProvider temperatureProvider) {
        this.temperatureProvider = temperatureProvider;
    }

    @GetMapping("/api/temperature")
    public TemperatureDto getCurrent() {
        return TemperatureDto.builder()
                .temp(temperatureProvider.getCurrentTemp())
                .timestamp(Instant.now().toEpochMilli())
                .build();
    }

}
