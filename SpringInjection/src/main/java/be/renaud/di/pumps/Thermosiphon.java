package be.renaud.di.pumps;

import be.renaud.di.heaters.Heater;
import org.springframework.beans.factory.annotation.Autowired;

public class Thermosiphon implements Pump {

    private final Heater heater;

    @Autowired
    public Thermosiphon(Heater heater) {
        this.heater = heater;
    }

    public void pump() {
        if (heater.isHot()) {
            System.out.println("=> => pumping => =>");
        }
    }
}
