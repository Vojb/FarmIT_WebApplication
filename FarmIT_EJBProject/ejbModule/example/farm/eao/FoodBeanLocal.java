package example.farm.eao;

import javax.ejb.Local;

import example.farm.model.Animal;
import example.farm.model.Food;

@Local
public interface FoodBeanLocal {
	public Food findByIdFood(long id);
	public Food createFood(Food f);
	public Food updateFood(Food f);	
	public void deleteFood(long id);
	public void addAnimal(Food f,Animal a);
}
