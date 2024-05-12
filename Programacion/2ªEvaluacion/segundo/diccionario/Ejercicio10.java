package segundo.diccionario;

import java.util.HashMap;
import java.util.Scanner;

// Crea un mini-diccionario español-inglés que contenga, al menos, 20 palabras 
// con su correspondiente traducción). Utiliza un objeto de la clase HashMap 
// para almacenar las parejas de palabras. El programa pedirá una palabra en 
// español y dará la correspondiente traducción en inglés


public class Ejercicio10 {

    static HashMap<String, String> m = new HashMap<String, String>();

    static void poblarM(){
        m.put("ordenador", "computer");
        m.put("gato", "cat");
        m.put("rojo", "red");
        m.put("árbol", "tree");
        m.put("pingüino", "penguin");
        m.put("sol", "sun");
        m.put("agua", "water");
        m.put("viento", "wind");
        m.put("siesta", "siesta");
        m.put("arriba", "up");
        m.put("ratón", "mouse");
        m.put("estadio", "arena");
        m.put("calumnia", "aspersion");
        m.put("aguacate", "avocado");
        m.put("cuerpo", "body");
        m.put("concurso", "contest");
        m.put("cena", "dinner");
        m.put("salida", "exit");
        m.put("lenteja", "lentil");
        m.put("cacerola", "pan");
        m.put("pastel", "pie");
        m.put("membrillo", "quince");

        
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean sigue = true;

    //     do {

    //     String trad = dimePlabra();
    //     System.out.println("Traduce la palabra --> " + trad);
    //     String string = sc.nextLine();

    //     if (string.equals(m.get(trad))) {
    //         System.out.println("Has acertado");
    //     }else{
    //         System.out.println("Has fallado");
    //     }

    //     System.out.println("seguir? s/n");
    //     char letra = sc.nextLine().charAt(0);
    //     if(letra!='s') 
    //         sigue=false;
        
    // } while (sigue);

    int aciertos = 0;

    for(int i=0; i<10; i++) {

        String trad = dimePlabra();
        System.out.println("Traduce la palabra --> " + trad);
        String string = sc.nextLine();

        if (string.equals(m.get(trad))) {
            System.out.println("Has acertado");
            aciertos++;
        }else{
            System.out.println("Has fallado");
        }
        System.out.println("Haciertos "+aciertos+" de 10 intentos.");
    }

    }
    public static String dimePlabra() {
        poblarM();
        int dc = (int) (Math.random()*m.size());

        Object[] pal =  (m.keySet().toArray());

        return (String) pal[dc];

    }
    
}
