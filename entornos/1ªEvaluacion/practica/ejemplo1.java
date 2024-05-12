// package practica;

public class ejemplo1 {

    public static void main(String[] args) {
        
        System.out.println("Hello world");
        int a = 7;
        int b = 6;
        int c = a+b;

    }

    public static int power(int base, int exponente) {
        return (int)Math.pow(base, exponente);
    }

    public static int potencia(int base, int exponente) {
        int resultado=1;
        for(int i=0; i<exponente; i++) {
            resultado *= base;
        }
            return resultado;
    }

    public static double funcI(int num1, int num2) {
        int aux = 1;
        for(int i=0; i<num2; i++) {
            aux*=num1;
        }
        return aux;
    }
    
}
