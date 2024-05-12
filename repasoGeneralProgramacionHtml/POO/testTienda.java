package POO;

public class testTienda {

    public static void main(String[] args) {

        Tienda producto1 = new Tienda();
        Tienda producto2 = new Tienda("Manzana", 4.6, 8);
        Tienda producto3 = new Tienda("Kiwi", 5.3, 10);

        System.out.println(producto1.toString());
        System.out.println(producto2.toString());
        System.out.println(producto3.toString());

        System.out.println("");
        
    }
    
}
