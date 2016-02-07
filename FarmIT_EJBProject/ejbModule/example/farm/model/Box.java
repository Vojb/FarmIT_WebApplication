package example.farm.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@NamedQueries({
		// @NamedQuery(name="Boxes.findAll",
		// query= "SELECT * FROM Boxes"),
		// @NamedQuery(name="find.boxesInBuilding",
		// query= "SELECT * FROM Boxes WHERE IdBuilding EQUALS :IdBuilding")
})
@Table(name = "Boxes")
public class Box {
	private long idBox;
	private Building building;
	private Set<Animal> animals;
	
	@ManyToOne
	@JoinColumn(name = "idBuilding", referencedColumnName = "idBuilding")
	public Building getBuilding() {
		return building;
	}

	public void setBuilding(Building building) {
		this.building = building;
	}

	@Id
	@Column(name = "idBox")
	public long getIdBox() {
		return idBox;
	}

	public void setIdBox(long idBox) {
		this.idBox = idBox;
	}
	@OneToMany(mappedBy = "Animals")
	public Set<Animal> getAnimals() {
		return animals;
	}

	public void setAnimals(Set<Animal> animals) {
		this.animals = animals;
	}
	public void addAnimaltoBox(Animal a){
		animals.add(a);
	}

}
