package nl.hi.datacleaner.tests;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class OpenCloseTest {

    @org.junit.Test
    public void testRunIt() throws Exception {
        try {
            final String[] params = { "nl.hi.datacleaner.tests.OpenClose" };
            org.netbeans.jemmy.Test.main(params);
            assertTrue(true);
        } catch (final Exception e) {
            fail();
        }
    }
}