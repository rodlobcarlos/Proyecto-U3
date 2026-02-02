package modelo;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "vuelo")
public class Vuelo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idVuelo;

	@Column(name = "destino")
	private String destino;

	@Column(name = "horas")
	private int horasVuelo;

	@Column(name = "compañia")
	private LocalDateTime horaSalida;

	@OneToMany(mappedBy = "vuelo", cascade = CascadeType.ALL)
	private List<Pasajero> pasajeros;

	@ManyToOne
	@JoinColumn(name = "idTripulacion")
	private MiembrosTripulacion miembros_tripulacion;

	@ManyToOne
	@JoinColumn(name = "idPuerta")
	private Puerta_embarque puerta_embarque; 

	@OneToOne
	@JoinColumn(name = "idAvion")
	private Avion avion;

	public MiembrosTripulacion getMiembros_tripulacion() {
		return miembros_tripulacion;
	}

	public void setMiembros_tripulacion(MiembrosTripulacion miembros_tripulacion) {
		this.miembros_tripulacion = miembros_tripulacion;
	}

	public int getIdVuelo() {
		return idVuelo;
	}

	public void setIdVuelo(int idVuelo) {
		this.idVuelo = idVuelo;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public int getHorasVuelo() {
		return horasVuelo;
	}

	public void setHorasVuelo(int horasVuelo) {
		this.horasVuelo = horasVuelo;
	}

	public LocalDateTime getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(LocalDateTime horaSalida) {
		this.horaSalida = horaSalida;
	}

	public List<Pasajero> getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(List<Pasajero> pasajeros) {
		this.pasajeros = pasajeros;
	}

	public Puerta_embarque getPuertaEmbarque() {
		return puerta_embarque;
	}

	public void setPuertaEmbarque(Puerta_embarque puerta_embarque) {
		this.puerta_embarque = puerta_embarque;
	}

	public Avion getAvion() {
		return avion;
	}

	public void setAvion(Avion avion) {
		this.avion = avion;
	}

	@Override
	public String toString() {
		return "Vuelo [idVuelo=" + idVuelo + ", destino=" + destino + ", horasVuelo=" + horasVuelo + ", horaSalida="
				+ horaSalida + ", pasajeros=" + pasajeros + ", miembros_tripulacion=" + miembros_tripulacion
				+ ", puertaEmbarque=" + puerta_embarque + ", avion=" + avion + "]";
	}

	public Vuelo(String destino, int horasVuelo, LocalDateTime horaSalida, List<Pasajero> pasajeros,
			MiembrosTripulacion miembros_tripulacion, Puerta_embarque puerta_embarque, Avion avion) {
		super();
		this.destino = destino;
		this.horasVuelo = horasVuelo;
		this.horaSalida = horaSalida;
		this.pasajeros = pasajeros;
		this.miembros_tripulacion = miembros_tripulacion;
		this.puerta_embarque = puerta_embarque;
		this.avion = avion;
	}

	public Vuelo() {
		super();
	}

}
