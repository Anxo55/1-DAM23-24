package segundo.ejemplo3_2;

import java.util.Arrays;

public class Cadena {

    public static void main(String[] args) {
        
    String cad = new String("Programacion Orientada a Objetos");
    // Te muestra el total de caracteres que tiene la cadena que tenemos
    System.out.println(cad.length());

    // Asi te va mostrando uno a uno cada uno de los caracteres
    for(int j=0; j<cad.length(); j++) 
        System.out.println("-> "+cad.charAt(j)+" <-");
    
    System.out.println();
    // Lo muestra como un Array con espacios
    char[] frase = cad.toCharArray();
    System.out.println(Arrays.toString(frase));

    String nombrei = "";
    // aqui ya mostramos la cadena sin los espacios, con la condicion del if
    for(int i=0; i<frase.length; i++) {
        if(frase[i] != ' ')
        nombrei+=frase[i];
    }

    System.out.println(nombrei);
    
    String metodo = "";
    metodo = cad.replace(" ", "");
    System.out.println(metodo);

    // Pasarlo a mayusculas
    String mayusculas = metodo.toUpperCase();
    System.out.println(mayusculas);

    // Añadir los numeros a la cadena anterior
    String numeros = mayusculas.concat("12345");
    System.out.println(numeros);

    // de la cadena recorta desde el digito 10 al 16
    String recorte = numeros.substring(10,16);
    System.out.println(recorte);

    // cambio el valor que le pongas al final por el que pides al principio
    String reemplazo = recorte.replace("O", "h");
    System.out.println(reemplazo);

    System.out.println(reemplazo.compareTo("Programacion"));
    // h->104   P-->80 muestra 24 por consola por la resta entre los dos

    // comparamos las dos cadenas
    String uno = "uno";
    String dos = "dos";
    System.out.println(uno.compareTo(dos));
    //  u-->117   d-->100

    String esta = "pepe";
    String aquella = "pepe";
    System.out.println(esta.compareTo(aquella));//saldra 0 por que tienen el mismo valor y la resta nos da 0
    System.out.println(esta.equals(aquella));//son dos cadenas identicas y saldrá true

    }
    
}
