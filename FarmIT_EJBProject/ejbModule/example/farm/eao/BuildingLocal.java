package example.farm.eao;

import javax.ejb.Local;

@Local
public interface BuildingLocal {
	
	public Building findByIdBuilding(long id);

	public Building createBuilding(Building a);

	public Building updateBuilding(Building a);
}
