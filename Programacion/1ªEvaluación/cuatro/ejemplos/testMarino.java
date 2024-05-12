package cuatro.ejemplos;

public class testMarino {

    public static void main(String[] args) {

        // crear un pez
        Pez pez1 = new Pez("Alberto", 2, 20);

        // crear un espada
        Espada espada1 = new Espada("Rodolfo", 2, 30, 60, 10);

        // crear un martillo

        Martillo martillo1 = new Martillo("Agustin", 3, 40, 69);

        // Probar los metodos nada y soy comestible

        System.out.println(pez1.toString());
        System.out.println(espada1.toString());
        System.out.println(martillo1.toString());

        System.out.println(" ");
        
        pez1.nada();
        System.out.println();
        espada1.nada();
        System.out.println();
        martillo1.nada();
        
    }
    
}
