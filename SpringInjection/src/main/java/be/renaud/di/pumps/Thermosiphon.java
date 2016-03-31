package be.renaud.di.pumps;

import be.renaud.di.heaters.Heater;
import org.springframework.beans.factory.annotation.Autowired;

public class Thermosiphon implements Pump {
    @Autowired
    private Heater heater;

    public void pump() {
        System.out.println("Thermosiphon: Starting to pump water...");
        System.out.println("Thermosiphon: Asking heater to heat water... ");
        heater.heat();
    }
}
