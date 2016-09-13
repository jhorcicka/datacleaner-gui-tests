package nl.hi.datacleaner.tests;

import org.netbeans.jemmy.operators.DialogOperator;
import org.netbeans.jemmy.operators.JButtonOperator;
import org.netbeans.jemmy.operators.JFrameOperator;

import nl.hi.datacleaner.utils.GuiTest;
import nl.hi.datacleaner.utils.Helper;

public class MenuOpen extends GuiTest {
    public void action() {
        final JFrameOperator mainFrame = Helper.getMainFrame();
        new JButtonOperator(mainFrame, "Open").push();

        final DialogOperator dialog = new DialogOperator();
        dialog.dispose();
        
        mainFrame.dispose();
    }
}
