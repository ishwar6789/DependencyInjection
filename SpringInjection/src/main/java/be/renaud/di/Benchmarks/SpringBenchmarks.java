package be.renaud.di.Benchmarks;

import be.renaud.di.Student;
import be.renaud.di.config.SpringConfig;
import com.google.caliper.Runner;
import com.google.caliper.SimpleBenchmark;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringBenchmarks extends SimpleBenchmark{

    private ApplicationContext context = null;

    @Override
    protected void setUp() {
        context = new AnnotationConfigApplicationContext(SpringConfig.class);
    }

    public Student timeGetSingleton(int reps) {
        return context.getBean(Student.class);
    }

    public static void main(String[] args) {
        Runner.main(SpringBenchmarks.class, new String[0]);
    }
}
