package example.farm.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Transient;

@Entity
@DiscriminatorValue("Pig")
public class Pig extends Animal {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name="AmountOfPowerFeed")
	private int amountOfPowerFeed;

	public int getAmountOfPowerFeed() {
		return amountOfPowerFeed;
	}

	public void setAmountOfPowerFeed(int amountOfPowerFeed) {
		this.amountOfPowerFeed = amountOfPowerFeed;
	}
	@Transient
	public int getAmountOfFood(){
		return amountOfPowerFeed;
	}
	@Transient
	public void setAmountOfFood(int amountOfPowerFeed) {
		this.amountOfPowerFeed = amountOfPowerFeed;
	}
}
