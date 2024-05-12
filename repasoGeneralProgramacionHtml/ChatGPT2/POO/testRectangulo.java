package ChatGPT2.POO;

public class testRectangulo {

    public static void main(String[] args) {
        
        Rectangulo rectangulo1 = new Rectangulo(40, 5);
        Rectangulo rectangulo2 = new Rectangulo();

        System.out.println(rectangulo1);
        System.out.println(rectangulo2);

        System.out.println("");
        
        rectangulo1.arearRectangulo(4, 4);
        rectangulo1.perimetroRectangulo(4, 4);

    }
    
}
