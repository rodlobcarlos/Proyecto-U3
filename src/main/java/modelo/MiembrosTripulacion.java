package modelo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "miembros_tripulacion")
public class MiembrosTripulacion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTripulacion;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "años_experiencia")
	private int añosExperiencia;

	@OneToMany(mappedBy = "miembros_tripulacion", cascade = CascadeType.ALL)
	private List<Vuelo> vuelos;

	public int getIdTripulacion() {
		return idTripulacion;
	}

	public void setIdTripulacion(int idTripulacion) {
		this.idTripulacion = idTripulacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAñosExperiencia() {
		return añosExperiencia;
	}

	public void setAñosExperiencia(int añosExperiencia) {
		this.añosExperiencia = añosExperiencia;
	}

	public List<Vuelo> getVuelos() {
		return vuelos;
	}

	public void setVuelos(List<Vuelo> vuelos) {
		this.vuelos = vuelos;
	}

	@Override
	public String toString() {
		return "MiembrosTripulacion [idTripulacion=" + idTripulacion + ", nombre=" + nombre + ", añosExperiencia="
				+ añosExperiencia + ", vuelos=" + vuelos + "]";
	}

	public MiembrosTripulacion(int idTripulacion, String nombre, int añosExperiencia, List<Vuelo> vuelos) {
		super();
		this.idTripulacion = idTripulacion;
		this.nombre = nombre;
		this.añosExperiencia = añosExperiencia;
		this.vuelos = vuelos;
	}

	public MiembrosTripulacion() {
		super();
	}

}
