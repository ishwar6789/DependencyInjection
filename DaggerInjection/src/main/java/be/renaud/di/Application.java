package be.renaud.di;

import java.util.ArrayList;
import java.util.Collection;

import be.renaud.di.cleaningTools.Bucket;
import be.renaud.di.cleaningTools.Sponge;
import be.renaud.di.helpers.DomesticHelp;
import be.renaud.di.services.CleaningService;

public class Application {

    /*@Component(modules = {DaggerConfig.class})
    @Singleton
    interface CoffeeShop {
        CoffeeMaker maker();
    }

    public static void main(String[] args) {
        CoffeeShop coffeeShop = DaggerApplication_CoffeeShop.builder()
                //.daggerConfig(new DaggerConfig()) // TODO: 4/1/16 what does this code do ?
                .build();

        coffeeShop.maker().brew();
    }*/


    public static void main(String[] args) {

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
