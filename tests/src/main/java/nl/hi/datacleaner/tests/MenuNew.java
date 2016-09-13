package nl.hi.datacleaner.tests;

import org.netbeans.jemmy.operators.JButtonOperator;
import org.netbeans.jemmy.operators.JFrameOperator;
import org.netbeans.jemmy.operators.WindowOperator;

import nl.hi.datacleaner.utils.GuiTest;
import nl.hi.datacleaner.utils.Helper;

public class MenuNew extends GuiTest {
    public void action() {
        final JFrameOperator mainFrame = Helper.getMainFrame();
        new JButtonOperator(mainFrame, "New").push();

        final WindowOperator newWindow = new WindowOperator();
        newWindow.dispose();
        
        mainFrame.dispose();
    }
}
