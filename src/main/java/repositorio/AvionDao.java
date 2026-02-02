package repositorio;

import modelo.Avion;
import utiles.AbstractDao;

public class AvionDao extends AbstractDao<Avion>{

	public AvionDao() {
		setClase(Avion.class);
	}
}
