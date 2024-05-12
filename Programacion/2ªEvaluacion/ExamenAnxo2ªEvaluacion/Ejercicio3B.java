package ExamenAnxo2ªEvaluacion;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Con las clases carta y mano de 4 cartas del material del trimestre utilice un HashMap
// para contabilizar la puntuación según el siguiente criterio para cada carta:

// Oros 4 puntos Copas 3 puntos Espadas 2 puntos Bastos 1 punto



// Prepare un menú que permita

// 1 generar y mostrar el resultado de la mano por pantalla
// 2 guardar la mano en un fichero
// 3 recuperar la mano desde un fichero
// 4 salir


// NO FUI CAPAZ DE GUARDARLO EN FICHERO, NO SUPE SOLUCIONAR EL ERROR AL PASARLO

public class Ejercicio3B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Carta, Integer> mano = new HashMap<>();
        int opcion; 

        do {
        
            System.out.println("Menú:");
            System.out.println("1. Generar mano");
            System.out.println("2. Mostrar mano");
            System.out.println("3. Guardar mano en un fichero");
            System.out.println("4. Recuperar mano desde un fichero");
            System.out.println("5. Salir del bucle");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    generarMano(mano);
                    break;
                case 2:
                    mostrarMano(mano);
                    break;
                case 3:
                    guardarManoEnFichero(mano);
                    break;

                case 4:
                    recuperarManoDesdeFichero(mano);
                    break;
                case 5:
                    System.out.println("Saliendo del programa");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcicon icnorrecta, vuelve a intentarlo...");
            }

        } while (opcion != 5);
        
    }

    public static void generarMano(HashMap<Carta, Integer> mano) {
        mano.clear();
        for (int i = 0; i < 4; i++) {
            Carta carta = new Carta();
            mano.put(carta, mano.getOrDefault(carta, 0) + getPuntos(carta));
        }
        System.out.println("Mano generada con exito");
    }

    public static void mostrarMano(HashMap<Carta, Integer> mano) {
        System.out.println("Mano mostrada con exito: ");
        for(Map.Entry<Carta, Integer> entry : mano.entrySet()) {
            System.out.println(entry.getKey() + "  Puntos: " + entry.getValue());
        }
    }

    public static final String NOMBRE_FICEHRO="mano.obj";
    public static void guardarManoEnFichero(HashMap<Carta, Integer> mano) {
        try {
			// la linea de abajo sirve igual que la contigua, sino que la que funciona esta declarada con el static final.
            // FileOutputStream fileOut = new FileOutputStream("discos.ser");
			FileOutputStream fileOut = new FileOutputStream(NOMBRE_FICEHRO);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);

			// escribimos objetos en el flujo de salida
            objectOut.writeObject(mano);
            objectOut.close();
            fileOut.close();
            System.out.println("Discos guardados en archivo correctamente.");
        } catch (IOException cagada) {
            System.out.println("Error al guardar en archivo: " + cagada.getMessage());
        }
    }

	public static void recuperarManoDesdeFichero(HashMap<Carta, Integer> mano) {
        try {
            FileInputStream fileIn = new FileInputStream(NOMBRE_FICEHRO);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);

            mano = (HashMap<Carta, Integer>) objectIn.readObject();

            objectIn.close();
            fileIn.close();
            System.out.println("Discos cargados desde archivo correctamente.");
        } catch (IOException | ClassNotFoundException cagada) {
            System.out.println("Error al cargar desde archivo: " + cagada.getMessage());
        }
    }

    public static int getPuntos(Carta carta) {
        switch (carta.getPalo()) {
            case "oros":
                return 4;
            case "copas":
                return 3;
            case "espadas":
                return 2;
            case "bastos":
                return 1;
            default:
                return 0;
        }
    }

    
}
