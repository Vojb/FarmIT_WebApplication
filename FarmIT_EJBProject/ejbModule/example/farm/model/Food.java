package example.farm.model;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Foods")
public class Food {
	private long idFood;
	private String typeFood;
	private int amount;
	
	@ManyToMany
	@JoinTable(name="Eats",
		joinColumns=
			@JoinColumn(name="idFood",
			referencedColumnName="Animal"),
	inverseJoinColumns =
	@JoinColumn(name="idAnimal",
	referencedColumnName="idAnimal"))
	private ArrayList<Animal> animals = new ArrayList<Animal>();
	
	public ArrayList<Animal> getAnimals() {
		return animals;
	}

	public void setAnimals(ArrayList<Animal> animals) {
		this.animals = animals;
	}

	public void setIdFood(long idFood) {
		this.idFood = idFood;
	}
	
	@Id
	@Column(name = "idFood")
	public long getIdFood() {
		return idFood;
	}


	@Column(name = "type")
	public String getType() {
		return typeFood;
	}

	public void setType(String type) {
		this.typeFood = type;
	}

	@Column(name = "amount")
	public int getAmount() {
		return amount;
	}
	public void addAnimal(Animal e){
		animals.add(e);
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	public void changeAmountInCow(Cow c, Food f){
		int amount = c.getAmountOfPowerFeed();
		f.setAmount(f.getAmount()-amount);
	}
	public void changeAmountInHen(Hen h, Food f){
		int amount = h.getAmountOfOats();
		f.setAmount(f.getAmount()-amount);
	}
	public void changeAmountInHorse(Horse h, Food powerFeed ,Food hay ){
		int amountPowerFeed = h.getAmountOfPowerFeed();
		int amountHay= h.getAmountOfHay();
		powerFeed.setAmount(powerFeed.getAmount()-amountPowerFeed);
		hay.setAmount(hay.getAmount()-amountHay);
	}
	public void changeAmountInPig(Pig p, Food powerFeed ,Food hay ){
		int amountPowerFeed = p.getAmountOfPowerFeed();
		powerFeed.setAmount(powerFeed.getAmount()-amountPowerFeed);
	}
	public void addAmount(Food f, int amount){
		int amounts= f.getAmount();
		f.setAmount(amounts+amount);
	}
	

}
