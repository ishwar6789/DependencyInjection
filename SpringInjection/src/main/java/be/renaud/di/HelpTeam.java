package be.renaud.di;

import java.util.Collection;

import be.renaud.di.helpers.DomesticHelp;

public class HelpTeam implements DomesticHelp {

    private Collection<DomesticHelp> helpers;

    public void doJob() {

        helpers.forEach(DomesticHelp::doJob);
    }

    public void setHelpers(Collection<DomesticHelp> helpers) {
        this.helpers = helpers;
    }
}
