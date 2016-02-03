package example.farm.eao;

import javax.ejb.Local;

import example.farm.model.Animal;

@Local
public interface AnimalBeanLocal {

	public Animal findByIdAnimal(long id);
	
	public Animal createAnimal(Animal a);

	public Animal updateAnimal(Animal a);

	public void deleteAnimal(long id);
}
