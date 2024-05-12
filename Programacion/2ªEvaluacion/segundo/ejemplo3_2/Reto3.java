package segundo.ejemplo3_2;

import java.util.Scanner;

public class Reto3 {

    public static int contador(char letra, String frase) {
        int contador = 0;
        for(int i = 0; i<frase.length(); i++) 
            if(frase.charAt(i)==letra) {
                contador++;
            }
        
        return contador;
    }

    public static void main(String[] args) {

        String[] cadena = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce caracter a buscar: ");
        char letra = sc.nextLine().charAt(0);

        for(int i = 0; i<cadena.length; i++) {
            System.out.println(cadena[i]);
            System.out.println("Numero de letras: "+cadena[i].length());
            System.out.println("Numero de veces que aparece la letra "+letra+" : "+contador(letra, cadena[i].toLowerCase()));
        }
        
    }
    
}
