package example.farm.JUnit;

import javax.naming.Context;
import javax.naming.InitialContext;

import example.farm.eao.AnimalBeanLocal;
import example.farm.model.Animal;
import example.farm.model.Box;
import example.farm.model.Cow;
import junit.framework.TestCase;

public class CowTest extends TestCase {
	
	int amountOfPowerFeed;
	int expectedPowerfeed = 5;
	Cow c1;
	Cow c2;
	
	public CowTest(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		amountOfPowerFeed = 5;
		
		c1 = new Cow();
		c1.setAmountOfPowerFeed(amountOfPowerFeed);
		
	}

	public void testGetAmountOfPowerFeed(){
		assertNotNull(c1);
		assertEquals(expectedPowerfeed, c1.getAmountOfPowerFeed());
	}
	
//	public void testFindBoxQuery() {
//		fail("Not yet implemented");
//	}
	protected void tearDown() throws Exception {
		super.tearDown();
		c1 = null;
	}
	
}
