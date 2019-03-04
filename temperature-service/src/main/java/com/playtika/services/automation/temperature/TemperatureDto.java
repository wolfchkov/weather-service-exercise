package com.playtika.services.automation.temperature;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TemperatureDto {

    private int temp;
    private long timestamp;
}
