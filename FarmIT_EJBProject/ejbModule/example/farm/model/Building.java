package example.farm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.*;


@Entity
@NamedQueries({
//	@NamedQuery(name="Buildings.findAllBoxesInBuildin",
//		query= "SELECT * FROM Buildings WHERE IdBox EQUALS :IdBox")
})
@Table(name = "Buildings")
public class Building {

	private long idBuilding;
	
	private Set<Box> boxes; 
	
	@Id
	@Column(name = "idBuilding")
	public long getIdBuilding() {
		return idBuilding;
	}

	public void setIdBuilding(long idBuilding) {
		this.idBuilding = idBuilding;
	}
	@OneToMany(mappedBy="Buildings")
	public Set<Box> getBoxes() {
		return boxes;
	}

	public void setBoxes(Set<Box> boxes) {
		this.boxes = boxes;
	}
	public void addBoxtoBuilding(Box b){
		boxes.add(b);
	}

}
