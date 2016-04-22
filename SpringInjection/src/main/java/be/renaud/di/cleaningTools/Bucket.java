package be.renaud.di.cleaningTools;

public class Bucket implements CleaningTool {
    public void clean() {
        System.out.println("Emptying contents of the bucket on the floor.");
    }
}
