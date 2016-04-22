package be.renaud.di.config;

import static java.util.Arrays.asList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

import be.renaud.di.HelpTeam;
import be.renaud.di.cleaningTools.Broom;
import be.renaud.di.cleaningTools.Bucket;
import be.renaud.di.cleaningTools.CleaningTool;
import be.renaud.di.cleaningTools.Sponge;
import be.renaud.di.cleaningTools.VacuumCleaner;
import be.renaud.di.helpers.AbstractHelper;
import be.renaud.di.helpers.DomesticHelp;
import be.renaud.di.services.CleaningService;

@Configuration
public class SpringConfig {

    @Bean
    CleaningTool broom(){
        return new Broom();
    }

    @Bean
    CleaningTool bucket(){
        return new Bucket();
    }

    @Bean
    CleaningTool sponge(){
        return new Sponge();
    }

    @Bean
    CleaningTool vacuumCleaner(){
        return new VacuumCleaner();
    }

    @Bean
    AbstractHelper jane(){
        CleaningService jane = new CleaningService();
        jane.setName("Jane");
        jane.setRate(2.5f);
        jane.setCleaningTool(broom());
        return jane;
    }

    @Bean
    AbstractHelper mary(){
        CleaningService mary = new CleaningService();
        mary.setName("Mary");
        mary.setRate(4f);
        mary.setCleaningTool(vacuumCleaner());
        return mary;
    }

    @Bean
    AbstractHelper lana(){
        CleaningService lana = new CleaningService();
        lana.setName("Lana");
        lana.setRate(5.5f);
        lana.setCleaningTool(bucket());
        return lana;
    }

    @Bean
    AbstractHelper archer(){
        CleaningService archer = new CleaningService();
        archer.setName("Archer");
        archer.setRate(7.5f);
        archer.setCleaningTool(vacuumCleaner());
        return archer;
    }

    @Bean
    HelpTeam teamJaneMary(){
        HelpTeam janeMary = new HelpTeam();
        janeMary.setHelpers(asList(jane(), mary()));
        return janeMary;
    }

    @Bean
    HelpTeam teamArcher(){
        HelpTeam teamArcher = new HelpTeam();
        teamArcher.setHelpers(asList(lana(), archer()));
        return teamArcher;
    }
}
