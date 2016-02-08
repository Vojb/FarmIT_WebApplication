package example.farm.model;

import javax.persistence.*;

@Entity
@Table(name = "Eats")
public class Eats {
	private long idFood;
	private long idAnimal;
	
	@Id
	@Column(name = "IdFood")
	public long getIdFood() {
		return idFood;
	}

	public void setIdFood(long idFood) {
		this.idFood = idFood;
	}
	
	@Column(name = "IdAnimal")
	public long getIdAnimal() {
		return idAnimal;
	}

	public void setIdAnimal(long idAnimal) {
		this.idAnimal = idAnimal;
	}

}
