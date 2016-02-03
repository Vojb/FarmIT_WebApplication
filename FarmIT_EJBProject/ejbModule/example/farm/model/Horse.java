package example.farm.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Horse")
public class Horse extends Animal {

	private int amountOfPowerFeed;

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

	private int amountOfHay;
}
