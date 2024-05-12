package segundo.uno;

public class PostIncremento2 {

    public static void main(String[] args) {
        int a = 1;
        System.out.println(a++);//primero muestra , despues incrementa
        int b = 1;
        System.out.println(++b);//primero incrementa, despues muestra

        System.out.println("Cuanto vale a: "+a);
    }
    
}
