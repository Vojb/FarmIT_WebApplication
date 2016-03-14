package example.farm.JUnit;

import javax.naming.Context;
import javax.naming.InitialContext;

import example.farm.eao.AnimalBeanLocal;
import example.farm.facade.FarmFacade;
import example.farm.facade.FarmFacadeLocal;
import example.farm.model.Cow;
import junit.framework.TestCase;

public class FacadeTest extends TestCase {

FarmFacadeLocal facade; 

	
	public FacadeTest(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		
		Context context = new InitialContext();
		facade=(FarmFacadeLocal)context.lookup("java:app/FarmIT_EJBProject/FarmFacade!example.farm.facade.FarmFacadeLocal");
	}

	
	
	public void testCreateAnimal() throws Exception {
		Cow c = new Cow();
		
		c.setAge("66");
		c.setName("Test");
		c.setIdAnimal(666);
		c.setStatusAnimal("Sick");
		
		facade.createAnimal(c);
	}

	public void testFindAnimal() throws Exception {
		
		facade.findByIdAnimal(666);
	}

	public void testDeleteAnimal() {
		facade.deleteAnimal(666);
	}
	protected void tearDown() throws Exception {
		super.tearDown();

	}
	
}
