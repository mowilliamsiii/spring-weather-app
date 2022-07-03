package com.example.springweatherapp.controllers;

import com.example.springweatherapp.model.Weather;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.math.BigDecimal;

@Controller
public class weatherController {

    @GetMapping("/")
    public String getWeather(Model model){
        Weather weather = new Weather("Cloudy", BigDecimal.ONE, BigDecimal.ZERO, BigDecimal.TEN);
        model.addAttribute("weather", weather);
        return "index";
    }
}
