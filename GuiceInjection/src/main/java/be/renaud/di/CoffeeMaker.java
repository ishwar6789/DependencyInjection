package be.renaud.di;

import be.renaud.di.heaters.Heater;
import be.renaud.di.pumps.Pump;
import com.google.inject.Inject;

public class CoffeeMaker {

    private Pump pump;
    private Heater heater;

    @Inject CoffeeMaker(Heater heater, Pump pump) {
        this.heater = heater;
        this.pump = pump;
    }

    public void brew() {
        System.out.println();
        heater.on();
        pump.pump();
        System.out.println(" [_]P coffee! [_]P ");
        heater.off();
    }
}
