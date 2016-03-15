package example.farm.JUnit;

import javax.naming.Context;
import javax.naming.InitialContext;

import example.farm.eao.AnimalBeanLocal;
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

		public void testCreateAnimal() throws Exception {
			Cow c = new Cow();
			
			c.setAge("66");
			c.setName("Test");
			c.setIdAnimal(666);
			c.setStatusAnimal("Sick");
			
			animal.createAnimal(c);
		}

		public void testFindAnimal() throws Exception {
			
			animal.findByIdAnimal(666);
		}

		public void testDeleteAnimal() {
			animal.deleteAnimal(666);
		}
		protected void tearDown() throws Exception {
			super.tearDown();

		}
		
	}
