package POO;

public class testCoche {

    public static void main(String[] args) {

        Coche coche1 = new Coche();
        Coche coche2 = new Coche("Citroen", "C3", 2014);
        Coche coche3 = new Coche("Mercedes", "Benz", 1990);

        System.out.println(coche1.toString());
        System.out.println(coche2.toString());
        System.out.println(coche3.toString());

        //metodo del año de fabricacion

        System.out.println("");

        coche1.anioFabriacion();
        coche2.anioFabriacion();
        coche3.anioFabriacion();

        
    }
    
}
