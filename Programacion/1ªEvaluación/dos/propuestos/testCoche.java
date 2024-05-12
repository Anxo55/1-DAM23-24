package dos.propuestos;

public class testCoche {

    public static void main(String[] args) {

        Coche coche1 = new Coche();
       

        System.out.println(coche1);


        coche1.setMarca("Mercedes");
        coche1.setModelo("Benz");
        coche1.setVelocidad(30);

        System.out.println(coche1);

        System.out.println("");

         Coche coche2 = new Coche(23, "Honda", "Civic");
         System.out.println(coche2);

         coche2.acelear(45);
         System.out.println(coche2);
         coche2.frenar(12);
         System.out.println(coche2);
        
    }
    
}
