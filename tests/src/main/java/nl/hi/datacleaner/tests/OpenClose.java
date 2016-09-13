package nl.hi.datacleaner.tests;

import org.netbeans.jemmy.operators.JFrameOperator;

import nl.hi.datacleaner.utils.GuiTest;
import nl.hi.datacleaner.utils.Helper;

public class OpenClose extends GuiTest {
    public void action() {
        final JFrameOperator mainFrame = Helper.getMainFrame();
        mainFrame.dispose();
    }
}
