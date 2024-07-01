package org.example.api2.controller;

import org.example.api2.entity.WeatherEntity;
import org.example.api2.service.WeatherService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Weather")
public class WeatherController {

    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping
    public List<WeatherEntity> findAllWeather() {
        return weatherService.findAllWeather();
    }

    @GetMapping("/{id}")
    public WeatherEntity findWeatherById(@PathVariable("id") Long id) {
        return weatherService.findByid(id);
    }

    @PostMapping
    public WeatherEntity saveWeather(@RequestBody WeatherEntity weatherEntity) {
        return weatherService.saveWeather(weatherEntity);
    }

    @PutMapping("{id}")
    public WeatherEntity updateWeather(@PathVariable Long id,@RequestBody WeatherEntity weatherEntity) {
        weatherEntity.setId(id);
        return weatherService.updateWeather(weatherEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteWeather(@PathVariable("id") Long id) {
        weatherService.deleteWeather(id);
    }


}
