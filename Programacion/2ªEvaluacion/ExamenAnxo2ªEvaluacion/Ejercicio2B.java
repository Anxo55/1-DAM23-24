package ExamenAnxo2ªEvaluacion;

import java.util.Scanner;

// Un grupo de inteligencia militar desea codificar los mensajes secretos de tal forma que no puedan
//  ser interpretados con una lectura directa, para lo cual han establecido las siguientes reglas:
// a) Todo mensaje debe estar sus letras en mayúsculas. 
// b) Reemplazar cada letra por la que PRECEDE dos posiciones antes según abecedario, excepto A que
//  se deberá reemplazar con la letra Y y B por Z. 
// c) Reemplazar cada dígito encontrado por el número dos posiciones  anterior excepto el 0 que deberá
//  ser reemplazado por el 8, y el 1 por el 9.

// Pida una cadena al usuario (conteniendo letras mayusculas y minusculas y digitos) y 
// muestrela codificada con las anteriores reglas.


public class Ejercicio2B {

      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el mensaje a codificar:");
        String mensaje = sc.nextLine().toUpperCase(); 
        
        String mensajeCodificado = codificarMensaje(mensaje);
        
        System.out.println("Mensaje codificado: " + mensajeCodificado);
        
        sc.close();
    }
    
    public static String codificarMensaje(String mensaje) {
        StringBuilder mensajeCodificado = new StringBuilder();
        
        for (int i = 0; i < mensaje.length(); i++) {
            char caracter = mensaje.charAt(i);
            
            if (Character.isLetter(caracter)) {

                if (caracter == 'A')
                    mensajeCodificado.append('Y');
                else if (caracter == 'B')
                    mensajeCodificado.append('Z');
                else
                    mensajeCodificado.append((char)(caracter - 2));

            } else if (Character.isDigit(caracter)) {

                if (caracter == '0')
                    mensajeCodificado.append('8');
                else if (caracter == '1')
                    mensajeCodificado.append('9');
                else
                    mensajeCodificado.append((char)(caracter - 2));
                    
            } else {
                mensajeCodificado.append(caracter); 
            }
        }
        
        return mensajeCodificado.toString();
    }
}
    

