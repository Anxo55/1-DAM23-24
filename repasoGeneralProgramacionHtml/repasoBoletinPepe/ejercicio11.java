package repasoBoletinPepe;

public class ejercicio11 {

    public static void main(String[] args) {
        int contador = 1;
        
        for(int i=1; i<=19; i+=2) {
            contador*=i;
        }
        System.out.println("El producto es: "+contador);
    }
    
}
