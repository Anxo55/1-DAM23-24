package EjemploOO;

public class Principal {

    public static void main(String[] args) {

        Coche Antonio = new Coche();
        Coche Pepe  = new Coche("Pepe", 9999);
        Coche Pedro = new Coche("Seat", "Leon", 0001, "Pedro", 'b');

        System.out.println(Antonio.toString());
        System.out.println(Pepe.toString());
        System.out.println(Pedro.toString());
        
    }
    
}
