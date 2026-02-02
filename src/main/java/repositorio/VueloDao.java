package repositorio;

import modelo.Vuelo;
import utiles.AbstractDao;

public class VueloDao extends AbstractDao<Vuelo> {

	public VueloDao() {
		setClase(Vuelo.class);
	}

}
