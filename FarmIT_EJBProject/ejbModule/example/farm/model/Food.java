package example.farm.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries({
@NamedQuery(name="Food.findByName", query="SELECT a FROM Food a WHERE a.nameFood =:foodType"),
})
@Table(name = "Foods")
public class Food implements Serializable{
	private long idFood;
	private String nameFood;
	private int amount;

	private Set<Animal> animals;

	@ManyToMany(fetch =FetchType.EAGER)
	@JoinTable(name = "Eats", joinColumns = @JoinColumn(name = "IdFood", referencedColumnName = "IdFood") , inverseJoinColumns = @JoinColumn(name = "IdAnimal", referencedColumnName = "IdAnimal"))
	
	
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
	public String getNameFood() {
		return nameFood;
	}

	public void setNameFood(String nameFood) {
		this.nameFood = nameFood;
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
