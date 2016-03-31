package be.renaud.di;

import be.renaud.di.modules.DripCoffeeModule;
import dagger.Component;

public class Application {

    @Component(modules = {DripCoffeeModule.class})
    interface CoffeeShop {
        CoffeeMaker maker();
    }

    public static void main(String[] args) {
        CoffeeShop coffeeShop = DaggerApplication_CoffeeShop.builder()
                .dripCoffeeModule(new DripCoffeeModule())
                .build();

        coffeeShop.maker().brew();
    }
}
