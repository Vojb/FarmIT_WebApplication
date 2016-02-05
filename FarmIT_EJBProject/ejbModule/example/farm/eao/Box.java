package example.farm.eao;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Session Bean implementation class Box
 */
@Stateless
@LocalBean
public class Box implements BoxLocal {

	@PersistenceContext(unitName= "LabEJBSql")
	private EntityManager em;
	/**
	 * Default constructor.
	 */
	public Box() {
		// TODO Auto-generated constructor stub
	}

	public Box findByIdBox(long id) {
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
