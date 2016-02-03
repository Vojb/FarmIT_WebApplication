package example.farm.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Foods")
public class Food {
	private String idFood;
	private String type;
	private int amount;

}
