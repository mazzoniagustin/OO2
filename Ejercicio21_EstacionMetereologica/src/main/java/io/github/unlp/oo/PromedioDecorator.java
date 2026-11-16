package io.github.unlp.oo;

public class PromedioDecorator extends WeatherDecorator{

    public PromedioDecorator(WeatherData componente) {
        super(componente);
    }

    public String displayData() {
        double promedio = this.getTemperaturas().stream().mapToDouble(componente -> this.getTemperatura()).average().orElse(0.0);
        return super.displayData() + " - " + "Promedio: " + promedio;
    }
}
