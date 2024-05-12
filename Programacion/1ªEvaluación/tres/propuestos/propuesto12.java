package tres.propuestos;

//  Realiza un programa que muestre por pantalla los números del 1 al 100 sin mostrar aquellos números múltiplos 
// de 5.

public class propuesto12 {

    public static void main(String[] args) {

        for(int i = 1; i<=100; i++) {
            if(i % 5 != 0){
                System.out.println("Valor "+i);
            }
           
        }

        
    }
    
}
