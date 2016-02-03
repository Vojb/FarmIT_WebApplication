package example.farm.eao;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;

import example.farm.model.Food;


@Stateless
@LocalBean
public class FoodBean implements FoodBeanLocal {

	private EntityManager em;
	
	public FoodBean() {

	}
	public Food findByIdFood(long id){
		return em.find(Food.class, id);
	}
	
	public Food createFood(Food a) {
		em.persist(a);
		return a;
	}

	public Food updateFood(Food a) {
		em.merge(a);
		return a;
	}

	public void deleteFood(long id) {
		Food a = this.findByIdFood(id);
		if (a != null) {
			em.remove(a);
		}
	}

}
