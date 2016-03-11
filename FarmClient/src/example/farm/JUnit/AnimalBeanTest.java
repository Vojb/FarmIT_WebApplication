package example.farm.JUnit;

import javax.naming.Context;
import javax.naming.InitialContext;

import example.farm.eao.AnimalBeanLocal;
import example.farm.model.Animal;
import example.farm.model.Box;
import example.farm.model.Cow;
import junit.framework.TestCase;

public class AnimalBeanTest extends TestCase {
	
	AnimalBeanLocal animal; 
	
	public AnimalBeanTest(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		
		Context context = new InitialContext();
		animal=(AnimalBeanLocal)context.lookup("java:app/FarmIT_EJBProject/AnimalBean!example.farm.eao.AnimalBeanLocal");
	}


	public void testFindByIdAnimal() throws Exception {
		Cow c = new Cow();
		c.setIdAnimal(1001);
		
		long id = 1001;
		assertEquals(animal.findByIdAnimal(1001), c);
	}

//	public void testAnimalMethod() throws Exception {
//		animal.set
//		
//		fail("Not yet implemented");
//	}
//
//	public void testFindBoxQuery() {
//		fail("Not yet implemented");
//	}
	protected void tearDown() throws Exception {
		super.tearDown();
		animal = null;
	}
	
}
