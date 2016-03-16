package example.farm.JUnit;

import javax.naming.Context;
import javax.naming.InitialContext;

import example.farm.eao.BuildingBeanLocal;
import example.farm.model.Building;
import junit.framework.TestCase;

public class BuildingBeanTest extends TestCase {

	BuildingBeanLocal building;

	public BuildingBeanTest(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();

		Context context = new InitialContext();
		building = (BuildingBeanLocal) context
				.lookup("java:app/FarmIT_EJBProject/BuildingBean!example.farm.eao.BuildingBeanLocal");
	}

	public void testCreateBuilding() throws Exception {
		Building b = new Building();

		b.setIdBuilding("666");

		building.createBuilding(b);
	}

	public void testFindBuilding() throws Exception {

		building.findByIdBuilding("666");
	}

	public void testDeleteBuilding() {
		building.deleteBuilding("666");
	}
}
