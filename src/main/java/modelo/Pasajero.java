package modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "pasajero")
public class Pasajero {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPasajero;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "vuelos_anteriores")
	private int numVuelos;

	@OneToOne
	@JoinColumn(name = "idVuelo")
	private Vuelo idVuelo;

	public int getIdPasajero() {
		return idPasajero;
	}

	public void setIdPasajero(int idPasajero) {
		this.idPasajero = idPasajero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumVuelos() {
		return numVuelos;
	}

	public void setNumVuelos(int numVuelos) {
		this.numVuelos = numVuelos;
	}

	public Vuelo getIdVuelo() {
		return idVuelo;
	}

	public void setIdVuelo(Vuelo idVuelo) {
		this.idVuelo = idVuelo;
	}

	@Override
	public String toString() {
		return "Pasajero [idPasajero=" + idPasajero + ", nombre=" + nombre + ", numVuelos=" + numVuelos + ", idVuelo="
				+ idVuelo + "]";
	}

	public Pasajero(String nombre, int numVuelos, Vuelo idVuelo) {
		super();
		this.nombre = nombre;
		this.numVuelos = numVuelos;
		this.idVuelo = idVuelo;
	}

	public Pasajero() {
		super();
	}

}
