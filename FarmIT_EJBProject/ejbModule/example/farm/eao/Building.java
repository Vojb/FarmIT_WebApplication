package example.farm.eao;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Session Bean implementation class Building
 */
@Stateless
@LocalBean
public class Building implements BuildingLocal {

	@PersistenceContext(unitName = "LabEJBSql")
	private EntityManager em;

	/**
	 * Default constructor.
	 */

	public Building findByIdBuilding(long id) {
		return em.find(Building.class, id);
	}

	public Building createBuilding(Building a) {
		em.persist(a);
		return a;
	}

	public Building updateBuilding(Building a) {
		em.merge(a);
		return a;
	}

}
