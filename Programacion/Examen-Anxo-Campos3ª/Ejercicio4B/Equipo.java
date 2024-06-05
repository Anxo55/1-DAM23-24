package Ejercicio4B;

import java.util.ArrayList;
import java.util.Scanner;

public class Equipo {

    private String nombre; 
	private double totalTiempo; 
	private String pais;
	ArrayList<Ciclista> listaCiclistas; 

	public Equipo(String nombre, String pais) {
		this.nombre = nombre;
		this.pais = pais;
		this.totalTiempo = 0;
		this.listaCiclistas = new ArrayList<>(); 
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

	
	void añadirCiclista(Ciclista ciclista) {
		listaCiclistas.add(ciclista); 
	}

	
	void listarEquipo() {
		
		for (int i = 0; i < listaCiclistas.size(); i++) {
			Ciclista c = (Ciclista) listaCiclistas.get(i); 
			System.out.println(c.getNombre());
		}
	}

	
	void buscarCiclista() {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Dame nombre: ");
		boolean esta = false;
		String nombreCiclista = sc.nextLine();
		for (int i = 0; i < listaCiclistas.size(); i++) { 
			Ciclista c = (Ciclista) listaCiclistas.get(i); 
			if (c.getNombre().equals(nombreCiclista)) { 
				System.out.println(c.getNombre());
				esta = true;
			}
		}
		if(!esta) {
			System.out.println("No encontrado");
		}
	}

	
	void calcularTotalTiempo() {
		totalTiempo = 0;
		for (int i = 0; i < listaCiclistas.size(); i++) { 
			Ciclista c = (Ciclista) listaCiclistas.get(i); 
			
			totalTiempo += c.getTiempoAcumulado();
		}
	}

	void imprimir() {
		System.out.println("Nombre del equipo = " + nombre);
		System.out.println("Pais = " + pais);
		System.out.println("Total tiempo del equipo = " + totalTiempo);
		for (Ciclista ciclista : listaCiclistas) {
            ciclista.imprimir();
        }
	}

    public double getTotalTiempo() {
        return totalTiempo;
    }

    public void calcularTiempoParcialEquipo() {
        for (Ciclista ciclista : listaCiclistas) {
            ciclista.calcularTiempoParcial();
        }
    }
}