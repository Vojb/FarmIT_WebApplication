package example.farm.model;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
	@OneToMany(mappedBy="Animal")
	
	@ManyToOne
	@JoinColumn(name="idBuilding",
	referencedColumnName="idBuilding")
	
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
