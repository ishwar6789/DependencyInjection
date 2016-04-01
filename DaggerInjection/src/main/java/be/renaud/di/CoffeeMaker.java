package be.renaud.di;

import be.renaud.di.heaters.Heater;
import be.renaud.di.pumps.Pump;
import dagger.Lazy;
import javax.inject.Inject;

public class CoffeeMaker {
    private final Lazy<Heater> heater; // Create a possibly costly heater only when we use it.
    private final Pump pump;

    @Inject CoffeeMaker(Lazy<Heater> heater, Pump pump) {
        this.heater = heater;
        this.pump = pump;
    }

    public void brew() {
        System.out.println();
        heater.get().on();
        pump.pump();
        System.out.println(" [_]P coffee! [_]P ");
        heater.get().off();
    }
}
