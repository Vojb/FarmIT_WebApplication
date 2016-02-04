package example.farm.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="Animals")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="typeAnimal",
discriminatorType=DiscriminatorType.STRING, length=10)
public abstract class Animal implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	private long idAnimal;
	private String name;
	private String age;
	private String statusAnimal;
	private long idBox;

	@ManyToMany(mappedBy="Food")

	
	@Id
	@Column(name="IdAnimal")
	public long getIdAnimal() {
		return idAnimal;
	}
	public void setIdAnimal(long idAnimal) {
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
	
	@ManyToOne
	@JoinColumn(name="idBox",
	referencedColumnName="idBox")
	public long getIdBox() {
		return idBox;
	}
	public void setIdBox(long idBox) {
		this.idBox = idBox;
	}
	

}
