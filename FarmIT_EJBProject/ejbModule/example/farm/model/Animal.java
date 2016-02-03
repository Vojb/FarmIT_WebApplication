package example.farm.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="typeAnimal",
discriminatorType=DiscriminatorType.STRING, length=1)
public abstract class Animal implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String idAnimal;
	private String name;
	private String age;
	private String statusAnimal;
	
	@Id
	@Column(name="IdAnimal")
	public String getIdAnimal() {
		return idAnimal;
	}
	public void setIdAnimal(String idAnimal) {
		this.idAnimal = idAnimal;
	}
	@Column(name="name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Column(name="Age")
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}

	@Column(name="StatusAnimal")
	public String getStatusAnimal() {
		return statusAnimal;
	}
	public void setStatusAnimal(String statusAnimal) {
		this.statusAnimal = statusAnimal;
	}
	

}
