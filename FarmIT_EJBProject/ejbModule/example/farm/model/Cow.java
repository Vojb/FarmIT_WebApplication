package example.farm.model;

import javax.persistence.Column;

public class Cow extends Animal {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int amountOfPowerFeed;
	
	@Column(name="amountOfPowerFeed")
	public int getAmountOfPowerFeed() {
		return amountOfPowerFeed;
	}

	public void setAmountOfPowerFeed(int amountOfPowerFeed) {
		this.amountOfPowerFeed = amountOfPowerFeed;
	}
}
