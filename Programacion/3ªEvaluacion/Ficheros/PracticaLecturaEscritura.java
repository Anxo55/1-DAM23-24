package Ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PracticaLecturaEscritura {
    
    public static void main(String[] args) {
        // Nombre del archivo de entrada y salida
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        try {
            // Abre el archivo de entrada para lectura
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            // Abre el archivo de salida para escritura
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            // Lee el archivo línea por línea
            String line;
            while ((line = reader.readLine()) != null) {
                // Convierte todas las vocales a mayúsculas
                line = line.replaceAll("[aeiouAEIOU]", new String("AEIOU"));

                // Escribe la línea modificada en el archivo de salida
                writer.write(line);
                // Escribe un salto de línea para separar las líneas en el archivo de salida
                writer.newLine();
            }

            // Cierra los archivos
            reader.close();
            writer.close();

            System.out.println("El proceso ha finalizado con éxito.");
        } catch (IOException e) {
            System.out.println("Error al procesar el archivo: " + e.getMessage());
        }
    }
}
