package example.farm.facade;

import javax.ejb.Local;

import example.farm.model.Animal;
import example.farm.model.Food;

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

}
