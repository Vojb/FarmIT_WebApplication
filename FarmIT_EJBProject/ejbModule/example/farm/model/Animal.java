package example.farm.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "Animals")
@NamedQueries({ 
		@NamedQuery(name = "Animals.findAll", query = "SELECT a FROM Animals a"),
		@NamedQuery(name = "Animals.findByType", query = "SELECT a FROM Animals a WHERE a.Type LIKE :Type"),
		@NamedQuery(name = "Animals.findBox", query = "SELECT a FROM Animals a WHERE a.boxId = :boxId"),
		// @NamedQuery(name="Animals.findFood"
})
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TypeAnimal", discriminatorType = DiscriminatorType.STRING, length = 6)
public abstract class Animal implements Serializable {

	private static final long serialVersionUID = 1L;

	private long idAnimal;
	private String name;
	private String age;
	private String statusAnimal;

	@ManyToOne
	@JoinColumn(name = "IdBox", referencedColumnName = "IdBox")
	private String idBox;

	@ManyToMany
	@JoinTable(name = "Eats", joinColumns = @JoinColumn(name = "IdFood", referencedColumnName = "IdFood") , inverseJoinColumns = @JoinColumn(name = "IdAnimal", referencedColumnName = "IdAnimal") )
	private Set<Food> foods;

	@Id
	@Column(name = "IdAnimal")
	public long getIdAnimal() {
		return idAnimal;
	}

	public void setIdAnimal(long idAnimal) {
		this.idAnimal = idAnimal;
	}

	@Column(name = "Name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "Age")
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

	@Column(name = "IdBox")
	public String getIdBox() {
		return idBox;
	}

	public void setIdBox(String idBox) {
		this.idBox = idBox;
	}

}
