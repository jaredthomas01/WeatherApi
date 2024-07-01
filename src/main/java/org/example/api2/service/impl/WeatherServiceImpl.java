package org.example.api2.service.impl;

import org.example.api2.entity.WeatherEntity;
import org.example.api2.repository.WeatherRepository;
import org.example.api2.service.WeatherService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WeatherServiceImpl implements WeatherService {

    private final WeatherRepository weatherRepository;

    public WeatherServiceImpl(WeatherRepository weatherRepository) {
        this.weatherRepository = weatherRepository;
    }

    @Override
    public List<WeatherEntity> findAllWeather() {
        return weatherRepository.findAll();
    }

    @Override
    public WeatherEntity findByid(Long id) {
        return weatherRepository.findById(id).orElseThrow(() -> new RuntimeException("City not found with id: " + id));
    }

    @Override
    public WeatherEntity saveWeather(WeatherEntity weatherEntity) {
        return weatherRepository.save(weatherEntity);
    }

    @Override
    public WeatherEntity updateWeather(WeatherEntity weatherEntity) {
        return weatherRepository.save(weatherEntity);
    }

    @Override
    public void deleteWeather(Long id) {
        weatherRepository.deleteById(id);
    }

}
