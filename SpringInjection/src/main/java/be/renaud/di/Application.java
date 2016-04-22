package be.renaud.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration
public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);

        HelpTeam teamJaneMary = context.getBean("teamJaneMary", HelpTeam.class);
        HelpTeam teamArcher = context.getBean("teamArcher", HelpTeam.class);

        teamJaneMary.doJob();
        System.out.println();
        teamArcher.doJob();

    }
}

