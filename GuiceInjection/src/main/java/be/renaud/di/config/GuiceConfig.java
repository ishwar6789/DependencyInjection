package be.renaud.di.config;

import com.google.inject.AbstractModule;

public class GuiceConfig extends AbstractModule {

    @Override
    protected void configure() {
        //bind(Pump.class).to(Thermosiphon.class);
        //bind(Heater.class).to(ElectricHeater.class);
    }
}
