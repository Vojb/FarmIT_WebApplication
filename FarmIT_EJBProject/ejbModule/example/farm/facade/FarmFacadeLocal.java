package example.farm.facade;

import javax.ejb.Local;

import example.farm.model.Animal;

@Local
public interface FarmFacadeLocal {
	   public Animal createAnimal(Animal a);
	    public Animal updateAnimal(Animal a);
	    public void deleteAnimal(long a);
	    public Animal findByIdAnimal(long a);
}
