package example.farm.model;

import java.io.Serializable;
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
		@NamedQuery(name="Box.findAll", query="SELECT b FROM Box b"),
		@NamedQuery(name="Box.findBoxesInByIdBuilding", query= "SELECT b FROM Box b WHERE b.building LIKE :idBuilding"),
})
@Table(name = "Boxes")
public class Box implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
