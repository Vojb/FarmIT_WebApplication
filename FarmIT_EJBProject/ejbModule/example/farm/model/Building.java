package example.farm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.*;

@Entity
@NamedQueries({
		// @NamedQuery(name="Buildings.findAllBoxesInBuildin",
		// query= "SELECT * FROM Buildings WHERE IdBox EQUALS :IdBox")
})
@Table(name = "Buildings")
public class Building {

	private String idBuilding;
	private Set<Box> boxes;

	@Id
	@Column(name = "IdBuilding")
	public String getIdBuilding() {
		return idBuilding;
	}

	public void setIdBuilding(String idBuilding) {
		this.idBuilding = idBuilding;
	}

	@OneToMany(mappedBy = "building", fetch = FetchType.EAGER)
	public Set<Box> getBoxes() {
		return boxes;
	}

	public void setBoxes(Set<Box> boxes) {
		this.boxes = boxes;
	}

	public void addBoxtoBuilding(Box b) {
		boxes.add(b);
	}

}
