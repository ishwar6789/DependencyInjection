package be.renaud.di.config;

import be.renaud.di.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    Student getStudent(){
        return new Student();
    }
}
