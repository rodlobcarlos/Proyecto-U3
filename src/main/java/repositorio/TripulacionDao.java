package repositorio;

import modelo.MiembrosTripulacion;
import utiles.AbstractDao;

public class TripulacionDao extends AbstractDao<MiembrosTripulacion> {

	public TripulacionDao() {
		setClase(MiembrosTripulacion.class);
	}

}
