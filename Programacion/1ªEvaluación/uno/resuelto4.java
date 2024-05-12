package uno;

public class resuelto4 {

    public static void main(String[] args) {
        
        int a=5, b=8;
        int tmp;

        System.out.println("El valor de a al empezar: "+a);
        System.out.println("El valor de b al empezar: "+b);

        tmp = a;
        a=b;
        b=tmp;

        System.out.println("El valor de a ahora es: "+a);
        System.out.println("El valor de b ahora es: "+b);
    }
    
}
