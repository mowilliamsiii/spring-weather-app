package com.example.springweatherapp.controllers;

import org.springframework.ui.Model;

public class weatherController {

    public String getWeather(Model model){
        Weather weather = new Weather();
        model.addAttribute("weather", weather);
    }
}
