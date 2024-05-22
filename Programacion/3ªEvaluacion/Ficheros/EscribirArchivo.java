package Ficheros;

import java.io.FileWriter;
import java.io.PrintWriter;

public class EscribirArchivo {

    public static void main(String[] args) {

        FileWriter archivo = null;
        PrintWriter imrpesor = null;
        
        try {
            // Definicion del archivo a crear
            archivo = new FileWriter("escritura.txt");
            // Definicion del objeto que imprime
            imrpesor = new PrintWriter(archivo);
            // Ciclo para imprimir 10 lineas en el archivo
            System.out.println("Comenzando escritura");
            for (int i = 0; i < 10; i++) {
                imrpesor.println("Linea" + i);
            }  //Captura una excepcion enc aso de no poder imprimir datos en el archivo de texto
        } catch (Exception e) {
            // Muestra un texto descriptivo acerca de la excepcion generada
            e.printStackTrace();
        }finally{
            try {
                if (archivo != null) {
                    archivo.close(); // Cierra el archivo
                }
            } catch (Exception e2) {
                // captura una excepcion en caso de que ocurra
                e2.printStackTrace();
                // Muestra un texto descriptivo acerca de la excepcion
            }
        }
        System.out.println("fin escritura");
    }
    
}
