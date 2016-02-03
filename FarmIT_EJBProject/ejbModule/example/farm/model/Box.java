package example.farm.model;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Boxes")
public class Box {
	private long idBox;

	private ArrayList<Animal> animals = new ArrayList<Animal>();

}
