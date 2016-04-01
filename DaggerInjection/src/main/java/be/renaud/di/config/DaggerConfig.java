package be.renaud.di.config;

import javax.inject.Singleton;

import be.renaud.di.heaters.ElectricHeater;
import be.renaud.di.heaters.Heater;
import be.renaud.di.pumps.Pump;
import be.renaud.di.pumps.Thermosiphon;
import dagger.Module;
import dagger.Provides;

@Module
public class DaggerConfig {
    @Provides @Singleton
    static Heater provideHeater() {
        return new ElectricHeater();
    }

    @Provides static Pump providePump(Thermosiphon pump) {
        return pump;
    }
}


