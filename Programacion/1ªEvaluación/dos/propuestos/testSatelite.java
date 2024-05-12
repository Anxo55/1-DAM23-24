package dos.propuestos;

public class testSatelite {

    public static void main(String[] args) {

        satelite satelite1 = new satelite();
        satelite satelite2 = new satelite(3, 6, 16);

        System.out.println(satelite1);
        System.out.println(satelite2);

        System.out.println("");

        satelite1.variaAltura(4);
        System.out.println("True si está en orbita: "+ satelite1.enOrbita());
        satelite1.variaPosicion(4, 5);

        satelite2.variaAltura(6);
        System.out.println("True si esta en orbita: "+ satelite1.enOrbita());
        satelite2.variaPosicion(6,8);

        System.out.println(satelite1);
        System.out.println(satelite2);


        
    }
    
}
