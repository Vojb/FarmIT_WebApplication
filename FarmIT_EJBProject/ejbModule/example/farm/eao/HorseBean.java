package example.farm.eao;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import example.farm.model.Animal;
import example.farm.model.Horse;


@Stateless
@LocalBean
public class HorseBean implements HorseBeanLocal {

	@PersistenceContext(unitName = "LabEJBSql")
	private EntityManager em;
   

	public Horse findHorseByIdAnimal(long id) {
		return em.find(Horse.class, id);
	}
	
	public Horse createHorse(Horse a) {
		em.persist(a);
		return a;
	}
	
	public Horse updateHorse(Horse a) {
		em.merge(a);
		return a;
	}
	
	public void deleteHorse(long id) {
		Animal a = this.findHorseByIdAnimal(id);
		if (a != null) {
			em.remove(a);
		}
	}


}