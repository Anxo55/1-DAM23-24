package segundo.DinamicosArraysList;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CollecionsList {


    public static int dimeIndiceDeCodigo(String cod) {

       int index=-1;
        for(int i = 0; i<discos.size(); i++) {
            if ((discos.get(i).getCodigo().equals(cod))) 
                index = i;
            
        }
        return index;
    }

    static ArrayList<Disco> discos = new ArrayList<Disco>();

	public static void main(String[] args) {

		
		
		    discos.add(new Disco("GASA41", "Wim Mertens", "Maximazing the Audience", "instrumental", 50));
		    discos.add(new Disco("FGHQ64", "Metallica", "Black album", "hard rock", 46));
		    discos.add(new Disco("TYUI89", "Supersubmarina", "Viento de cara", "pop rock", 42));
		    

	        int opcion;
	        Scanner s = new Scanner(System.in);
	        String codigoIntroducido;
	        String autorIntroducido;
	        String tituloIntroducido;
	        String generoIntroducido;
	        int duracionIntroducida;
	        
//cada vez que listamos ordenamos
	        do {
				System.out.println("\nCOLECCIÓN DE DISCOS");
				System.out.println("===================");
				System.out.println("1. Listado");
				System.out.println("2. Nuevo disco");
				System.out.println("3. Modificar SOLO DATOS");
				System.out.println("4. Borrar");
				System.out.println("5. Salir");
				System.out.println("6. Cambiar solo el codigo");
				System.out.println("SOLO PARA CLIENTES DE PAGO");
				System.out.println("7. Guardar a FICHERO");
				System.out.println("8. Cargar desde fichero");
				System.out.print("Introduzca una opción: ");
				opcion = Integer.parseInt(s.nextLine());

				switch (opcion) {
				case 1:
					System.out.println("\nLISTADO");
					System.out.println("=======");
					//cada vez que listamos ordenamos
					Collections.sort(discos);
					for (Disco d : discos) {
						System.out.println(d);
						}
					

					break;

				case 2:
					System.out.println("\nNUEVO DISCO");
					System.out.println("===========");

					System.out.println("Por favor, introduzca los datos del disco: ");
					System.out.print("Código: ");
					codigoIntroducido = s.nextLine();

					if(dimeIndiceDeCodigo(codigoIntroducido)!=-1){
					
					System.out.println("Por favor, introduzca los datos del disco NUEVO: ");
					System.out.print("Autor: ");
					autorIntroducido = s.nextLine();
					System.out.print("Título: ");
					tituloIntroducido = s.nextLine();
					System.out.print("Género: ");
					generoIntroducido = s.nextLine();
					System.out.print("Duración: ");
					duracionIntroducida = Integer.parseInt(s.nextLine());
					discos.add(new Disco(codigoIntroducido, autorIntroducido, tituloIntroducido, codigoIntroducido, duracionIntroducida));
					System.out.println("Album añadido con codigo: "+codigoIntroducido);
					}else{
						System.out.println("Codigo NO disponible");
					}
					break;

				case 3:
					System.out.println("\nMODIFICAR");
					System.out.println("===========");

					System.out.println("Por favor, introduzca el codigo del disco a MODIFICAR: ");
					codigoIntroducido = s.nextLine();

					if(dimeIndiceDeCodigo(codigoIntroducido)!=-1){
					//SI encontro el codigo lo meto en un entero y guardo los datos del disco en concreto ne mod
					int index = dimeIndiceDeCodigo(codigoIntroducido);
					Disco mod = discos.get(index);

						System.out.println("Introduzca los nuevos datos del disco o INTRO para dejarlos igual.");

						// System.out.println("Código: " + discos[i].getCodigo());
						// System.out.print("Nuevo código: ");
						// codigoIntroducido = s.nextLine();
						// if (!codigoIntroducido.equals("")) {
						// 	discos[i].setCodigo(codigoIntroducido);
						// }

						System.out.println("Autor: " + mod.getAutor());
						System.out.print("Nuevo autor: ");
						autorIntroducido = s.nextLine();
						if (!autorIntroducido.equals("")) {
							mod.setAutor(autorIntroducido);
						}

						System.out.println("Título: " + mod.getTitulo());
						System.out.print("Nuevo título: ");
						tituloIntroducido = s.nextLine();
						if (!tituloIntroducido.equals("")) {
							mod.setTitulo(tituloIntroducido);
						}

						System.out.println("Género: " + mod.getGenero());
						System.out.print("Nuevo género: ");
						generoIntroducido = s.nextLine();
						if (!generoIntroducido.equals("")) {
							mod.setGenero(generoIntroducido);
						}

						System.out.println("Duración: " + mod.getDuracion());
						System.out.print("Duración: ");
						final String duracionIntroducidaString = s.nextLine();
						if (!duracionIntroducidaString.equals("")) {
							mod.setDuracion(Integer.parseInt(duracionIntroducidaString));
						}
						discos.set(index, mod);
						System.out.println("Album MODIFICADO con codigo: "+codigoIntroducido);
					}else{
						System.out.println("Codigo no disponible");
					}

					break;
					

				case 4:
					System.out.println("\nBORRAR");
					System.out.println("======");

					System.out.println("Introduza el codigo del disco que desea borrar: ");
					codigoIntroducido = s.nextLine();

					// para todo el array
               

                    if(dimeIndiceDeCodigo(codigoIntroducido)!=-1) {
                        discos.remove(dimeIndiceDeCodigo(codigoIntroducido));
				        System.out.println("album borrado");
                    }else{
                        System.out.println("Codigo NO encontrado");
                    }

					break;

					case 6:
						System.out.println("\nCAMBIO DE CODIGO");
						System.out.println("======");

						System.out.println("Por favor, introduzca el codigo del disco que desea CAMBIAR");
						codigoIntroducido = s.nextLine();
						
						int indice = dimeIndiceDeCodigo(codigoIntroducido);
							if (indice != -1) {
								System.out.println("Introduzca el nuevo código:");
								String nuevoCodigo = s.nextLine();
								discos.get(indice).setCodigo(nuevoCodigo);
								System.out.println("Código cambiado correctamente.");
							} else {
								System.out.println("No se encontró ningún disco con ese código.");
							}
							break;

					case 7:
							System.out.println("\nGUARDADO en FICHERO EXTERNO");
							System.out.println("============");
							guardarEnArchivo();
							
							break;

					case 8:
							System.out.println("\nCARGADO desde FICHERO EXTERNO");			
							System.out.println("============");
							cargarDesdeArchivo();

							break;
					default:

				} // switch
			} while (opcion != 5);
	        
	    }

		public static final String NOMBRE_FICEHRO="MisDiscos.obj";
		
		public static void guardarEnArchivo() {
        try {
			// la linea de abajo sirve igual que la contigua, sino que la que funciona esta declarada con el static final.
            // FileOutputStream fileOut = new FileOutputStream("discos.ser");
			FileOutputStream fileOut = new FileOutputStream(NOMBRE_FICEHRO);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);

			// escribimos objetos en el flujo de salida
            objectOut.writeObject(discos);
            objectOut.close();
            fileOut.close();
            System.out.println("Discos guardados en archivo correctamente.");
        } catch (IOException cagada) {
            System.out.println("Error al guardar en archivo: " + cagada.getMessage());
        }
    }

	public static void cargarDesdeArchivo() {
        try {
            FileInputStream fileIn = new FileInputStream(NOMBRE_FICEHRO);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);

            discos = (ArrayList<Disco>) objectIn.readObject();

            objectIn.close();
            fileIn.close();
            System.out.println("Discos cargados desde archivo correctamente.");
        } catch (IOException | ClassNotFoundException cagada) {
            System.out.println("Error al cargar desde archivo: " + cagada.getMessage());
        }
    }
	    
	}


