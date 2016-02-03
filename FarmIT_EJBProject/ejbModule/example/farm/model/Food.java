package example.farm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Foods")
public class Food {
	private long idFood;
	private String typeFood;
	private int amount;
	
	@Id
	@Column(name="idFood")
	public long getIdFood() {
		return idFood;
	}
	public void setIdFood(long idFood) {
		this.idFood = idFood;
	}
	@Column(name="type")
	public String getType() {
		return typeFood;
	}
	public void setType(String type) {
		this.typeFood = type;
	}
	@Column(name="amount")
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}

}
