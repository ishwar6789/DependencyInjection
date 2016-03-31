package be.renaud.di;

import be.renaud.di.springconfig.heaters.Heater;
import be.renaud.di.springconfig.pumps.Pump;
import org.springframework.beans.factory.annotation.Autowired;

public class CoffeeMaker {

    @Autowired
    private Pump pump;

    @Autowired
    private Heater heater;

    public void makeCoffee(){
        System.out.println("Coffeemaker: Starting to make coffee... ");
        System.out.println("Coffeemaker: Asking pump to pump water... ");
        pump.pump();
        System.out.println("Coffeemaker: Asking heater to heat pumped water... ");
        heater.heat();
    }
}
