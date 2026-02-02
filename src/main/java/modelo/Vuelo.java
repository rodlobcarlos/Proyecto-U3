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

	@OneToMany(mappedBy = "vuelo", cascade = CascadeType.ALL)
	private List<MiembrosTripulacion> miembrosTripulacions;

	@OneToOne
	@JoinColumn(name = "idPuerta")
	@JoinColumn(name = "idAvion")
	private Puerta_embarque puertaEmbarque;
	private Avion avion;

	public List<MiembrosTripulacion> getMiembrosTripulacions() {
		return miembrosTripulacions;
	}

	public void setMiembrosTripulacions(List<MiembrosTripulacion> miembrosTripulacions) {
		this.miembrosTripulacions = miembrosTripulacions;
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
		return puertaEmbarque;
	}

	public void setPuertaEmbarque(Puerta_embarque puertaEmbarque) {
		this.puertaEmbarque = puertaEmbarque;
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
				+ horaSalida + ", pasajeros=" + pasajeros + ", miembrosTripulacions=" + miembrosTripulacions
				+ ", puertaEmbarque=" + puertaEmbarque + ", avion=" + avion + "]";
	}

	public Vuelo(int idVuelo, String destino, int horasVuelo, LocalDateTime horaSalida, List<Pasajero> pasajeros,
			List<MiembrosTripulacion> miembrosTripulacions, Puerta_embarque puertaEmbarque, Avion avion) {
		super();
		this.idVuelo = idVuelo;
		this.destino = destino;
		this.horasVuelo = horasVuelo;
		this.horaSalida = horaSalida;
		this.pasajeros = pasajeros;
		this.miembrosTripulacions = miembrosTripulacions;
		this.puertaEmbarque = puertaEmbarque;
		this.avion = avion;
	}

	public Vuelo() {
		super();
	}

}
