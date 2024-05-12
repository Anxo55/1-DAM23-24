package dos.resueltos;

public class testSatelite {

    public static void main(String[] args) {

        satelite sabaris = new satelite(-8, 42, 1);
        System.out.println(sabaris.toString());
        sabaris.setPosicion(1, 42.4, 0.5);
        System.out.println(sabaris.toString());
        System.out.println("");
             
        satelite marciano = new satelite();
        System.out.println(marciano.toString());
        marciano.setMeridiano(20);
        marciano.setDistancia_tierra(40);
        System.out.println(marciano.toString());

        double altura = marciano.getDistancia_tierra();
        System.out.println("La altura de marciano es: "+altura);
        
    }
    
}
