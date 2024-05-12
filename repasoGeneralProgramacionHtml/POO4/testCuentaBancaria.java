package POO4;

public class testCuentaBancaria {

    public static void main(String[] args) {

        CuentaBancaria cuentaBancaria1 = new CuentaBancaria();
        CuentaBancaria cuentaBancaria2 = new CuentaBancaria(3000, "Marta", "Santander");

        System.out.println(cuentaBancaria1.toString());
        System.out.println(cuentaBancaria2.toString());

        System.out.println("");

        cuentaBancaria1.ingresoDinero(1000);
        System.out.println(cuentaBancaria1);

        cuentaBancaria2.retiraDinero(1000);
        System.out.println(cuentaBancaria2);
    }
    
}
