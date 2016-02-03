package example.farm.eao;

import javax.ejb.Local;

import example.farm.model.Animal;

@Local
public interface AnimalBeanLocal {

	public Animal findByIdAnimal();
	

	public Animal createEmployee();

	public Animal updateEmployee();

	public void deleteEmployee();
}
