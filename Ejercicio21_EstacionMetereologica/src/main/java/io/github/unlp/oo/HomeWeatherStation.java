package io.github.unlp.oo;

import java.util.LinkedList;
import java.util.List;

public class HomeWeatherStation implements WeatherData{
    private double temperatura;
    private double presion;
    private double radiacionSolar;
    private List<Double> temperaturas;


    public HomeWeatherStation(double temperatura, double radiacionSolar, double presion) {
        this.temperatura = temperatura;
        this.radiacionSolar = radiacionSolar;
        this.presion = presion;
        this.temperaturas = new LinkedList<Double>();
    }

    @Override
    public double getTemperatura() {
        return temperatura;
    }

    @Override
    public double getPresion() {
        return presion;
    }

    @Override
    public double getRadiacionSolar() {
        return radiacionSolar;
    }

    @Override
    public List<Double> getTemperaturas() {
        return temperaturas;
    }


    public String displayData() {
        return "Temperatura F: " + this.getTemperatura() +
                "Presión atmosf: " + this.getPresion() +
                "Radiación solar: " + this.getRadiacionSolar();
    }
}
