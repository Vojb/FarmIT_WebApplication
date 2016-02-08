package example.farm.eao;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import example.farm.model.Box;

/**
 * Session Bean implementation class BoxBean
 */
@Stateless
@LocalBean
public class BoxBean implements BoxBeanLocal {

	@PersistenceContext(unitName = "LabEJBSql")
	private EntityManager em;

	/**
	 * Default constructor.
	 */
	public BoxBean() {
		// TODO Auto-generated constructor stub
	}

	public Box findByIdBox(String id) {
		return em.find(Box.class, id);
	}

	public Box createBox(Box a) {
		em.persist(a);
		return a;
	}

	public Box updateBox(Box a) {
		em.merge(a);
		return a;

	}

}
