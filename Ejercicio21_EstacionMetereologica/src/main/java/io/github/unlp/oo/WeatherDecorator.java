package io.github.unlp.oo;

import java.util.List;

public abstract class WeatherDecorator implements WeatherData {
    private WeatherData componente;

    public WeatherDecorator(WeatherData componente) {
        this.componente = componente;
    }

    public WeatherData getComponente() {
        return componente;
    }

    @Override
    public double getTemperatura() {
        return this.componente.getTemperatura();
    }

    @Override
    public double getPresion() {
        return this.componente.getPresion();
    }

    @Override
    public double getRadiacionSolar() {
        return this.componente.getRadiacionSolar();
    }

    @Override
    public List<Double> getTemperaturas() {
        return this.componente.getTemperaturas();
    }

    public String displayData() {
        return this.componente.displayData();
    }
}
