package example.farm.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;

@Entity
//@NamedQuery(name = "Cow.feedCowsSum", query = "SELECT SUM(AmountOfPowerFeed) FROM Animal a WHERE dtype like 'Cow'")
@DiscriminatorValue("Cow")
public class Cow extends Animal {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int amountOfPowerFeed;
	
	@Column(name="AmountOfPowerFeed")
	public int getAmountOfPowerFeed() {
		return amountOfPowerFeed;
	}

	public void setAmountOfPowerFeed(int amountOfPowerFeed) {
		this.amountOfPowerFeed = amountOfPowerFeed;
	}
}
