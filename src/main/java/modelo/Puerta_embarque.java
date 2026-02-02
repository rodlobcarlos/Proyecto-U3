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
@Table(name = "puerta_embarque")
public class Puerta_embarque {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPuerta;

	@Column(name = "sector")
	private String sector;

	@OneToMany(mappedBy = "puerta_embarque", cascade = CascadeType.ALL)
	private List<Vuelo> vuelos;

	public int getIdPuerta() {
		return idPuerta;
	}

	public void setIdPuerta(int idPuerta) {
		this.idPuerta = idPuerta;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public List<Vuelo> getVuelos() {
		return vuelos;
	}

	public void setVuelos(List<Vuelo> vuelos) {
		this.vuelos = vuelos;
	}

	@Override
	public String toString() {
		return "Puerta_embarque [idPuerta=" + idPuerta + ", sector=" + sector + ", vuelos=" + vuelos + "]";
	}

	public Puerta_embarque(String sector, List<Vuelo> vuelos) {
		super();
		this.sector = sector;
		this.vuelos = vuelos;
	}

	public Puerta_embarque() {
		super();
	}

}
