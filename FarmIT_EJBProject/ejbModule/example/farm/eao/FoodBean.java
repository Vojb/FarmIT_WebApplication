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

}
