package be.renaud.di;

import java.util.ArrayList;
import java.util.Collection;

import be.renaud.di.cleaningTools.Broom;
import be.renaud.di.cleaningTools.Bucket;
import be.renaud.di.cleaningTools.Sponge;
import be.renaud.di.config.SpringConfig;
import be.renaud.di.helpers.AbstractHelper;
import be.renaud.di.helpers.DomesticHelp;
import be.renaud.di.services.CleaningService;
import com.sun.deploy.ref.Helpers;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration
public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);

        //TransportService transportService = context.getBean(TransportService.class);
        //transportService.transport("the station.");

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

