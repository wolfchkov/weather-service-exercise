package com.playtika.service.weather;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.playtika.service.weather.humidity.HumidityFeignClient;
import com.playtika.service.weather.temperature.TemperatureFeignClient;

@SpringCloudApplication
@EnableFeignClients(clients = {HumidityFeignClient.class, TemperatureFeignClient.class})
public class WeatherServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(WeatherServiceApplication.class, args);
    }

}
