package com.playtika.service.weather.humidity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HumidityDto {

    private int percent;
    private long timestamp;
}
