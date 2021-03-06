package be.renaud.di.Benchmarks;

import be.renaud.di.ProtoStudent;
import be.renaud.di.Student;
import be.renaud.di.config.SpringConfig;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringBenchmarks {

    private ApplicationContext context = null;
    private long time;
    private long before;
    private long after;
    private int numberOfTests = 10000000;
    private int numberOfPreRuns = 100000;

    @Before
    public void setUp() {
        context = new AnnotationConfigApplicationContext(SpringConfig.class);
    }

    @Test
    public void getSingleton() {
        time = 0;
        //Make sure everything is loaded
        for (int i = 0; i < numberOfPreRuns; i++) {
            context.getBean(Student.class);
        }

        for (int i = 0; i < numberOfTests; i++) {
            before = System.nanoTime();
            context.getBean(Student.class);
            after = System.nanoTime();
            time += after - before;
        }
        System.out.println("--Spring Singleton--");
        System.out.println("Elapsed time: " + time);
        System.out.println("Average:" + time / numberOfTests);
    }

    @Test
    public void getPrototype() {
        time = 0;
        //Make sure everything is loaded
        for (int i = 0; i < numberOfPreRuns; i++) {
            context.getBean(ProtoStudent.class);
        }

        for (int i = 0; i < numberOfTests; i++) {
            before = System.nanoTime();
            context.getBean(ProtoStudent.class);
            after = System.nanoTime();
            time += after - before;

        }
        System.out.println("--Spring Prototype--");
        System.out.println("Elapsed time: " + time);
        System.out.println("Average:" + time / numberOfTests);
    }
}
