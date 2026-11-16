package io.github.unlp.oo;

import java.util.List;

public class PromDeco extends WeatherDeco{


    public PromDeco(WeatherData component) {
        super(component);
    }

    @Override
    public double getTemperatura() {
        return component.getTemperatura();
    }

    public double getProm() {
        return component.getTemperaturas().stream().mapToDouble(prom -> component.getTemperatura()).average().orElse(0);
    }

    @Override
    public String displayData() {
        return "";
    }
}
