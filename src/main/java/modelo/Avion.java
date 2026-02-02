package modelo;

import java.time.LocalDate;
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
@Table(name = "avion")
public class Avion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idAvion;

	@Column(name = "compañia")
	private String compañia;

	@Column(name = "año_fabricacion")
	private LocalDate añoFabricacion;

	@OneToMany(mappedBy = "avion", cascade = CascadeType.ALL)
	private List<Vuelo> vuelos;

	public int getIdAvion() {
		return idAvion;
	}

	public void setIdAvion(int idAvion) {
		this.idAvion = idAvion;
	}

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}

	public LocalDate getAñoFabricacion() {
		return añoFabricacion;
	}

	public void setAñoFabricacion(LocalDate añoFabricacion) {
		this.añoFabricacion = añoFabricacion;
	}

	public List<Vuelo> getVuelos() {
		return vuelos;
	}

	public void setVuelos(List<Vuelo> vuelos) {
		this.vuelos = vuelos;
	}

	@Override
	public String toString() {
		return "Avion [idAvion=" + idAvion + ", compañia=" + compañia + ", añoFabricacion=" + añoFabricacion
				+ ", vuelos=" + vuelos + "]";
	}

	public Avion(String compañia, LocalDate añoFabricacion, List<Vuelo> vuelos) {
		super();
		this.compañia = compañia;
		this.añoFabricacion = añoFabricacion;
		this.vuelos = vuelos;
	}

	public Avion() {
		super();
	}

}
