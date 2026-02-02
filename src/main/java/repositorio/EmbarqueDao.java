package repositorio;

import modelo.Puerta_embarque;
import utiles.AbstractDao;

public class EmbarqueDao extends AbstractDao<Puerta_embarque> {

	public EmbarqueDao() {
		setClase(Puerta_embarque.class);
	}

}
