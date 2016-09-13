package nl.hi.datacleaner.utils;

import org.netbeans.jemmy.Scenario;

abstract public class GuiTest implements Scenario {
    abstract public void action();
    
    public int runIt(final Object o) {
        try {
            action();
            return Helper.OK;
        } catch (Exception e) {
            Helper.log(this, e);
            return Helper.ERROR;
        }
    }
}
