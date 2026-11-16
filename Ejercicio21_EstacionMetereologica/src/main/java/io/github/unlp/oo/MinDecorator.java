package io.github.unlp.oo;

public class MinDecorator extends WeatherDecorator{

    public MinDecorator(WeatherData componente) {
        super(componente);
    }

    public String displayData() {
        double min = this.getTemperaturas().stream().min((t1,t2) -> Double.compare(t1,t2)).orElse(0.0);
        return super.displayData() + " - " + "Mínima historica: " + min;
    }

}
