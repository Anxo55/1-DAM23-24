package ChatGPT2.POO;

public class testTriangulo {

    public static void main(String[] args) {

        Triangulo triangulo1 = new Triangulo(); 
        Triangulo triangulo2 = new Triangulo(60, 60, 1800);
        Triangulo triangulo3 = new Triangulo(61, 60, 1800);

        System.out.println(triangulo1.toString());
        System.out.println(triangulo2.toString());
        System.out.println(triangulo3.toString());

        System.out.println("");

        if (triangulo1.esEquilatero()) {
            System.out.println("El triangulo es equilatero.");
        } else if(triangulo1.esEscaleno()){
            System.out.println("El triangulo es escaleno");
        }else if(triangulo1.esIsosceles()){
            System.out.println("El triangulo es isosceles");
        }
        
        
        if (triangulo2.esEquilatero()) {
            System.out.println("El triangulo es equilatero.");
        } else if(triangulo2.esEscaleno()){
            System.out.println("El triangulo es escaleno");
        }else if(triangulo2.esIsosceles()){
            System.out.println("El triangulo es isosceles");
        }
        
        if (triangulo3.esEquilatero()) {
            System.out.println("El triangulo es equilatero.");
        } else if(triangulo3.esEscaleno()){
            System.out.println("El triangulo es escaleno");
        }else if(triangulo3.esIsosceles()){
            System.out.println("El triangulo es isosceles");
        }
        //metodo equilatero.
        triangulo1.esEquilatero();
        triangulo1.esEscaleno();
        triangulo1.esIsosceles();

        // metodo escaleno
        triangulo2.esEquilatero();
        triangulo2.esEscaleno();
        triangulo2.esIsosceles();

        //metodo isosceles
        triangulo3.esEquilatero();
        triangulo3.esEscaleno();
        triangulo3.esIsosceles();
        
        

    }
    
}
