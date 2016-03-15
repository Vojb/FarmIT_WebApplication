package example.farm.eao;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import example.farm.model.Box;
import example.farm.model.Building;

/**
 * Session Bean implementation class Building
 */
@Stateless
@LocalBean
public class BuildingBean implements BuildingBeanLocal {

	@PersistenceContext(unitName = "LabEJBSql")
	private EntityManager em;

	/**
	 * Default constructor.
	 */

	public Building findByIdBuilding(String id) {
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

	public void deleteBuilding(String id) {
		Building a = this.findByIdBuilding(id);
		if (a != null) {
			em.remove(a);
		}

	}
}
