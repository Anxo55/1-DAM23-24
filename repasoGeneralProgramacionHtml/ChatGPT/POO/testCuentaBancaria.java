package ChatGPT.POO;

import java.util.Scanner;

public class testCuentaBancaria {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        CuentaBancaria santander = new CuentaBancaria(3000, "Marta");
        CuentaBancaria bbva = new CuentaBancaria(2500, "Teresa");
        CuentaBancaria madrid = new CuentaBancaria(2000, "Adolfo");

        System.out.println(santander.toString());
        System.out.println(bbva.toString());
        System.out.println(madrid.toString());

        //Despues de syso para dejar un espacio, probaremos los metodos creados de retirar y
        // ingresar
        System.out.println("");

        //Probamos el metodo de depostiar dinero y lo mostramos
        santander.depositaDinero(500);
        bbva.depositaDinero(1000);
        madrid.depositaDinero(1500);

        System.out.println(santander.toString());
        System.out.println(bbva.toString());
        System.out.println(madrid.toString());

        System.out.println("");

        santander.retirarDinero(250);
        bbva.retirarDinero(800);
        madrid.retirarDinero(1200);

        System.out.println(santander.toString());
        System.out.println(bbva.toString());
        System.out.println(madrid.toString());
    }
    
}
