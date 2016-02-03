package example.farm.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Pig")
public class Pig extends Animal {

	@Column(name="amountOfPowerFeed")
	private int amountOfPowerFeed;

	public int getAmountOfPowerFeed() {
		return amountOfPowerFeed;
	}

	public void setAmountOfPowerFeed(int amountOfPowerFeed) {
		this.amountOfPowerFeed = amountOfPowerFeed;
	}
}
