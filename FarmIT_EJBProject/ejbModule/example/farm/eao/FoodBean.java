package example.farm.eao;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import example.farm.model.Animal;
import example.farm.model.Cow;
import example.farm.model.Food;

@Stateless
@LocalBean
public class FoodBean implements FoodBeanLocal {
	@PersistenceContext(unitName = "LabEJBSql")
	private EntityManager em;

	public FoodBean() {

	}

	public Food findByIdFood(long id) {
		return em.find(Food.class, id);
	}

	public Food createFood(Food f) {
		em.persist(f);
		return f;
	}

	public Food updateFood(Food f) {
		em.merge(f);
		return f;
	}

	public void deleteFood(long id) {
		Food f = this.findByIdFood(id);
		if (f != null) {
			em.remove(f);
		}
	}

	public void addAnimal(Food f, Animal a) {
		f.addAnimal(a);
	}

//	public void feedCow(Food f) {
//		long id = 10001;
//		int sum = f.getAmount();
//		Cow c = (Cow) em.find(Animal.class, id);
//		
//		while (c != null) {
//			sum -= c.getAmountOfPowerFeed();
//			id++;
//		}
//		f.setAmount(sum);
//
//	}

}
