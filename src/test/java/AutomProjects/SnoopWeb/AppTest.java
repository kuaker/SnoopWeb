package AutomProjects.SnoopWeb;


import org.junit.Test;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import test.Controller;

/**
 * Unit test for simple App.
 */
public class AppTest {
	
	@Test
	public void TC01SpanValidation() {
		Controller pruebaUnitaria = new Controller();
		pruebaUnitaria.cReadSpan();
	}
    
}
