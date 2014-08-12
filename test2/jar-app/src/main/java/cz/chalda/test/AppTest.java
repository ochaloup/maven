package cz.chalda.test;

import org.junit.Test;

import cz.chalda.App;
import junit.framework.TestCase;

public class AppTest extends TestCase {
	@Test
    public void testApp()  
    {
        assertTrue(App.now().length() > 0 );
    }
}
