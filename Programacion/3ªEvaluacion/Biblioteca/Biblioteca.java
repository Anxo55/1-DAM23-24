package Biblioteca;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Biblioteca {
	
	public static int scanyint(String texto) {
		boolean error;
		int res = 0;
		do {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.print(texto);
				res = sc.nextInt();
				error = false;

			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Error, dame un entero.");
				error = true;
			}

		} while (error);

		return res;

	}
	
	public static String scanystring(String texto) {
		Scanner sc = new Scanner(System.in);
		System.out.print(texto);
		return sc.nextLine();
	}
	
	protected String nombre;
	protected ArrayList<Libro> libros;
	
	
	public Biblioteca(String nombre) {
		super();
		this.nombre = nombre;
		this.libros = new ArrayList<Libro>();
	}
	
	
	public void llenarBiblioteca() {
		this.libros.add(new Libro("Cien anhos de soledad","Gabriel Garcia Marquez",1972,"Sudamericana","858.67/M566"));
		this.libros.add(new Libro("Rayuela","Julio Cortazar",1963,"","863.55/J667"));
		this.libros.add(new Libro("La tia Julia y el escribidor","Mario Vargas Llosa",1977,"Seix Barral","868.23/L567"));
	}
	
	
	public void addLibro(Libro libro) {
		this.libros.add(libro);
		
	}
	
	public void listarLibros() {
		System.out.println("Listado de Libros:");
		for (Libro libro : libros) {
			System.out.println(libro);
		}
		
	}
	
	public void buscarLibro2(String isbn) {
		boolean presente=false;
		for (Libro libro : libros) {
			if(libro.getIsbn().equals(isbn)) {
				System.out.println("Ya existe ese isbn");
				System.out.println(libro);
				presente=true;
			}
		}
		if(!presente) {
			System.out.println("No esiste el libro");
		}
		
		
		
	}
	
	
	
	
	public Libro buscarLibro(String isbn) {
		Libro res=null;
		boolean presente=false;
		for (Libro libro : libros) {
			if(libro.getIsbn().equals(isbn)) {
				/*System.out.println("Ya existe ese isbn");
				System.out.println(libro);*/
				presente=true;
				res=libro;
			}
		}
		if(!presente) {
			System.out.println("No esiste el libro");
		}
			
		/*	
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("No hay libro aqui.");
			res=new Libro();
		}*/
		
		return res;

		
	}
	
	
	public void borrarLibro(String isbn) {
		Libro aborrar=this.buscarLibro(isbn);
		if(aborrar!=null) {
			System.out.println("Borrando");
			this.libros.remove(aborrar);
			System.out.println("Se ha borrado: "+aborrar);
		}else {
			System.out.println("No se ha encontrado el libro a borrar");
		}
	}
	
	
	public void modifLibro(String isbn) {
		System.out.println("\nMODIFICAR");
		System.out.println("===========");
		
		

		Libro modi=buscarLibro(isbn);
		if(modi!=null) {
			
			System.out.println("Libro Encontrado");
			
			System.out.print("Introduzca los nuevos datos del artículo");
			System.out.println(" o INTRO para dejarlos igual.");
			
			
			System.out.println("Titulo: "+modi.getTitulo());
			if(!scanystring("Cambiar el Titulo?").equals("")) {
				modi.setTitulo(scanystring("Nuevo titulo: "));
			}
			
			System.out.println("Autor: "+modi.getAutor());
			if(!scanystring("Cambiar el Autor?").equals("")) {
				modi.setAutor(scanystring("Dame el nuevo autor: "));
			}
			
			System.out.println("Editorial: "+modi.getEditorial());
			if(!scanystring("Cambiar la editorial?").equals("")) {
				modi.setAutor(scanystring("Dame la nueva editorial: "));
			}
			
			
			System.out.println("Anho de publicacion"+modi.getAnhoPublicacion());
			if(!scanystring("Cambiar el AnhoPublicacion?").equals("")) {
				modi.setAnhoPublicacion(scanyint("Nuevo anho de publicacion: "));
			}
			
		}else {
			System.out.println("No Existe libro en la biblioteca con ese ISBN");
		}
		
		
		
		
		
		


	}
	
	
	public String guardarEnArchivo(String namefichero) {
		String mensaje="Error";
		try {
			ArrayList<Libro> libros=this.libros;
			FileOutputStream fileOut = new FileOutputStream(namefichero);
			ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);

			objectOut.writeObject(libros);

			objectOut.close();
			fileOut.close();
			mensaje="Discos guardados en archivo correctamente.";
			
		} catch (IOException e) {
			mensaje="Error al guardar en archivo: " + e.getMessage();
			
		}
		return mensaje;
	}
	
	public void cargarDesdeArchivo(String namefichero) {
		this.libros=new ArrayList<Libro>();
		try {
			FileInputStream fileIn = new FileInputStream(namefichero);
			ObjectInputStream objectIn = new ObjectInputStream(fileIn);
			System.out.println("aqui llego");
			this.libros = (ArrayList<Libro>) objectIn.readObject();

			 objectIn.close();
			fileIn.close();
			System.out.println("Libros cargados desde archivo correctamente.");;
			
		} catch (IOException | ClassNotFoundException cagada) {
			 System.out.println("Error al cargar desde archivo: " + cagada.getMessage());
			
		}

		
	}



	@Override
	public String toString() {
		return "Biblioteca [nombre=" + nombre + ", libros=" + libros + "]";
	}
	
	
	
	
	
	

}
