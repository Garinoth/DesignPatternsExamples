package designPatternsExamples.singleton.loggerSingleton;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class LoggerTest {
    @Test
    public void testIsSingleton() {
        assertSame("No es la misma referencia", Logger.getLogger(), Logger.getLogger());
    }

    @Test
    public void testSingletonNotNull() {
        assertNotNull(Logger.getLogger());
    }
    
}
