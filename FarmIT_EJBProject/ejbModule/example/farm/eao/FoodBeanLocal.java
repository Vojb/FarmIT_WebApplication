package example.farm.eao;

import java.util.List;

import javax.ejb.Local;

import example.farm.model.Animal;
import example.farm.model.Food;

@Local
public interface FoodBeanLocal {
	public Food findByIdFood(long id);
	public Food createFood(Food f);
	public Food updateFood(Food f);	
	public void deleteFood(long id);
	public Food findFoodByType(String type);
	public void addAnimal(Food f,Animal a);
//	public void feedCow(Food f);
}
