package example.farm.eao;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import example.farm.model.Animal;

/**
 * Session Bean implementation class AnimalBean
 */
@Stateless
@LocalBean
public class AnimalBean implements AnimalBeanLocal {

	@PersistenceContext(unitName="LabEJBSql")
	private EntityManager em;
	
	/**
	 * Default constructor.
	 */
	public AnimalBean() {
		// TODO Auto-generated constructor stub

	}
	public Animal findByIdAnimal(long id){
		return em.find(Animal.class, id);
	}
	
	public Animal createAnimal(Animal a) {
		em.persist(a);
		return a;
	}

	public Animal updateAnimal(Animal a) {
		em.merge(a);
		return a;
	}

	public void deleteAnimal(long id) {
		Animal a = this.findByIdAnimal(id);
		if (a != null) {
			em.remove(a);
		}
	}

}
