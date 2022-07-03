package com.example.springweatherapp.model;

import java.math.BigDecimal;

public class Weather {
    private String description;
    private BigDecimal temperature;
    private BigDecimal feelsLike;
    private BigDecimal windSpeed;

    public Weather(String description, BigDecimal temperature, BigDecimal feelsLike, BigDecimal windSpeed) {
        this.description = description;
        this.temperature = temperature;
        this.feelsLike = feelsLike;
        this.windSpeed = windSpeed;
    }

    public BigDecimal getTemperature() {
        return temperature;
    }

    public String getDescription() {
        return description;
    }


    public BigDecimal getFeelsLike() {
        return feelsLike;
    }

    public BigDecimal getWindSpeed() {
        return windSpeed;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "description='" + description + '\'' +
                ", temperature='" + temperature + '\'' +
                ", feelsLike=" + feelsLike +
                ", windSpeed=" + windSpeed +
                '}';
    }
}
