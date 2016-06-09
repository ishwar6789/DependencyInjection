package be.renaud.di.Benchmarks;

import be.renaud.di.ProtoStudent;
import be.renaud.di.Student;
import be.renaud.di.config.GuiceConfig;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Before;
import org.junit.Test;

public class GuiceBenchmarks {

    private Injector injector;
    private long time;
    private long before;
    private long after;
    private int numberOfTests = 10000000;
    private int numberOfPreRuns = 100000;

    @Before
    public void setUp() {

        injector = Guice.createInjector(new GuiceConfig());
    }

    @Test
    public void getSingleton() {
        time = 0;
        //Make sure everything is loaded
        for (int i = 0; i < numberOfPreRuns; i++) {
            injector.getInstance(Student.class);
        }

        for (int i = 0; i < numberOfTests; i++) {
            before = System.nanoTime();
            injector.getInstance(Student.class);
            after = System.nanoTime();
            time += after - before;
        }
        System.out.println("--Guice Singleton--");
        System.out.println("Elapsed time: " + time);
        System.out.println("Average:" + time / numberOfTests);
    }

    @Test
    public void getPrototype() {
        time = 0;
        //Make sure everything is loaded
        for (int i = 0; i < numberOfPreRuns; i++) {
            injector.getInstance(ProtoStudent.class);
        }

        for (int i = 0; i < numberOfTests; i++) {
            before = System.nanoTime();
            injector.getInstance(ProtoStudent.class);
            after = System.nanoTime();
            time += after - before;

        }
        System.out.println("--Guice Prototype--");
        System.out.println("Elapsed time: " + time);
        System.out.println("Average:" + time / numberOfTests);
    }
}
