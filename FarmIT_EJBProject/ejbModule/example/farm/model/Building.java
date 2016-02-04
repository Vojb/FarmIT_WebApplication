package example.farm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.*;


@Entity
@Table(name = "Buildings")
public class Building {

	private long idBuilding;
	private ArrayList<Box> boxes = new ArrayList<Box>(); 
	
	@OneToMany(mappedBy="Box")
	
	@Id
	@Column(name = "idBuilding")
	public long getIdBuilding() {
		return idBuilding;
	}

	public void setIdBuilding(long idBuilding) {
		this.idBuilding = idBuilding;
	}

	public ArrayList<Box> getBoxes() {
		return boxes;
	}

	public void setBoxes(ArrayList<Box> boxes) {
		this.boxes = boxes;
	}

}
