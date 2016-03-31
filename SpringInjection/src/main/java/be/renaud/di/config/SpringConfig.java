package be.renaud.di.config;

import be.renaud.di.CoffeeMaker;
import be.renaud.di.heaters.ElectricHeater;
import be.renaud.di.heaters.Heater;
import be.renaud.di.pumps.Pump;
import be.renaud.di.pumps.Thermosiphon;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    CoffeeMaker coffeeMaker() {
        return new CoffeeMaker();
    }

    @Bean
    Pump pump(){
        return new Thermosiphon();
    }

    @Bean
    Heater heater(){
        return new ElectricHeater();
    }

}
