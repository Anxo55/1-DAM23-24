package ChatGPT2.POO;

public class testCoche {

    public static void main(String[] args) {

        Coche coche1 = new Coche();
        Coche coche2 = new Coche("Mercedes", "Benz", 2000);

        System.out.println(coche1.toString());
        System.out.println(coche2.toString());

        //Separador de los metodos principales
        System.out.println("");

        System.out.println("A continucion mostrare los metodos para cada coche: ");
        
        //ejemplos del coche 1
        coche1.arrancar(20);
        coche1.acelerar(80);
        coche1.detenerse(0);

        System.out.println("");
        
        coche2.arrancar(0);
        coche2.acelerar(40);
        coche2.detenerse(10);
        
    }
    
}
