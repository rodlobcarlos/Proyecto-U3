package repositorio;

import modelo.Pasajero;
import utiles.AbstractDao;

public class PasajeroDao extends AbstractDao<Pasajero> {

	public PasajeroDao() {
		setClase(Pasajero.class);
	}

}
