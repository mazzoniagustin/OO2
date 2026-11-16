package io.github.unlp.oo;

import java.util.List;

public abstract class WeatherDeco implements WeatherData{
    protected WeatherData component;

    public WeatherDeco(WeatherData component) {
        this.component = component;
    }

    @Override
    public double getTemperatura() {
        return component.getTemperatura();
    }

    @Override
    public double getPresion() {
        return component.getPresion();
    }

    @Override
    public double getRadiacionSolar() {
        return component.getRadiacionSolar();
    }

    @Override
    public List<Double> getTemperaturas() {
        return component.getTemperaturas()
    }

    @Override
    public String displayData() {
        return component.displayData();
    }
}
