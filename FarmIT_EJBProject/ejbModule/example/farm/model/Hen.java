package example.farm.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Hen")
public class Hen extends Animal {

	private int amountOfOats;

	@Column(name = "amountOfOats")
	public int getAmountOfOats() {
		return amountOfOats;
	}

	public void setAmountOfOats(int amountOfOats) {
		this.amountOfOats = amountOfOats;
	}
}
