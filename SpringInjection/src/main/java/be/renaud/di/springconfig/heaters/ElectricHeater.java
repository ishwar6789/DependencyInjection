package be.renaud.di.springconfig.heaters;

public class ElectricHeater implements Heater {

    public void heat() {
        System.out.println("Electric heater:  warming up.");
    }
}
