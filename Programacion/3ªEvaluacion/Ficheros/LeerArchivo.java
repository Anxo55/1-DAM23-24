package Ficheros;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeerArchivo {

    public static void main(String[] args) throws Exception{

        String nombreArchivo = "prueba.txt"; //Definicion del archivo de texto a leer.
        FileInputStream archivo; //Definicion de flujo de datos
        InputStreamReader conversor; //Definicion del flujo de lectura
        BufferedReader filtro; //Definicion del buffer.
        String linea;

        try {
            // Crea los objetos FileInputStream, BufferedReader y BufferredReader
            archivo = new FileInputStream(nombreArchivo);
            conversor = new InputStreamReader(archivo);
            filtro = new BufferedReader(conversor);
            linea = filtro.readLine();
            while (linea != null) {
                System.out.println(linea); //Imprime en pantalla una linea de archivo
                linea = filtro.readLine(); // Lee la siguiente linea
            }
            filtro.close(); //Cierra el archivo
        } catch (IOException e) { // En caso se genera una excepcion
            System.out.println("No se puede leer el archivo.");
        }
        
    }
    
}
