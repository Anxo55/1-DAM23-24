package POO;

import java.util.Scanner;

public class testCuenta {

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        double cantidad;
        
        Cuenta bancaria = new Cuenta("Marta", 12000);
        Cuenta bancaria2 = new Cuenta("Adolfo");

        System.out.println(bancaria.toString());
        System.out.println(bancaria2.toString());

        System.out.println("Ingresame una cantidad: ");
        cantidad = sc.nextInt();

        //A continuacion, siempre que creamos algun metodo en la clase madre,
        //para utilizarla tenemos que meterlo directamente en uno de los objetos
        //creados en esta clase anteriormente

        bancaria2.ingresaCantidad(cantidad);
        System.out.println(bancaria.toString());

    }
    
}
