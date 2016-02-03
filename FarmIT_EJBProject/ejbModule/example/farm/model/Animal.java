package example.farm.model;

import javax.persistence.*;

@Entity
public class Animal {
	private String idAnimal;
	private String name;
	private String typeAnimal;
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

	@Column(name="TypeAnimal")
	public String getTypeAnimal() {
		return typeAnimal;
	}
	public void setTypeAnimal(String typeAnimal) {
		this.typeAnimal = typeAnimal;
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
