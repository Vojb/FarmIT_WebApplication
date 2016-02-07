package example.farm.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "Animals")
@NamedQueries({
		// @NamedQuery(name="Animals.findAll",
		// query="SELECT * FROM Animals"),
		// @NamedQuery(name="Animals.findByType",
		// query="SELECT * FROM Animals WHERE Type LIKE :Type"),
		// @NamedQuery(name="Animals.findBox",
		// query="SELECT * FROM Animals WHERE boxId = :boxId"),
		// @NamedQuery(name="Animals.findFood",
		// query="SELECT ")
})
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "typeAnimal", discriminatorType = DiscriminatorType.STRING, length = 6)
public abstract class Animal implements Serializable {

	private static final long serialVersionUID = 1L;

	private long idAnimal;
	private String name;
	private String age;
	private String statusAnimal;

	@ManyToOne
	@JoinColumn(name = "idBox", referencedColumnName = "idBox")
	private long idBox;

	@ManyToMany
	@JoinTable(name = "Eats", joinColumns = @JoinColumn(name = "idFood", referencedColumnName = "idFood") , inverseJoinColumns = @JoinColumn(name = "idAnimal", referencedColumnName = "idAnimal") )
	private Set<Food> foods;

	@Id
	@Column(name = "IdAnimal")
	public long getIdAnimal() {
		return idAnimal;
	}

	public void setIdAnimal(long idAnimal) {
		this.idAnimal = idAnimal;
	}

	@Column(name = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "age")
	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Column(name = "StatusAnimal")
	public String getStatusAnimal() {
		return statusAnimal;
	}

	public void setStatusAnimal(String statusAnimal) {
		this.statusAnimal = statusAnimal;
	}

	@Column(name = "idBox")
	public long getIdBox() {
		return idBox;
	}

	public void setIdBox(long idBox) {
		this.idBox = idBox;
	}

}
