package Ejercicio4B;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Scanner;

public class Carrera {
    
    private String nombre;
	private String pais;
	private ArrayList<Equipo> listaEquipos;
	private ArrayList<Ciclista> clasificacionGeneral;

	public Carrera(String nombreCompeticion, String pais) {
		this.nombre = nombreCompeticion;
		this.pais = pais;
		listaEquipos = new ArrayList<>();
		clasificacionGeneral = new ArrayList<>();
	}

	
	public void añadirEquipo(Equipo equipo) {
		listaEquipos.add(equipo);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public ArrayList<Equipo> getListaEquipos() {
		return listaEquipos;
	}

	public void setListaEquipos(ArrayList<Equipo> listaEquipos) {
		this.listaEquipos = listaEquipos;
	}

	public ArrayList<Ciclista> getClasificacionGeneral() {
		return clasificacionGeneral;
	}

	public void setClasificacionGeneral(ArrayList<Ciclista> clasificacionGeneral) {
		this.clasificacionGeneral = clasificacionGeneral;
	}

	public void listarEquipo() {
		for (Equipo e : listaEquipos) {
			e.imprimir();
		}
	}

	
	public void buscarEquipo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dame nombre del equipo: ");
		String nombreEquipo = sc.nextLine();
		boolean encontrado = false;
		for (Equipo e : listaEquipos) {
			if (e.getNombre().equalsIgnoreCase(nombreEquipo)) {
				e.imprimir();
				encontrado = true;
				break;
			}
		}
		if (!encontrado) {
			System.out.println("Ningún equipo con ese nombre");
		}
		
	}

	
	public void clasificacionEquipos() {
		for (Equipo e : listaEquipos) {
			e.calcularTotalTiempo();
		}
		Collections.sort(listaEquipos, (e1, e2) -> Double.compare(e1.getTotalTiempo(), e2.getTotalTiempo()));
		for (Equipo e : listaEquipos) {
			e.imprimir();
		}
	}

	public void imprimirClasificacion() {
		ListIterator<Ciclista> iter = clasificacionGeneral.listIterator();
		while (iter.hasNext()) {
			Ciclista ciclista = iter.next();
			ciclista.imprimir();
		}
	}

	
	public void calculaYMuestraTiemposGenerales() {
		// Calcular tiempos totales
		for (Equipo equipo : listaEquipos) {
			for (Ciclista ciclista : equipo.listaCiclistas) {
				ciclista.acumulaTiempoTotal();
				clasificacionGeneral.add(ciclista);
			}
		}

	
		Collections.sort(clasificacionGeneral, (o1, o2) -> Double.compare(o1.getTiempoAcumulado(), o2.getTiempoAcumulado()));
		System.out.println("--- CLASIFICACIÓN GENERAL ---");
		for (Ciclista ciclista : clasificacionGeneral) {
			System.out.println(ciclista);
		}

		for (Ciclista ciclista : clasificacionGeneral) {
			ciclista.calcularTiempoParcial();
		}

		
		Collections.sort(clasificacionGeneral, (o1, o2) -> Double.compare(o1.getTiempoAcumulado(), o2.getTiempoAcumulado()));
		System.out.println("--- CLASIFICACIÓN PARCIAL ---");
		for (Ciclista ciclista : clasificacionGeneral) {
			System.out.println(ciclista);
		}
	}
}