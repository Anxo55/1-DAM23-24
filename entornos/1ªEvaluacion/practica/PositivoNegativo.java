import java.util.Scanner;

public class PositivoNegativo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int positivo=0;
        int negativo=0; 
        int cero = 0; 

        int numeroGenerados;

        for(int i=0; i<10; i++) {
            numeroGenerados = (int) (Math.random()*201-100);
            System.out.println("Numero: "+numeroGenerados);

            if (numeroGenerados> 0) {
                positivo++;
            } else if(numeroGenerados < 0){
                negativo++;
            }else{
                cero++;
            }
        }
        System.out.println("Total de numeros positivos: "+positivo);
        System.out.println("Total de negativos: "+negativo);
        System.out.println("Total de ceros: "+cero);
        
    }
    
}
