package be.renaud.di.config;

import be.renaud.di.Student;
import com.google.inject.AbstractModule;

public class GuiceConfig extends AbstractModule {


    @Override
    protected void configure() {
        bind(Student.class).asEagerSingleton();
    }

}
