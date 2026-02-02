package controlador;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import modelo.Avion;
import modelo.MiembrosTripulacion;
import modelo.Pasajero;
import modelo.Pasaporte;
import modelo.Puerta_embarque;
import modelo.Vuelo;
import servicio.Servicio;

public class GestionaAeropuerto {

	public static void main(String[] args) {
		// Inicializamos el servicio que contiene todos los DAOs
		Servicio servicio = new Servicio();

		System.out.println("--- REGISTRANDO AVIONES ---");
		Avion av1 = new Avion("Iberia", LocalDate.of(2015, 10, 20), null);
		Avion av2 = new Avion("Ryanair", LocalDate.of(2018, 3, 12), null);
		Avion av3 = new Avion("Vueling", LocalDate.of(2020, 7, 5), null);
		servicio.registrarAvion(av1);
		servicio.registrarAvion(av2);
		servicio.registrarAvion(av3);

		System.out.println("--- REGISTRANDO PUERTAS DE EMBARQUE ---");
		Puerta_embarque p1 = new Puerta_embarque("Terminal A - P1", null);
		Puerta_embarque p2 = new Puerta_embarque("Terminal A - P2", null);
		Puerta_embarque p3 = new Puerta_embarque("Terminal B - P5", null);
		servicio.abrirPuerta(p1);
		servicio.abrirPuerta(p2);
		servicio.abrirPuerta(p3);

		System.out.println("--- REGISTRANDO VUELOS ---");
		Vuelo v1 = new Vuelo("Madrid", 2, LocalDateTime.now().plusHours(5), null, null, p1, av1);
		Vuelo v2 = new Vuelo("Barcelona", 1, LocalDateTime.now().plusHours(8), null, null, p2, av2);
		Vuelo v3 = new Vuelo("París", 3, LocalDateTime.now().plusHours(12), null, null, p3, av3);
		servicio.guardar(v1);
		servicio.guardar(v2);
		servicio.guardar(v3);

		System.out.println("--- REGISTRANDO PASAJEROS Y PASAPORTES ---");
		// Pasajero 1
		Pasajero pas1 = new Pasajero("Juan Gómez", 10, v1);
		servicio.guardar(pas1);
		Pasaporte psp1 = new Pasaporte("Española", pas1);
		servicio.guardar(psp1);

		// Pasajero 2
		Pasajero pas2 = new Pasajero("Maria Schmidt", 2, v2);
		servicio.guardar(pas2);
		Pasaporte psp2 = new Pasaporte("Alemana", pas2);
		servicio.guardar(psp2);

		// Pasajero 3
		Pasajero pas3 = new Pasajero("John Doe", 15, v3);
		servicio.guardar(pas3);
		Pasaporte psp3 = new Pasaporte("Estadounidense", pas3);
		servicio.guardar(psp3);

		System.out.println("--- REGISTRANDO TRIPULACIÓN ---");
		// Tripulante 1 asignado al Vuelo 1
		List<Vuelo> vuelosT1 = new ArrayList<>();
		vuelosT1.add(v1);
		MiembrosTripulacion t1 = new MiembrosTripulacion("Capitán Ahab", 25, vuelosT1);
		servicio.guardar(t1);

		// Tripulante 2 asignado al Vuelo 2
		List<Vuelo> vuelosT2 = new ArrayList<>();
		vuelosT2.add(v2);
		MiembrosTripulacion t2 = new MiembrosTripulacion("Elena Nito", 8, vuelosT2);
		servicio.guardar(t2);

		// Tripulante 3 asignado al Vuelo 3
		List<Vuelo> vuelosT3 = new ArrayList<>();
		vuelosT3.add(v3);
		MiembrosTripulacion t3 = new MiembrosTripulacion("Armando Bronca", 12, vuelosT3);
		servicio.guardar(t3);

	}

}
