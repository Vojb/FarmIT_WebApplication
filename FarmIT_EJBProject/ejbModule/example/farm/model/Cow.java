package example.farm.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Cow")
public class Cow extends Animal {

	private int amountOfPowerFeed;

	public int getAmountOfPowerFeed() {
		return amountOfPowerFeed;
	}

	public void setAmountOfPowerFeed(int amountOfPowerFeed) {
		this.amountOfPowerFeed = amountOfPowerFeed;
	}
}
