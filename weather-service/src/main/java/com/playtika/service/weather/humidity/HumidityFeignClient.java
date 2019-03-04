package com.playtika.service.weather.humidity;

//TODO declare feign client for HUMIDITY-SERVICE
public interface HumidityFeignClient {

    HumidityDto getCurrent();

}
