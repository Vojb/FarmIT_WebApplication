package example.farm.eao;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import example.farm.model.Animal;
import example.farm.model.Box;

@Stateless
@LocalBean
public class AnimalBean implements AnimalBeanLocal {

	@PersistenceContext(unitName = "LabEJBSql")
	private EntityManager em;

	

	public Animal findByIdAnimal(long id) {
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
	//Querys
		public List<Animal> findAll() {

			TypedQuery<Animal> query = em.createNamedQuery("Animals.findAll", Animal.class);
			List<Animal> results = query.getResultList();
			return results;
		}

		public List<Animal> findByType(String type) {

			TypedQuery<Animal> query = em.createNamedQuery("Animals.findByType", Animal.class);

			query.setParameter("type", type);

			List<Animal> results = query.getResultList();
			return results;
		}

		public List<Animal> findBox(String boxId) {
			TypedQuery<Animal> query = em.createNamedQuery("Animals.findBox", Animal.class);

			query.setParameter("boxId", boxId);

			List<Animal> results = query.getResultList();
			return results;
		}

}
