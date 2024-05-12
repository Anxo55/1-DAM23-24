package cuatro.ejemplos;

public class testLibro2 {

    public static void main(String[] args) {

        Rectangulo r1 = new Rectangulo(5, 7, "rect");
        Rectangulo r2 = new Rectangulo(5, 7, "rect");
        Rectangulo r3 = r1;
        
        if(r1.equals(r2)) {
            System.out.println("Iguales r1 y r2(equals)");
        }
        if(r1.equals(r3)) {
            System.out.println("Iguales r1 y r3(equals)");
        }

        // Ver que es el metodo hashCode
        // System.out.println(r1.hashCode());
        // System.out.println(r2.hashCode());
        // System.out.println(r3.hashCode());

        System.out.println(r1.toString());
        System.out.println(r2.toString());
        System.out.println(r3.toString());

        Rectangulo r4 = new Rectangulo(4, 7, "curb");
        System.out.println(r4.toString());
        System.out.println(r4.equals(r2));
        
    }
    
}
