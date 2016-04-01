package be.renaud.di;

import javax.inject.Singleton;

import be.renaud.di.config.DaggerConfig;
import dagger.Component;

public class Application {

    @Component(modules = {DaggerConfig.class})
    @Singleton
    interface CoffeeShop {
        CoffeeMaker maker();
    }

    public static void main(String[] args) {
        CoffeeShop coffeeShop = DaggerApplication_CoffeeShop.builder()
                //.daggerConfig(new DaggerConfig()) // TODO: 4/1/16 what does this code do ?
                .build();

        coffeeShop.maker().brew();
    }
}
