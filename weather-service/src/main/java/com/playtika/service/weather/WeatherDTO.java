package com.playtika.service.weather;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class WeatherDTO {
    private int temp;
    private int humidity;
}
