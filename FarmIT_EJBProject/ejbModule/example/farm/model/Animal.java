package example.farm.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "Animals")
@NamedQueries({
		 @NamedQuery(name="Animal.findAll", query="SELECT e FROM Animal e"),
		 @NamedQuery(name="Animal.findByType", query="SELECT a FROM Animal a WHERE a.Type LIKE :Type"),
		 @NamedQuery(name="Animal.findBox",query="SELECT a FROM Animal a WHERE a.boxId LIKE :IdBox"),
//		 @NamedQuery(name="Animals.findFood", query="SELECT ")
})
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TypeAnimal", discriminatorType = DiscriminatorType.STRING, length = 6)
public abstract class Animal implements Serializable {

	private static final long serialVersionUID = 1L;

	private long idAnimal;
	private String name;
	private String age;
	private String statusAnimal;
	private Box box;


	@ManyToOne
	@JoinColumn(name = "IdBox", referencedColumnName = "IdBox")
	public Box getBox() {
		return box;
	}
	
	@ManyToMany(fetch =FetchType.EAGER)
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

	public void setBox(Box box) {
		this.box = box;
	}

}
