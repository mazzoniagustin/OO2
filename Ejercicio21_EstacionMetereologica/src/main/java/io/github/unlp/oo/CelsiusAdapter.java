package io.github.unlp.oo;

import java.util.List;
import java.util.stream.Collectors;

public class CelsiusAdapter implements WeatherData{
    private HomeWeatherStation estacion;

    public CelsiusAdapter(HomeWeatherStation estacion) {
        this.estacion = estacion;
    }

    public HomeWeatherStation getEstacion() {
        return estacion;
    }

    @Override
    public double getTemperatura() {
        return (this.estacion.getTemperatura() - 32) / 1.8;
    }

    @Override
    public double getPresion() {
        return this.estacion.getPresion();
    }

    @Override
    public double getRadiacionSolar() {
        return this.estacion.getRadiacionSolar();
    }

    @Override
    public List<Double> getTemperaturas() {
        return this.estacion.getTemperaturas().stream().map(estacion -> this.getTemperatura()).collect(Collectors.toList());
    }

    public String displayData() {
        return "Temperatura C: " + this.getTemperatura() +
                "Presión atmosf: " + this.getPresion() +
                "Radiación solar: " + this.getRadiacionSolar();
    }
}
