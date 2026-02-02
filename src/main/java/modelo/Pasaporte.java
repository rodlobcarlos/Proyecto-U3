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
@Table(name = "pasaporte")
public class Pasaporte {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPasaporte;

	@Column(name = "nacionalidad")
	private String nacionalidad;

	@OneToOne
	@JoinColumn(name = "idPasajero")
	private Pasajero pasajero;

	public int getIdPasaporte() {
		return idPasaporte;
	}

	public void setIdPasaporte(int idPasaporte) {
		this.idPasaporte = idPasaporte;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public Pasajero getPasajero() {
		return pasajero;
	}

	public void setPasajero(Pasajero pasajero) {
		this.pasajero = pasajero;
	}

	@Override
	public String toString() {
		return "Pasaporte [idPasaporte=" + idPasaporte + ", nacionalidad=" + nacionalidad + ", pasajero=" + pasajero
				+ "]";
	}

	public Pasaporte(String nacionalidad, Pasajero pasajero) {
		super();
		this.nacionalidad = nacionalidad;
		this.pasajero = pasajero;
	}

	public Pasaporte() {
		super();
	}

}
