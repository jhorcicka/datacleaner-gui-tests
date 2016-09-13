package nl.hi.datacleaner.tests;

import org.netbeans.jemmy.operators.DialogOperator;
import org.netbeans.jemmy.operators.JFrameOperator;
import org.netbeans.jemmy.operators.JMenuItemOperator;
import org.netbeans.jemmy.operators.JToggleButtonOperator;

import nl.hi.datacleaner.utils.GuiTest;
import nl.hi.datacleaner.utils.Helper;

public class MenuMore extends GuiTest {
    private JFrameOperator _mainFrame;
    private static int WAIT_SECONDS = 0;
    
    public void action() {
        _mainFrame = Helper.getMainFrame();

        clickInMoreMenuAndCloseDialog("Dictionaries");
        clickInMoreMenuAndCloseDialog("Synonyms");
        clickInMoreMenuAndCloseDialog("String patterns");
        clickInMoreWindowsMenu("Welcome");
        clickInMoreMenuAndCloseDialog("DataCleaner monitor");
        openAndCloseOptionsDialog();
        
        _mainFrame.dispose();
    }
    
    private void clickInMoreWindowsMenu(String menuItemText) {
        new JToggleButtonOperator(_mainFrame, "More").push();
        new JMenuItemOperator(_mainFrame, "Windows").push();
        new JMenuItemOperator(_mainFrame, menuItemText).push();
        Helper.wait(WAIT_SECONDS);
    }
    
    private void clickInMoreMenuAndCloseDialog(String menuItemText) {
        new JToggleButtonOperator(_mainFrame, "More").push();
        new JMenuItemOperator(_mainFrame, menuItemText).push();
        Helper.wait(WAIT_SECONDS);
        new DialogOperator().dispose();
    }
    
    private void openAndCloseOptionsDialog() {
        new JToggleButtonOperator(_mainFrame, "More").push();
        new JMenuItemOperator(_mainFrame, "Options").push();
        Helper.wait(WAIT_SECONDS);
        new JFrameOperator("Options | DataCleaner").dispose();
    }
}
