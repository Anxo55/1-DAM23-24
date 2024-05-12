package Aritmetica;

public class testAritmetica {

    public static void main(String[] args) {
        
        Numero numero1 = new Numero(5);
        Numero numero2 = new Numero(3);
        
        
        numero1.sumar(numero2);
        System.out.println("Suma de numeros: " + numero1);
        
        numero1.restar(numero2);
        System.out.println("Resta de numeros: " + numero1); 
        
        numero1.multiplicar(numero2);
        System.out.println("Multiplicación de numeros: " + numero1); 
        
        numero1.dividir(numero2);
        System.out.println("División de numeros: " + numero1); 
        
        // Crear objetos de la clase Fraccion
        Fraccion fraccion1 = new Fraccion(new Numero(1), new Numero(2));
        Fraccion fraccion2 = new Fraccion(new Numero(1), new Numero(3));
        
        
        fraccion1.sumar(fraccion2);
        System.out.println("Suma de fracciones: " + fraccion1); 
        
        fraccion1.restar(fraccion2);
        System.out.println("Resta de fracciones: " + fraccion1); 
        
        fraccion1.multiplicar(fraccion2);
        System.out.println("Multiplicación de fracciones: " + fraccion1);

        fraccion1.dividir(fraccion2);
        System.out.println("Division de fracciones: "+fraccion1);
    }
}
