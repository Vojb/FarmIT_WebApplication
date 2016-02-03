package example.farm.facade;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import example.farm.eao.AnimalBean;
import example.farm.model.Animal;

/**
 * Session Bean implementation class FarmFacade
 */
@Stateless
@LocalBean
public class FarmFacade implements FarmFacadeLocal {

	@EJB
	AnimalBean ab;
	
    /**
     * Default constructor. 
     */
    public FarmFacade() {
    	// TODO Auto-generated constructor stub
    }
    public Animal createAnimal(Animal a){
    	return ab.createAnimal(a);
    }
    public Animal updateAnimal(Animal a){
    	return ab.updateAnimal(a);
    }
    public void deleteAnimal(long a){
    	 ab.deleteAnimal(a);
    }
    public Animal findByIdAnimal(long a){
    	return ab.findByIdAnimal(a);
    }

}
