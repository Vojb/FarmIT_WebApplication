package example.farm.eao;

import javax.ejb.Local;

import example.farm.model.Building;

@Local
public interface BuildingBeanLocal {
	
	public Building findByIdBuilding(String id);
	
	public Building createBuilding(Building a);
	
	public Building updateBuilding(Building a);
}
