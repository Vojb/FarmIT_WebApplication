package example.farm.eao;

import java.util.List;

import javax.ejb.Local;

import example.farm.model.Box;

@Local
public interface BoxBeanLocal {
	
	public Box findByIdBox(String id);

	public Box createBox(Box a);

	public Box updateBox(Box a);
	
	public List<Box> findAllBoxesInBuildingQuery(String idBuilding);
	
	public List<Box> findAllQuery();

}
