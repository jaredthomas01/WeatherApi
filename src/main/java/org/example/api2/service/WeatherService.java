package org.example.api2.service;

import org.example.api2.entity.WeatherEntity;
import java.util.List;

public interface WeatherService {
    List<WeatherEntity> findAllWeather();
    WeatherEntity findByid(Long id);
    WeatherEntity saveWeather(WeatherEntity weatherEntity);
    WeatherEntity updateWeather(WeatherEntity weatherEntity);
    void deleteWeather(Long id);


}
