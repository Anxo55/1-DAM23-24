package Perplexity.POO;

import java.util.Scanner;

public class testCuentaBancaria {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        cuentaBancaria santander = new cuentaBancaria(5000, "Fito");
        cuentaBancaria bbva = new cuentaBancaria(4500, "Marta");

        System.out.println(santander.toString());
        System.out.println(bbva.toString());
        

        santander.depositarDinero(2000);
        bbva.retirarDinero(1000);

        System.out.println(santander.toString());
        System.out.println(bbva.toString());
        
    }
    
}
