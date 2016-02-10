package example.farm.eao;

import javax.ejb.Local;

import example.farm.model.Cow;

@Local
public interface CowBeanLocal {

	public Cow findCowByIdAnimal(long id);
	
	public Cow createCow(Cow a);

	public Cow updateCow(Cow a);

	public void deleteCow(long id);
}