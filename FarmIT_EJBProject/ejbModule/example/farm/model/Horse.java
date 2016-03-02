package example.farm.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Transient;

@Entity
@DiscriminatorValue("Horse")
public class Horse extends Animal {

	private int amountOfPowerFeed;
	private int amountOfHay;

	@Column(name = "AmountOfPowerFeed")
	public int getAmountOfPowerFeed() {
		return amountOfPowerFeed;
	}

	public void setAmountOfPowerFeed(int amountOfPowerFeed) {
		this.amountOfPowerFeed = amountOfPowerFeed;
	}

	public int getAmountOfHay() {
		return amountOfHay;
	}

	public void setAmountOfHay(int amountOfHay) {
		this.amountOfHay = amountOfHay;
	}

	@Transient
	public int getAmountOfFood() {
		return amountOfPowerFeed;
	}
	@Transient
	public int getAmountOfFoodAgain() {
		return amountOfHay;
	}
	@Transient
	public void setAmountOfFood(int amountOfPowerFeed) {
		this.amountOfPowerFeed = amountOfPowerFeed;
	}
	@Transient
	public void setAmountOfFoodAgain(int amountOfHay) {
		this.amountOfHay = amountOfHay;
	}
}
