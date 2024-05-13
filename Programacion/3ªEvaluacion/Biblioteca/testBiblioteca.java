package Biblioteca;

import java.util.ArrayList;
import java.util.Scanner;


public class testBiblioteca {
	
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
		
	//Menu
	public static int menu(String opciones) {
			//Variables 
			Scanner sc= new Scanner(System.in);
			int ans;
			//System.out.println("Respuesta:");
			ans=scanyint(opciones+"\n Respuesta: ");//Admite tambien mayusculas
			return ans;

		
	}
	
	public static int buscarLibro(ArrayList<Libro> d, String isbn){
		int pos=-1;
		for (int i = 0; i < d.size(); i++) {
			if(d.get(i).getIsbn().equals(isbn)) {
				pos=i;
			}
		}
		return pos;
	}
	
	public static void main(String[] args) {
		Biblioteca BNacional=new Biblioteca("Biblioteca Nacional");
		int opcion=0;
		boolean salir;
		String nfic;
		String opcionCargar="De donde quieres cargar datos"
				+ "\n"+"1 Archivo"+ "\n"+"2 Metodo llenarlibros"+ "\n"+"3/otro Salir";
		
		
			do {
			
			opcion=menu(opcionCargar);
			
			salir=switch (opcion) {
			case 1: {
				System.out.println("Cargando desde Archivo");
				nfic=scanystring("Dame el nombre del archivo desde el que cargar datos: ");
				BNacional.cargarDesdeArchivo(nfic);
				
				yield true;
			}
			case 2: {
				System.out.println("Cargando desde Metodo");
				BNacional.llenarBiblioteca();
				
				yield true;
			}
			default:
				System.out.println("Saliendo");
				yield true;
			};
			
			
			
		}while(!salir);
		
		
		String opcionlist="==================="+"\n"+"1. Listado"+"\n"+"2. Nuevo Libro"
				+ "\n"+"3. Modificar Libro"+ "\n"+"4. Borrar"+ "\n"+"5. Buscar Libro y mostrar"+"\n"+"6. Guardar a fichero"
						+ "\n"+"7. Cargar desde fichero"+"\n"+"8. Cargar desde metodo"+"\n"+"9. Salir"+"\n"+"¿Que desea hacer?  ";

		
		
		do {
			
			opcion=menu(opcionlist);
			
			salir=switch (opcion) {
			case 1: {
				System.out.println("Listado/n");
				BNacional.listarLibros();
				
				yield false;
			}
			case 2: {
				System.out.println("Nuevo libro/n");
				BNacional.addLibro(new Libro(scanystring("Dame el titulo del libro: "),scanystring("Dame el autor del libro: "),scanyint("Dame el anho de publicacion: "),scanystring("Dame la editorial del nuevo libro: "),scanystring("Dame el ISBN del nuevo libro: ")));
				
				yield false;
			}
			case 3: {
				System.out.println("Modificar libro/n");
				
				BNacional.modifLibro(scanystring("Dame el ISBN del libro a modificar: "));
				
				yield false;
			}
			case 4: {
				System.out.println("Borrar libro/n");
				
				BNacional.borrarLibro(scanystring("Dame el ISBN del libro a borrar: "));
				
				yield false;
			}
			case 5: {
				System.out.println("Buscar libro y mostrar/n");
				
				Libro l=BNacional.buscarLibro(scanystring("Dame el ISBN del libro a buscar: "));
				if(l==null) {
					System.out.println("No esta presente");
				}else {
					System.out.println("Libro Encontrado");
					System.out.println(l);
				}
				
				yield false;
			}
			case 6: {
				
				System.out.println("Guardar en Archivo/n");
				BNacional.guardarEnArchivo(scanystring("Dame l nombre del fichero donde huardar los datos: "));
				
				yield false;
			}
			case 7: {
				
				System.out.println("Cargar desde Archivo/n");
				BNacional.cargarDesdeArchivo(scanystring("Dame l nombre del fichero desde donde cargar los datos: "));
				
				yield false;
			}
			case 8: {
				
				System.out.println("Cargando desde Metodo");
				BNacional.llenarBiblioteca();
				
				yield false;
				
			}
			default:
				
				yield true;
			};
			
			System.out.println("\n");
			
			
			
		}while(!salir);
		
		/*
		
		BNacional.llenarBiblioteca();
		BNacional.addLibro(new Libro("Cien desgracias en soledad","Gabriel Garcia Marquez",1972,"","2424"));
		BNacional.listarLibros();*/
	}

}
