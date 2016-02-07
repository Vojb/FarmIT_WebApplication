package example.farm.facade;

import javax.ejb.Local;

import example.farm.model.Animal;
import example.farm.model.Box;
import example.farm.model.Building;
import example.farm.model.Cow;
import example.farm.model.Food;
import example.farm.model.Hen;
import example.farm.model.Horse;
import example.farm.model.Pig;

@Local
public interface FarmFacadeLocal {
	public Animal createAnimal(Animal a);

	public Animal updateAnimal(Animal a);

	public void deleteAnimal(long a);

	public Animal findByIdAnimal(long a);

	public Food findByIdFood(long id);

	public Food createFood(Food f);

	public Food updateFood(Food f);

	public void deleteFood(long id);
	
	public Box findByIdBox(long id);

	public Box createBox(Box a);
	public Box updateBox(Box a);
	public void changeAmountInCow(Cow c, Food f) ;
	

	public void changeAmountInHen(Hen h, Food f) ;
	

	public void changeAmountInHorse(Horse h, Food powerFeed, Food hay);
	
	public Building findByIdBuilding(long id);

	public Building createBuilding(Building a);
	public Building updateBuilding(Building a);
	
	public void changeAmountInPig(Pig p, Food powerFeed, Food hay);

	public void addAmount(Food f, int amount);


}
