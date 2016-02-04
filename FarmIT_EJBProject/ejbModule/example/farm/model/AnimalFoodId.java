package example.farm.model;

@Embeddable
public class AnimalFoodId {
	
	private long idFood;
	private long idAnimal;
	public long getIdFood() {
		return idFood;
	}
	public void setIdFood(long idFood) {
		this.idFood = idFood;
	}
	public long getIdAnimal() {
		return idAnimal;
	}
	public void setIdAnimal(long idAnimal) {
		this.idAnimal = idAnimal;
	}

}
