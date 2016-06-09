package be.renaud.di.config;

import be.renaud.di.ProtoStudent;
import be.renaud.di.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringConfig {

    @Bean
    Student getStudent(){
        return new Student();
    }

    @Bean
    @Scope("prototype")
    ProtoStudent getProtoStudent(){
        return new ProtoStudent();
    }
}
