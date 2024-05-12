package cuatro.ejemplos;

public class testRectangulo {

    public static void main(String[] args) {

        Rectangulo rectangulo1 = new Rectangulo(3, 5,"Pepe");
        // Rectangulo rectangulo2 = new Rectangulo(10, 20);

        System.out.println("ancho: "+rectangulo1.getAncho());
        System.out.println("alto: "+rectangulo1.getAlto());
        System.out.println(rectangulo1.toString());
        System.out.println(" ");
        

        rectangulo1.incrementaAlto();
        rectangulo1.incrementaAlto();
        rectangulo1.incrementaAlto();
        rectangulo1.incrementaAlto();
        rectangulo1.incrementaAncho();

        System.out.println("ancho: "+rectangulo1.getAncho());
        System.out.println("alto: "+rectangulo1.getAlto());
        System.out.println(rectangulo1.toString());

        Rectangulo rectangulo2 = new Rectangulo(rectangulo1);
        System.out.println(rectangulo2.toString());

        rectangulo2.incrementaAlto();
        rectangulo2.incrementaAncho();
        System.out.println("");

        System.out.println("Datos de uno");
        System.out.println(rectangulo1);

        System.out.println("Datos de dos (constructor de copia uno)");
        System.out.println(rectangulo2);

        Rectangulo rectangulo3 = (Rectangulo) rectangulo1.Clone();
        System.out.println("Datos de tres (clon de uno)");
        System.out.println(rectangulo3);
        rectangulo3.incrementaAlto();
        System.out.println(rectangulo3);

        Rectangulo rectangulo4;
        //asignacion
        rectangulo4=rectangulo1;
        System.out.println("rectangulo4: "+rectangulo4);
        rectangulo4.incrementaAlto();
        System.out.println("rectangulo1: "+rectangulo1);
        System.out.println("rectangulo4: "+rectangulo4);
    }
    
}
