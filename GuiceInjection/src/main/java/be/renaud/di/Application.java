package be.renaud.di;

import be.renaud.di.config.GuiceConfig;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Application {

    public static void main(String[] args) {

        Injector injector = Guice.createInjector(new GuiceConfig());
    }
}

