package be.renaud.di;

import be.renaud.di.heaters.Heater;
import be.renaud.di.pumps.Pump;
import org.springframework.beans.factory.annotation.Autowired;

public class CoffeeMaker {

    private final Heater heater; // Create a possibly costly heater only when we use it.
    private final Pump pump;

    @Autowired public CoffeeMaker(Heater heater, Pump pump) {
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
