package example.farm.eao;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import example.farm.model.Animal;
import example.farm.model.Box;
import example.farm.model.Cow;

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
		public List<Animal> findAllQuery() {

			TypedQuery<Animal> query = em.createNamedQuery("Animal.findAll", Animal.class);
			List<Animal> results = query.getResultList();
			return results;
		}

		public List<Animal> findByTypeQuery(String type) {

			TypedQuery<Animal> query = em.createNamedQuery("Animals.findByType", Animal.class);

			query.setParameter("typeAnimal", type);

			List<Animal> results = query.getResultList();
			return results;
		}

		public List<Animal> findBoxQuery(String idbox) {
			TypedQuery<Animal> query = em.createNamedQuery("Animals.findBox", Animal.class);

			query.setParameter("idbox", idbox);

			List<Animal> results = query.getResultList();
			return results;
		}
		public List<Animal> sumOfCowFood() {

			TypedQuery<Animal> query = em.createNamedQuery("Animal.feedCowsSum", Animal.class);
			List<Animal> results = query.getResultList();
			
			return results;
		}



}
