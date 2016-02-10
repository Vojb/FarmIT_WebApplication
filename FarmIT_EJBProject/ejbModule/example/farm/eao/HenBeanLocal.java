package example.farm.eao;

import javax.ejb.Local;

import example.farm.model.Hen;

@Local
public interface HenBeanLocal {

	public Hen findHenByIdAnimal(long id);
	
	public Hen createHen(Hen a);

	public Hen updateHen(Hen a);

	public void deleteHen(long id);
}