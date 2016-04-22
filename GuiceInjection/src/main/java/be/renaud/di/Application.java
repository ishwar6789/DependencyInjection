package be.renaud.di;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.name.Names;

import be.renaud.di.config.GuiceConfig;

public class Application {

    public static void main(String[] args) {

        Injector injector = Guice.createInjector(new GuiceConfig());

        HelpTeam teamJaneMary = injector.getInstance(Key.get(HelpTeam.class, Names.named("TeamJaneMary")));
        HelpTeam teamArcher = injector.getInstance(Key.get(HelpTeam.class, Names.named("TeamArcher")));

        teamJaneMary.doJob();
        System.out.println();
        teamArcher.doJob();

    }
}

