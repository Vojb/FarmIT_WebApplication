package example.farm.eao;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import example.farm.model.Animal;
import example.farm.model.Cow;


@Stateless
@LocalBean
public class CowBean implements CowBeanLocal {

	@PersistenceContext(unitName = "LabEJBSql")
	private EntityManager em;
   

	public Cow findCowByIdAnimal(long id) {
		return em.find(Cow.class, id);
	}
	
	public Cow createCow(Cow a) {
		em.persist(a);
		return a;
	}
	
	public Cow updateCow(Cow a) {
		em.merge(a);
		return a;
	}
	
	public void deleteCow(long id) {
		Animal a = this.findCowByIdAnimal(id);
		if (a != null) {
			em.remove(a);
		}
	}
//	public List<Cow> sumOfCowFoodTHATAREAWESOME() {
//
//		TypedQuery<Cow> query = em.createNamedQuery("Cow.feedCowsSum", Cow.class);
//		List<Cow> results = query.getResultList();
//		
//		return results;
//	}

}