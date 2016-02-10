package example.farm.eao;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import example.farm.model.Animal;
import example.farm.model.Pig;


@Stateless
@LocalBean
public class PigBean implements PigBeanLocal {

	@PersistenceContext(unitName = "LabEJBSql")
	private EntityManager em;
   

	public Pig findPigByIdAnimal(long id) {
		return em.find(Pig.class, id);
	}
	
	public Pig createPig(Pig a) {
		em.persist(a);
		return a;
	}
	
	public Pig updatePig(Pig a) {
		em.merge(a);
		return a;
	}
	
	public void deletePig(long id) {
		Animal a = this.findPigByIdAnimal(id);
		if (a != null) {
			em.remove(a);
		}
	}


}