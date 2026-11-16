package io.github.unlp.oo;

public class MaxDecorator extends WeatherDecorator{

    public MaxDecorator(WeatherData componente) {
        super(componente);
    }


    public String displayData() {
        double max = this.getTemperaturas().stream().max((t1,t2) -> Double.compare(t1,t2)).orElse(0.0);
        return super.displayData() + " - " + "Maxima historica: " + max;
    }
}
