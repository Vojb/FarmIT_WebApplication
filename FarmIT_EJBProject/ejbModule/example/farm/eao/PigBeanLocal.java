package example.farm.eao;

import javax.ejb.Local;

import example.farm.model.Pig;

@Local
public interface PigBeanLocal {

	public Pig findPigByIdAnimal(long id);
	
	public Pig createPig(Pig a);

	public Pig updatePig(Pig a);

	public void deletePig(long id);
}