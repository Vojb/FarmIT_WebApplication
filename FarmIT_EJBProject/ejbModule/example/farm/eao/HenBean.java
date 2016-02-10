package example.farm.eao;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import example.farm.model.Animal;
import example.farm.model.Hen;


@Stateless
@LocalBean
public class HenBean implements HenBeanLocal {

	@PersistenceContext(unitName = "LabEJBSql")
	private EntityManager em;
   

	public Hen findHenByIdAnimal(long id) {
		return em.find(Hen.class, id);
	}
	
	public Hen createHen(Hen a) {
		em.persist(a);
		return a;
	}
	
	public Hen updateHen(Hen a) {
		em.merge(a);
		return a;
	}
	
	public void deleteHen(long id) {
		Animal a = this.findHenByIdAnimal(id);
		if (a != null) {
			em.remove(a);
		}
	}


}