package example.farm.facade;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import example.farm.eao.AnimalBean;
import example.farm.eao.BoxBean;
import example.farm.eao.BuildingBean;
import example.farm.eao.FoodBean;
import example.farm.model.Animal;
import example.farm.model.Box;
import example.farm.model.Building;
import example.farm.model.Cow;
import example.farm.model.Food;
import example.farm.model.Hen;
import example.farm.model.Horse;
import example.farm.model.Pig;

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

	public List<Animal> findAll() {
		return animalb.findAllQuery();
	}

	public List<Animal> findByTypeQuery(String type) {
		return animalb.findByTypeQuery(type);
	}

	// public List<Cow> sumOfCowFoodTHATAREAWESOME(){
	// return cowb.sumOfCowFoodTHATAREAWESOME();
	// }
	public List<Animal> findCows() {
		return animalb.findCows();
	}
	public List<Animal> findHens(){
		return animalb.findHens();
	}
	public List<Animal> findHorses(){
		return animalb.findHorses();
	}
	public List<Animal> findPigs(){
		return animalb.findPigs();
	}
	// Skapa
	public Animal createAnimal(Animal a) {
		return animalb.createAnimal(a);
	}

	public Food createFood(Food f) {
		return foodb.createFood(f);
	}

	public Box createBox(Box a) {
		return boxb.createBox(a);
	}

	public Building createBuilding(Building a) {
		buildingb.createBuilding(a);
		return a;
	}

	// uppdatera
	public Animal updateAnimal(Animal a) {
		return animalb.updateAnimal(a);
	}

	public Food updateFood(Food f) {
		return foodb.updateFood(f);
	}

	public Box updateBox(Box a) {
		return boxb.updateBox(a);
	}

	public Building updateBuilding(Building a) {
		buildingb.updateBuilding(a);
		return a;
	}

	// ta bort
	public void deleteAnimal(long a) {
		animalb.deleteAnimal(a);
	}

	public void deleteFood(long id) {
		foodb.deleteFood(id);
	}

	// hitta
	public Food findByFoodName(String foodName){
		return foodb.findFoodByType(foodName);
	}
	public Animal findByIdAnimal(long a) {
		return animalb.findByIdAnimal(a);
	}

	public Food findByIdFood(long id) {
		return foodb.findByIdFood(id);
	}

	public Box findByIdBox(String id) {
		return boxb.findByIdBox(id);
	}

	public Building findByIdBuilding(String id) {
		return buildingb.findByIdBuilding(id);
	}

	// lägga till
	public void addAnimal(Food f, Animal a) {
		foodb.addAnimal(f, a);
	}

	public void addAmount(Food f, int amount) {
		int amounts = f.getAmount();
		f.setAmount(amounts + amount);
	}

	// Mata ett djur
	public void changeAmountInCow(Cow c, Food f) {
		int amount = c.getAmountOfPowerFeed();
		f.setAmount(f.getAmount() - amount);
	}

	public void changeAmountInHen(Hen h, Food f) {
		int amount = h.getAmountOfOats();
		f.setAmount(f.getAmount() - amount);
	}

	public void changeAmountInHorse(Horse h, Food powerFeed, Food hay) {
		int amountPowerFeed = h.getAmountOfPowerFeed();
		int amountHay = h.getAmountOfHay();
		powerFeed.setAmount(powerFeed.getAmount() - amountPowerFeed);
		hay.setAmount(hay.getAmount() - amountHay);
	}

	public void changeAmountInPig(Pig p, Food powerFeed, Food hay) {
		int amountPowerFeed = p.getAmountOfPowerFeed();
		powerFeed.setAmount(powerFeed.getAmount() - amountPowerFeed);
	}

	// Mata
	public void feedCows(long idFood) {
		List<Animal> cows = findByTypeQuery("Cow");
		Food f = findByIdFood(idFood);
		for (Animal a : cows) {
			int amount = a.getAmountOfFood();
			int feedAmount= f.getAmount();
			feedAmount -=amount;
			f.setAmount(feedAmount);
			updateFood(f);
		}
	}
	public void feedHens(long idFood) {
		List<Animal> hens = findByTypeQuery("Hen");
		Food f = findByIdFood(idFood);
		for (Animal a : hens) {
			int amount = a.getAmountOfFood();
			int feedAmount= f.getAmount();
			feedAmount -=amount;
			f.setAmount(feedAmount);
			updateFood(f);
		}
	}
	public void feedHorses(long idFood,long idF) {
			List<Animal> horses = findByTypeQuery("Horse");
			Food f = findByIdFood(idFood);
			Food f2 = findByIdFood(idF);
			for (Animal a : horses) {
				int amount = a.getAmountOfFood();
				int amount2 = a.getAmountOfFoodAgain();
				int feedAmount= f.getAmount();
				int feedAmount2= f2.getAmount();
				feedAmount2-=amount2;
				feedAmount -=amount;
				f2.setAmount(feedAmount2);
				f.setAmount(feedAmount);
				updateFood(f2);
				updateFood(f);
			}
		
	}
	public void feedPigs(long idFood) {
		List<Animal> pigs = findByTypeQuery("Pig");
		Food f = findByIdFood(idFood);
		for (Animal a : pigs) {
			int amount = a.getAmountOfFood();
			int feedAmount= f.getAmount();
			feedAmount -=amount;
			f.setAmount(feedAmount);
			updateFood(f);
		}
	}


			
	public void feedAllAnimals(long idPowerFeed, long idOats,long idHay){
		feedPigs(idPowerFeed);
		feedHorses(idPowerFeed,idHay);
		feedHens(idOats);
		feedCows(idPowerFeed);
	}

	

}
