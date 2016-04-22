package be.renaud.di.helpers;

import static java.lang.String.format;

public abstract class AbstractHelper implements DomesticHelp{
    private String name;
    private float rate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    @Override
    public void doJob(){
        System.out.println(format("%s is working!", name));
    }
}
