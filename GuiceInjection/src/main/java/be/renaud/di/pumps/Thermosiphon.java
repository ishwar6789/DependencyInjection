package be.renaud.di.pumps;

import be.renaud.di.heaters.Heater;
import com.google.inject.Inject;

public class Thermosiphon implements Pump {
    @Inject
    private Heater heater;

    public void pump() {
        System.out.println("Thermosiphon: Starting to pump water...");
        System.out.println("Thermosiphon: Asking heater to heat water... ");
        heater.heat();
    }
}
