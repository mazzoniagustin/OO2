package io.github.unlp.oo;

public class LightMIX extends ProcessStep{

    public boolean basicExecute(MixingTank tank) {
        return tank.heatPower(20) && tank.mixerPower(5);
    }
}
