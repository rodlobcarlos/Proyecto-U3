package repositorio;

import modelo.Pasaporte;
import utiles.AbstractDao;

public class PasaporteDao extends AbstractDao<Pasaporte> {

	public PasaporteDao() {
		setClase(Pasaporte.class);
	}

}
