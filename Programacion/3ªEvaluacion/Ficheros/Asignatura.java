package Ficheros;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Asignatura implements Serializable{

    int codigo;
    String nombre;
    int creditos;

    public Asignatura(int codigo, String nombre, int creditos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
    }

    public void imprimir() {
        System.out.println("Codigo de la asignatura = " + codigo);
        System.out.println("Nombre de la asignatura = " + nombre);
        System.out.println("Cantidad de creditos = " + creditos);
    }

    public void escribirAsignatura() {
        try {
            FileOutputStream archivo = new FileOutputStream("asignatura.dat");
            ObjectOutputStream salida = new ObjectOutputStream(archivo);
            salida.writeObject(this);
            salida.close();
        } catch (Exception e) {
            System.out.println("No se puede escribir en el archivo");
        }
    }

    void leerAsignatura() {
		try {
			// Define el archivo a leer
			FileInputStream archivo = new FileInputStream("asignatura.dat");
			// Crea el objeto de flujo de entrada para la lectura del objeto
			ObjectInputStream entrada = new ObjectInputStream(archivo);
			// Lee el objeto en el flujo de entrada
			Asignatura asignatura = (Asignatura) entrada.readObject();
			//MUESTRA EL RESULTADO DE LA LECTURA
			asignatura.imprimir();
			entrada.close(); // Cierra el flujo de entrada de datos
		} catch (FileNotFoundException e) {
			// Captura una excepción en caso de no encontrar el archivo
			System.out.println("No se pudo leer el archivo");
		} catch (IOException e) {
			/* Captura una excepción en caso de ocurrir un error de entrada/salida */
			System.out.println("Error de entrada/salida");
		} catch (Exception e) { // Captura una excepción general
			System.out.println("Error al leer el archivo");
		}
	}
}
