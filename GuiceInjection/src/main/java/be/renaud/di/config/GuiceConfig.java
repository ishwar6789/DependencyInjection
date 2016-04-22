package be.renaud.di.config;

import static java.util.Arrays.asList;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Named;

import be.renaud.di.HelpTeam;
import be.renaud.di.cleaningTools.Broom;
import be.renaud.di.cleaningTools.Bucket;
import be.renaud.di.cleaningTools.CleaningTool;
import be.renaud.di.cleaningTools.Sponge;
import be.renaud.di.cleaningTools.VacuumCleaner;
import be.renaud.di.helpers.AbstractHelper;
import be.renaud.di.services.CleaningService;

public class GuiceConfig extends AbstractModule {

    @Override
    protected void configure() {

    }

    @Provides
    @Named("Broom")
    CleaningTool providesBroom() {
        return new Broom();
    }

    @Provides
    @Named("Bucket")
    CleaningTool providesBucket() {
        return new Bucket();
    }

    @Provides
    @Named("Sponge")
    CleaningTool providesSponge() {
        return new Sponge();
    }

    @Provides
    @Named("VacuumCleaner")
    CleaningTool providesVacuumCleaner() {
        return new VacuumCleaner();
    }

    @Provides
    @Named("Jane")
    AbstractHelper providesJane() {
        CleaningService jane = new CleaningService();
        jane.setName("Jane");
        jane.setRate(2.5f);
        jane.setCleaningTool(providesBroom());
        return jane;
    }

    @Provides
    @Named("Mary")
    AbstractHelper providesMary() {
        CleaningService mary = new CleaningService();
        mary.setName("Mary");
        mary.setRate(4f);
        mary.setCleaningTool(providesVacuumCleaner());
        return mary;
    }

    @Provides
    @Named("Lana")
    AbstractHelper providesLana() {
        CleaningService lana = new CleaningService();
        lana.setName("Lana");
        lana.setRate(5.5f);
        lana.setCleaningTool(providesBucket());
        return lana;
    }

    @Provides
    @Named("Archer")
    AbstractHelper providesArcher() {
        CleaningService archer = new CleaningService();
        archer.setName("Archer");
        archer.setRate(7.5f);
        archer.setCleaningTool(providesVacuumCleaner());
        return archer;
    }

    @Provides
    @Named("TeamJaneMary")
    HelpTeam providesTeamJaneMary() {
        HelpTeam janeMary = new HelpTeam();
        janeMary.setHelpers(asList(providesJane(), providesMary()));
        return janeMary;
    }

    @Provides
    @Named("TeamArcher")
    HelpTeam teamArcher() {
        HelpTeam teamArcher = new HelpTeam();
        teamArcher.setHelpers(asList(providesLana(), providesArcher()));
        return teamArcher;
    }
}
