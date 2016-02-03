package example.farm.model;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Boxes")
public class Box {
	private long idBox;

	private ArrayList<Animal> animals = new ArrayList<Animal>();
	
	@Id
	@Column(name="idBox")
	public long getIdBox() {
		return idBox;
	}

	public void setIdBox(long idBox) {
		this.idBox = idBox;
	}

	public ArrayList<Animal> getAnimals() {
		return animals;
	}

	public void setAnimals(ArrayList<Animal> animals) {
		this.animals = animals;
	}

}
