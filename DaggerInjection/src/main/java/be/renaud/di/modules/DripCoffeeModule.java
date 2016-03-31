package be.renaud.di.modules;

import be.renaud.di.heaters.ElectricHeater;
import be.renaud.di.heaters.Heater;
import be.renaud.di.pumps.Pump;
import be.renaud.di.pumps.Thermosiphon;
import dagger.Module;
import dagger.Provides;

@Module
public class DripCoffeeModule {
    @Provides static Heater provideHeater() {
        return new ElectricHeater();
    }

    @Provides static Pump providePump(Thermosiphon pump) {
        return pump;
    }
}


