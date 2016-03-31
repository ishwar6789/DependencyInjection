package be.renaud.di.springconfig;

import be.renaud.di.CoffeeMaker;
import be.renaud.di.springconfig.heaters.ElectricHeater;
import be.renaud.di.springconfig.heaters.Heater;
import be.renaud.di.springconfig.pumps.Pump;
import be.renaud.di.springconfig.pumps.Thermosiphon;
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
