package example.farm.model;

import java.util.Set;

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

	private Set<Animal> animals;

	@ManyToMany
	@JoinTable(name = "Eats", joinColumns = @JoinColumn(name = "IdFood", referencedColumnName = "IdFood") , inverseJoinColumns = @JoinColumn(name = "IdAnimal", referencedColumnName = "IdAnimal") )
	public Set<Animal> getAnimals() {
		return animals;
	}

	public void setAnimals(Set<Animal> animals) {
		this.animals = animals;
	}

	public void setIdFood(long idFood) {
		this.idFood = idFood;
	}

	@Id
	@Column(name = "IdFood")
	public long getIdFood() {
		return idFood;
	}

	@Column(name = "Type")
	public String getType() {
		return typeFood;
	}

	public void setType(String type) {
		this.typeFood = type;
	}

	@Column(name = "Amount")
	public int getAmount() {
		return amount;
	}

	public void addAnimal(Animal e) {
		animals.add(e);
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}


}
