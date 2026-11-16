package io.github.unlp.oo;

import java.util.List;
import java.util.stream.Collectors;

public class CelsiusDeco extends WeatherDeco{

    public CelsiusDeco(WeatherData component) {
        super(component);
    }

    @Override
    public double getTemperatura() {
        return calculoCelsius(this.component.getTemperatura());
    }

    private double calculoCelsius(double temp) {
        return (temp - 32) / 1.8;
    }

    @Override
    public List<Double> getTemperaturas() {
        return this.component.getTemperaturas().stream().map(temp -> calculoCelsius(temp)).collect(Collectors.toList());
    }


}
