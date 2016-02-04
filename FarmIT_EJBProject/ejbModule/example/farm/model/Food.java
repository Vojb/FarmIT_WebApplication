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

	@ManyToMany(mappedBy="Foods")
	private ArrayList<Animal> animals = new ArrayList<Animal>();

	
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

	public void setAmount(int amount) {
		this.amount = amount;
	}

}
