package nl.hi.datacleaner.utils;

import org.netbeans.jemmy.ClassReference;
import org.netbeans.jemmy.operators.JButtonOperator;
import org.netbeans.jemmy.operators.JDialogOperator;
import org.netbeans.jemmy.operators.JFrameOperator;

public class Helper {
    public static final String DATA_CLEANER= "org.datacleaner.Main";
    public static final int OK = 0;
    public static final int ERROR = 1;
    
    public static JFrameOperator getMainFrame() throws RuntimeException {
        try {
            new ClassReference(Helper.DATA_CLEANER).startApplication();
            final JFrameOperator mainFrame = new JFrameOperator("Welcome | DataCleaner");
            final JDialogOperator dialog = new JDialogOperator(mainFrame, "Sign in to DataCloud | DataCleaner");
            new JButtonOperator(dialog, "Close").push(); 
            
            return mainFrame;
        } catch(Exception e) {
            Helper.log(Helper.class.getName(), e);
            throw new RuntimeException("DataCleaner main JFrame was not found. ");
        }
    }
    
    public static void wait(int seconds) {
        try {
            Thread.sleep(1000 * seconds);
        } catch (InterruptedException e) {
            // ignore
        }
    }
    
    public static void log(String className, Exception exception) {
        System.err.println("LOG(" + className + "): " + exception.getMessage());
    }   
    
    public static void log(Object test, Exception exception) {
        System.err.println("LOG(" + test.getClass().toString() + "): " + exception.getMessage());
    }
}
