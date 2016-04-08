package be.renaud.di;

import java.util.ArrayList;
import java.util.Collection;

import be.renaud.di.cleaningTools.Bucket;
import be.renaud.di.cleaningTools.Sponge;
import be.renaud.di.config.GuiceConfig;
import be.renaud.di.helpers.DomesticHelp;
import be.renaud.di.services.CleaningService;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Application {

    public static void main(String[] args) {

        /*Injector injector = Guice.createInjector(new GuiceConfig());

        CoffeeMaker myCoffeeMaker = injector.getInstance(CoffeeMaker.class);

        myCoffeeMaker.makeCoffee();*/

        HelpTeam myHelpTeam = new HelpTeam();
        Collection<DomesticHelp> myHelpers = new ArrayList<>();
        CleaningService myFirstCleaningLady = new CleaningService();
        CleaningService mySecondCleaningLady = new CleaningService();

        myFirstCleaningLady.setName("Lulita");
        myFirstCleaningLady.setRate(5f);
        myFirstCleaningLady.setCleaningTool(new Bucket());
        mySecondCleaningLady.setName("Maria");
        mySecondCleaningLady.setRate(8.5f);
        mySecondCleaningLady.setCleaningTool(new Sponge());

        myHelpers.add(myFirstCleaningLady);
        myHelpers.add(mySecondCleaningLady);

        myHelpTeam.setHelpers(myHelpers);

        myHelpTeam.doJob();
    }
}

