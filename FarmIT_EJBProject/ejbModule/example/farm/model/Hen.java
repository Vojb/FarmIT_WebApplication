package example.farm.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Transient;

@Entity
@DiscriminatorValue("Hen")
public class Hen extends Animal {

	private int amountOfOats;

	@Column(name = "AmountOfOats")
	public int getAmountOfOats() {
		return amountOfOats;
	}

	public void setAmountOfOats(int amountOfOats) {
		this.amountOfOats = amountOfOats;
	}
	@Transient
	public int getAmountOfFood() {
		return amountOfOats;
	}
	@Transient
	public void setAmountOfFood(int amountOfOats) {
		this.amountOfOats = amountOfOats;;
	}
}
