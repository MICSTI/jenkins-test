package at.fhj.itm.ci.test;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import at.fhj.itm.ci.App;


public class CITest {
	
	App myApp;
	
	@Before
	public void setup() {
		myApp = new App();
	}

	@Test
	public void test() {
		assertEquals("Hi ITM13!", myApp.getHello());
	}

}
