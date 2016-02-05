package example.farm.eao;

import javax.ejb.Local;

@Local
public interface BoxLocal {

	public Box findByIdBox(long id);

	public Box createBox(Box a);

	public Box updateBox(Box a);

}
