package com.playtika.service.weather;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import com.playtika.service.weather.humidity.HumidityFeignClient;
import com.playtika.service.weather.temperature.TemperatureFeignClient;

@AllArgsConstructor
@Component
public class WeatherService {

    private final TemperatureFeignClient temperatureClient;
    private final HumidityFeignClient humidityClient;

    public WeatherDTO getWeather() {
        //TODO Create WeatherDTO using data from feign clients
        return null;
    }


}
