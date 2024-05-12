package cosasVarias;

import java.util.Scanner;

public class Bisiesto {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame un año: ");
        int ano = sc.nextInt();
        sc.close();

        if ((ano % 4 == 0 && ano % 10 !=0) || (ano %400 == 0)) {
            System.out.println("Es año bisiesto");
        } else {
            System.out.println("No es año bisiesto");
        }

    }
    
}
