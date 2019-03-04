package com.playtika.service.weather.temperature;

//TODO declare feign client for TEMPERATURE-SERVICE
public interface TemperatureFeignClient {

    TemperatureDto getCurrent();

}
