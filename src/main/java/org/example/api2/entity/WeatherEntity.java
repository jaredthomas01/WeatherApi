package org.example.api2.entity;

import jakarta.persistence.*;

@Entity
@Table(name="WeatherAp")
public class WeatherEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "city_id")
    private Long id;

    @Column(name = "city_name")
    private String city;

    @Column(name = "weatherData")
    private String weatherData;

    @Column(name = "temperature")
    private String temperature;

    @Column(name = "humidity")
    private String humidity;

    @Column(name = "pressure")
    private String pressure;

    @Column(name = "Wind_Speed")
    private String windSpeed;

    @Column(name = "wind_direction")
    private String windDirection;

    public WeatherEntity() {
    }
    public WeatherEntity(Long id, String city, String weatherData, String temperature, String humidity, String pressure, String windSpeed, String windDirection) {
        this.id = id;
        this.city = city;
        this.weatherData = weatherData;
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.windSpeed = windSpeed;
        this.windDirection = windDirection;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getWeatherData() {
        return weatherData;
    }

    public void setWeatherData(String weatherData) {
        this.weatherData = weatherData;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public String getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(String windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }
}


