package practicaJunior;

import java.util.Scanner;

public class positivoNegativo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int positivo = 0;
        int negativo = 0;
        int cero = 0;

        for(int i=1; i<=10; i++) {
            int numero = i;
            numero = (int) (Math.random()*200-101);
            System.out.println("Numero-"+i+ "= "+numero);

            if (numero >0) {
                positivo++;
            } else if(numero<0){
                negativo++;
            }else{
                cero++;
            }
        }
        System.out.println("");
        System.out.println("El total de positivos es: "+positivo);
        System.out.println("El total de negativo es: "+negativo);
        System.out.println("El total de ceros es: "+cero);
        
        
    }
    
}
