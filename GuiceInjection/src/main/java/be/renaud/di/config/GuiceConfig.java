package be.renaud.di.config;

import be.renaud.di.CoffeeMaker;
import be.renaud.di.heaters.ElectricHeater;
import be.renaud.di.heaters.Heater;
import be.renaud.di.pumps.Pump;
import be.renaud.di.pumps.Thermosiphon;
import com.google.inject.AbstractModule;

public class GuiceConfig extends AbstractModule {

    @Override
    protected void configure() {
        bind(Pump.class).to(Thermosiphon.class);
        bind(Heater.class).to(ElectricHeater.class);
    }
}
