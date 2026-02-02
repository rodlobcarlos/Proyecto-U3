package servicio;

import java.util.List;

import modelo.Avion;
import modelo.MiembrosTripulacion;
import modelo.Pasajero;
import modelo.Pasaporte;
import modelo.Puerta_embarque;
import modelo.Vuelo;
import repositorio.AvionDao;
import repositorio.EmbarqueDao;
import repositorio.PasajeroDao;
import repositorio.PasaporteDao;
import repositorio.TripulacionDao;
import repositorio.VueloDao;

public class Servicio {

	private AvionDao avionDao;
	private EmbarqueDao embarqueDao;
	private PasajeroDao pasajeroDao;
	private PasaporteDao pasaporteDao;
	private TripulacionDao tripulacionDao;
	private VueloDao vueloDao;

	public Servicio() {
		this.avionDao = new AvionDao();
		this.embarqueDao = new EmbarqueDao();
		this.pasajeroDao = new PasajeroDao();
		this.pasaporteDao = new PasaporteDao();
		this.tripulacionDao = new TripulacionDao();
		this.vueloDao = new VueloDao();
	}

	public void guardar(Pasajero p) {
		pasajeroDao.create(p);
	}

	public Pasajero obtener(int id) {
		return pasajeroDao.get(id);
	}

	public List<Pasajero> obtenerTodos() {
		return pasajeroDao.getAll();
	}

	public void actualizar(Pasajero p) {
		pasajeroDao.update(p);
	}

	public void borrar(Pasajero p) {
		pasajeroDao.delete(p);
	}

	public void guardar(Pasaporte p) {
		pasaporteDao.create(p);
	}

	public Pasaporte obtenerPasaporte(int id) {
		return pasaporteDao.get(id);
	}

	public List<Pasaporte> obtenerTodosPasaporte() {
		return pasaporteDao.getAll();
	}

	public void actualizar(Pasaporte p) {
		pasaporteDao.update(p);
	}

	public void borrar(Pasaporte p) {
		pasaporteDao.delete(p);
	}

	public void guardar(Vuelo v) {
		vueloDao.create(v);
	}

	public Vuelo obtenerVuelo(int id) {
		return vueloDao.get(id);
	}

	public List<Vuelo> obtenerTodosVuelos() {
		return vueloDao.getAll();
	}

	public void actualizar(Vuelo v) {
		vueloDao.update(v);
	}

	public void borrar(Vuelo v) {
		vueloDao.delete(v);
	}

	public void modificarVuelo(Vuelo v) {
		vueloDao.update(v);
	}

	public void guardar(MiembrosTripulacion m) {
		tripulacionDao.create(m);
	}

	public MiembrosTripulacion obtenerTripulacion(int id) {
		return tripulacionDao.get(id);
	}

	public List<MiembrosTripulacion> obtenerTodosTripulacion() {
		return tripulacionDao.getAll();
	}

	public void actualizar(MiembrosTripulacion m) {
		tripulacionDao.update(m);
	}

	public void borrar(MiembrosTripulacion m) {
		tripulacionDao.delete(m);
	}

	public void registrarAvion(Avion a) {
		avionDao.create(a);
	}

	public Avion obtenerAvion(int id) {
		return avionDao.get(id);
	}

	public List<Avion> listarFlota() {
		return avionDao.getAll();
	}

	public void actualizarAvion(Avion a) {
		avionDao.update(a);
	}

	public void darDeBajaAvion(Avion a) {
		avionDao.delete(a);
	}

	public void abrirPuerta(Puerta_embarque p) {
		embarqueDao.create(p);
	}

	public Puerta_embarque buscarPuerta(int id) {
		return embarqueDao.get(id);
	}

	public List<Puerta_embarque> listarPuertas() {
		return embarqueDao.getAll();
	}

	public void modificarEstadoPuerta(Puerta_embarque p) {
		embarqueDao.update(p);
	}

	public void eliminarPuerta(Puerta_embarque p) {
		embarqueDao.delete(p);
	}

}
