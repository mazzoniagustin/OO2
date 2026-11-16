package io.github.unlp.oo;

public abstract class MixingTank {
    private int heatPer;
    private int mixerPot;
    private double temp, volume;

    public boolean heatPower(int percentage) {
        this.heatPer = percentage;
        return true;
    }

    public boolean mixerPower(int percentage) {
        this.mixerPot = percentage;
        return true;
    }
    public boolean purge() {
        this.volume = 0;
        return true;
    }
    public double upTo() {
        return this.volume;
    }
    public double temperature() {
        return temp;
    }
}
