package example.farm.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@NamedQueries({
		@NamedQuery(name="Boxes.findAll", query= "SELECT b FROM Boxes b"),
//		@NamedQuery(name="find.boxesInBuilding", query= "SELECT b FROM Boxes b WHERE IdBuilding b = :IdBuilding")
})
@Table(name = "Boxes")
public class Box {
	private String idBox;
	private Building building;
	private Set<Animal> animals;
	
	@ManyToOne
	@JoinColumn(name = "IdBuilding", referencedColumnName = "IdBuilding")
	public Building getBuilding() {
		return building;
	}

	public void setBuilding(Building building) {
		this.building = building;
	}

	@Id
	@Column(name = "IdBox")
	public String getIdBox() {
		return idBox;
	}

	public void setIdBox(String idBox) {
		this.idBox = idBox;
	}
	@OneToMany(mappedBy = "box", fetch=FetchType.EAGER)
	public Set<Animal> getAnimals() {
		return animals;
	}

	public void setAnimals(Set<Animal> animals) {
		this.animals = animals;
	}
//	public void addAnimaltoBox(Animal a){
//		animals.add(a);
//	}

}
