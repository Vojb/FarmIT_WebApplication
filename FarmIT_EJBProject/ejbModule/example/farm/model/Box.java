package example.farm.model;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@NamedQueries({
	@NamedQuery(name="Boxes.findAll",
		query= "SELECT * FROM Boxes"),
	@NamedQuery(name="find.boxesInBuilding",
		query= "SELECT * FROM Boxes WHERE IdBuilding EQUALS :IdBuilding")
})
@Table(name="Boxes")
public class Box {
	private long idBox;
	
	@OneToMany(mappedBy="Animal")
	private ArrayList<Animal> animals = new ArrayList<Animal>();
	
	@ManyToOne
	@JoinColumn(name="idBuilding",
	referencedColumnName="idBuilding")
	private Building building;
	
	
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
