package repaso;

import java.util.Scanner;

public class testCuentas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // primero creamos una de ahorro
        System.out.println("Dime saldo: ");
        float saldo = sc.nextFloat();
        System.out.println("Dime tasa anual: ");
        float tasa = sc.nextFloat();


        CuentaDeAhorros sabe = new CuentaDeAhorros(saldo, tasa, false);
        System.out.println(sabe);

        // movimientos en la cuenta
        System.out.println("consigna: ");
        float consigna = sc.nextFloat();
        sabe.consignar(consigna);

        System.out.println(sabe);

        System.out.println("retira: ");
        float retirar = sc.nextFloat();
        sabe.retirar(retirar);

        System.out.println(sabe);

        sabe.extractoMensual();

        System.out.println("despues de extracto mensual ");
        System.out.println(sabe);
        
    }
    
}
