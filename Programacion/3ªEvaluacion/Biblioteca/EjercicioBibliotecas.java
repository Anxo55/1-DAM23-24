package Biblioteca;

import java.awt.Menu;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioBibliotecas {
	static Scanner s = new Scanner(System.in);
	private ArrayList<Biblioteca> bibliotecas = new ArrayList<Biblioteca>();
	private final String NOMBRE_FICHERO = "ColeccionBibliotecas.obj";
	
	public void iniciarEjercicio() {
		int opcion;
		cargarBibliotecas();
		do {
			opcion = menu();
			if(opcion==1)crearBiblioteca();
			if(opcion==2)accederGestionBiblioteca();
			if(opcion==3)listarBibliotecas();
			if(opcion==4)guardarBibliotecas();
			
		}while(opcion!=5);
		guardarBibliotecas();
		
		
	}
	
	
	
	
	
	private int menu() {
		pintaTitulo("MENU PRINCIPAL ");
		System.out.println("1. Crear biblioteca");
		System.out.println("2. Acceder gestion biblioteca");
		System.out.println("3. Listar bibliotecas");
		System.out.println("4. Guardar bibliotecas");
		System.out.println("5. Salir");
		System.out.print("Introduzca una opción: ");
		return s.nextInt();
	}
	
	private void pintaTitulo(String titulo) {
		System.out.println("\n" + titulo);
		for (int i = 0; i < titulo.length(); i++) {
			System.out.print("=");
		}
		System.out.println();
	}
	
	private void crearBiblioteca() {
		String nombreIn;
		System.out.println("CREACION BIBLIOTECA");
		System.out.println("Dime un nombre para la biblioteca");
		nombreIn = s.next();
		bibliotecas.add(new Biblioteca(nombreIn));
		System.out.println("Biblioteca creada");
		return;
	}
	
	private void accederGestionBiblioteca() {
		String nombreIn;
		System.out.println("ACCESO A BIBLIOTECA");
		System.out.println("Dime el nombre de la biblioteca a acceder");
		nombreIn = s.next();
		for(Biblioteca a : bibliotecas) {
			if(a.getNombreBiblioteca().toLowerCase().equals(nombreIn.toLowerCase())) {
				a.iniciarGestionBiblioteca();
				return;
			}
		}
		System.out.println("No existe esa biblioteca");
	}
	
	private void listarBibliotecas() {
		for(Biblioteca b : bibliotecas) {
			System.out.println(b);
		}
	}
	
	private void guardarBibliotecas() {
		try {
			File file = new File(NOMBRE_FICHERO);
			file.createNewFile();
			FileOutputStream fileOut = new FileOutputStream(NOMBRE_FICHERO);
			ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
			// escribimos objetos en el flujo de salida
			objectOut.writeObject(bibliotecas);

			objectOut.close();
			fileOut.close();
			System.out.println("Bibliotecas guardadas en archivo correctamente.");
		} catch (IOException kagada) {
			System.out.println("Error al guardar en archivo: " + kagada.getMessage());
		}
	}

	private void cargarBibliotecas() {

		try {
			File file = new File(NOMBRE_FICHERO);
			file.createNewFile();
			FileInputStream fileIn = new FileInputStream(NOMBRE_FICHERO);
			ObjectInputStream objectIn = new ObjectInputStream(fileIn);
			bibliotecas = (ArrayList<Biblioteca>) objectIn.readObject();

			objectIn.close();
			fileIn.close();
			System.out.println("Bibliotecas cargadas desde archivo correctamente.");
		} catch (IOException | ClassNotFoundException cagada) {
			System.out.println("Error al cargar desde archivo: " + cagada.getMessage());
		}
	}
	
	
	
}
