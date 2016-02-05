package example.farm.facade;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import example.farm.eao.AnimalBean;
import example.farm.eao.BoxBean;
import example.farm.eao.BuildingBean;
import example.farm.eao.FoodBean;
import example.farm.model.Animal;
import example.farm.model.Box;
import example.farm.model.Food;

/**
 * Session Bean implementation class FarmFacade
 */
@Stateless
public class FarmFacade implements FarmFacadeLocal {

	@EJB
	AnimalBean animalb;
	@EJB
	FoodBean foodb;
	@EJB
	BuildingBean buildingb;
	@EJB
	BoxBean boxb;
	
	/**
	 * Default constructor.
	 */
	public FarmFacade() {
		// TODO Auto-generated constructor stub
	}

	public Animal createAnimal(Animal a) {
		return animalb.createAnimal(a);
	}

	public Animal updateAnimal(Animal a) {
		return animalb.updateAnimal(a);
	}

	public void deleteAnimal(long a) {
		animalb.deleteAnimal(a);
	}

	public Animal findByIdAnimal(long a) {
		return animalb.findByIdAnimal(a);
	}

	public Food findByIdFood(long id){
		return foodb.findByIdFood(id);
	}
	public Food createFood(Food f){
		return foodb.createFood(f);
	}

	public Food updateFood(Food f){
		return foodb.updateFood(f);
	}
	public void deleteFood(long id){
		foodb.deleteFood(id);
	}
	public Box findByIdBox(long id){
		return boxb.findByIdBox(id);
	}

	public Box createBox(Box a){
		return boxb.createBox(a);
	}
	public Box updateBox(Box a){
		return boxb.updateBox(a);
	}

}
