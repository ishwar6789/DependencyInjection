package be.renaud.di.config;

import be.renaud.di.CoffeeMaker;
import be.renaud.di.heaters.ElectricHeater;
import be.renaud.di.heaters.Heater;
import be.renaud.di.pumps.Pump;
import be.renaud.di.pumps.Thermosiphon;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringConfig {

    @Bean
    @Scope(value = "prototype")
    CoffeeMaker coffeeMaker() {
        return new CoffeeMaker(heater(), pump());
    }

    @Bean
    @Scope(value = "prototype")
    Pump pump(){
        return new Thermosiphon(heater());
    }

    @Bean
    Heater heater(){
        return new ElectricHeater();
    }

}
