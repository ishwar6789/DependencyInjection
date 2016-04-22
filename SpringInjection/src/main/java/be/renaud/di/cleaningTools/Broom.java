package be.renaud.di.cleaningTools;

import org.springframework.stereotype.Component;

@Component
public class Broom implements CleaningTool {
    public void clean() {
        System.out.println("Sweeping floor with broom.");
    }
}
