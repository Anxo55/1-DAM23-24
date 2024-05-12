package dos.propuestos;

import java.util.Scanner;

// 6. (Ejercicio de dificultad alta) Crea la clase peso, la cual tendrá las siguientes características:
// Deberá tener un atributo donde se almacene el peso de un objeto en kilogramos.
// En el constructor se le pasará el peso y la medida en la que se ha tomado (‘Lb’ para libras, ‘Li’ para lingotes, ‘Oz 
// para onzas, ‘P’ para peniques, ‘K’ para kilos, ‘G’ para gramos y ‘Q’ para quintales).
// Deberá de tener los siguientes métodos:
// getLibras. Devuelve el peso en libras.
// getLingotes. Devuelve el peso en lingotes.
// getPeso. Devuelve el peso en la medida que se pase como parámetro (‘Lb’ para libras, ‘Li’ para lingotes, ‘Oz 
// para onzas, ‘P’ para peniques, ‘K’ para kilos, ‘G’ para gramos y ‘Q’ para quintales).

// Para la realización del ejercicio toma como referencia los siguientes datos:
// 1 Libra = 16 onzas = 453 gramos.
// 1 Lingote = 32,17 libras = 14,59 kg.
// 1 Onza = 0,0625 libras = 28,35 gramos.
// 1 Penique = 0,05 onzas = 1,55 gramos.
// 1 Quintal =100 libras = 43,3 kg.
// Crea además un método main para testear y verificar los métodos de esta clase.

public class Peso {

    static Scanner sc;

    private double kilogramos;

    Peso(double peso, String unidad) {
         switch (unidad) {
            case "Lb":
            kilogramos = peso * 0.453;
            break;
        case "Li":
            kilogramos = peso * 14.59 / 32.17;
            break;
        case "Oz":
            kilogramos = peso * 0.02835;
            break;
        case "P":
            kilogramos = peso * 0.00155;
            break;
        case "K":
            kilogramos = peso;
            break;
        case "G":
            kilogramos = peso * 0.001;
            break;
        case "Q":
            kilogramos = peso * 43.3;
            break;
        default:
            kilogramos = 0;
            break;
    }
}

public double getLibra() {
    return kilogramos /0.453;
}

public double getLingotes() {
    return kilogramos * 32.17 /14.59;
}

public double getPeso() {
    Scanner sc = new Scanner(System.in);
    String unidad;
    unidad= sc.nextLine();

    switch (unidad) {
        case "Lb":
            return getLibra();
        case "Li":
            return getLingotes();
        case "Oz":
            return kilogramos / 0.02835;
        case "P":
            return kilogramos / 0.00155;
        case "K":
            return kilogramos;
        case "G":
            return kilogramos / 0.001;
        case "Q":
            return kilogramos / 43.3;
        default:
            return 0;
    }
}
    public static void main(String[] args) {
        
    }
    
}
