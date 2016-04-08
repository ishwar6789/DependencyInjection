package be.renaud.di.services;

import be.renaud.di.cleaningTools.CleaningTool;
import be.renaud.di.helpers.AbstractHelper;

public class CleaningService extends AbstractHelper {

    private CleaningTool cleaningTool;

    public void doJob() {
        cleaningTool.clean();
    }

    public void setCleaningTool(CleaningTool cleaningTool) {
        this.cleaningTool = cleaningTool;
    }
}
