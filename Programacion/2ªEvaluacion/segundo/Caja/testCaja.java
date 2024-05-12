package segundo.Caja;

public class testCaja {

    public static void main(String[] args) {
        
        Caja uno = new Caja();
        System.out.println(uno);
        
        Caja dos = new Caja(2, 3, 4, "Caja");
        System.out.println(dos);

        Caja tres = new Caja(5);
        System.out.println(tres);

        Caja cuatro = new Caja(4, 5, 1, "nuda");
        System.out.println(cuatro);

    }
    
}
