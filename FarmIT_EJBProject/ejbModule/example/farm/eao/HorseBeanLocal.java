package example.farm.eao;
import javax.ejb.Local;

import example.farm.model.Horse;

@Local
public interface HorseBeanLocal {

	public Horse findHorseByIdAnimal(long id);
	
	public Horse createHorse(Horse a);

	public Horse updateHorse(Horse a);

	public void deleteHorse(long id);
}