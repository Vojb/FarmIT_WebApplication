package example.farm.eao;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import example.farm.model.Box;


/**
 * Session Bean implementation class BoxBean
 */
@Stateless
@LocalBean
public class BoxBean implements BoxBeanLocal {

	@PersistenceContext(unitName = "LabEJBSql")
	private EntityManager em;

	public List<Box> findAll(){
	
	TypedQuery<Box> query =
			em.createNamedQuery("Boxes.findAll", Box.class);
	List<Box> results = query.getResultList();
	return results;
	}
	
	public List<Box> findAllBoxesInBuilding(String idBuilding){
		
		TypedQuery<Box> query =
				em.createNamedQuery("Boxes.findAllBoxesInBuilding", Box.class);
		
		query.setParameter("idBuilding", idBuilding);
		
		List<Box> results = query.getResultList();
		return results;
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
