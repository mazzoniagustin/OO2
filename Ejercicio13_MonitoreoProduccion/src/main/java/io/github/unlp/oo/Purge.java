package io.github.unlp.oo;

public class Purge extends ProcessStep {

    public boolean basicExecute(MixingTank tank) {
        tank.heatPower(0) && tank.mixerPower(0) && tank.purge();
    }
}
