package example.farm.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AnimalFoodId {

	private long idFood;
	private long idAnimal;

	@Column(name = "idFood", nullable = false)
	public Long getIdFood() {
		return idFood;
	}

	public void setIdFood(long idFood) {
		this.idFood = idFood;
	}

	@Column(name = "idAnimal", nullable = false)
	public Long getIdAnimal() {
		return idAnimal;
	}

	public void setIdAnimal(Long idAnimal) {
		this.idAnimal = idAnimal;
	}

	public AnimalFoodId(long idAnimal, long idFood) {
		this.idAnimal = idAnimal;
		this.idFood = idFood;
	}

	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		if ((other == null)) {
			return false;
		}
		if (!(other instanceof AnimalFoodId)) {
			return false;
		}
		AnimalFoodId castOther = (AnimalFoodId) other;
		return ((this.getIdFood() == castOther.getIdFood()) || (this.getIdFood() != null
				&& castOther.getIdFood() != null && this.getIdFood() == (castOther.getIdFood())))
				&& ((this.getIdAnimal() == castOther.getIdAnimal()) || (this.getIdAnimal() != null
						&& castOther.getIdAnimal() != null && this.getIdAnimal() == (castOther.getIdAnimal())));
	}

	public int hashCode() {
		return super.hashCode();
	}

}
