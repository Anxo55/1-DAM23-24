package POO;

public class testCuentaBancaria {

    public static void main(String[] args) {

        CuentaBancaria cuentaBancaria1 = new CuentaBancaria();
        CuentaBancaria cuentaBancaria2 = new CuentaBancaria(3000, "Benito");

        System.out.println(cuentaBancaria1.toString());
        System.out.println(cuentaBancaria2.toString());

        System.out.println("");

        //metodos a parte.

        //metodo ingresa dinero
        cuentaBancaria1.ingresaDinero(1000);
        cuentaBancaria2.ingresaDinero(1000);
        System.out.println(cuentaBancaria1);
        System.out.println(cuentaBancaria2);

        System.out.println("");

        //metodo retira dinero
        cuentaBancaria1.retirarDinero(2000);
        cuentaBancaria2.retirarDinero(2000);
        System.out.println(cuentaBancaria1);
        System.out.println(cuentaBancaria2);

        System.out.println("");

        //metodo muestra saldo actual

        cuentaBancaria1.consultaSaldo();
        cuentaBancaria2.consultaSaldo();
        
    }
    
}
