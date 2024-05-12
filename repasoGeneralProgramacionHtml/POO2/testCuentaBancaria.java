package POO2;

public class testCuentaBancaria {

    public static void main(String[] args) {

        CuentaBancaria cuenta1 = new CuentaBancaria();
        CuentaBancaria cuenta2 = new CuentaBancaria("Angel", 2325, 21);

        System.out.println(cuenta1.toString());
        System.out.println(cuenta2.toString());

        System.out.println("");

        //metodos a parte de la propia clase.

        //metodo que deposita dinero

        cuenta1.depositarDinero(1000);
        cuenta2.depositarDinero(550);

        System.out.println(cuenta1);
        System.out.println(cuenta2);
        System.out.println("EL saldo actual es: "+cuenta1.getSaldo()+" euros");
        System.out.println("EL saldo actual es: "+cuenta2.getSaldo()+" euros");
        
        System.out.println("");

        //metodo que retira dinero

        cuenta1.retirarDinero(330);
        cuenta2.retirarDinero(670);
        System.out.println(cuenta1);
        System.out.println(cuenta2);
        System.out.println("EL saldo actual es: "+cuenta1.getSaldo()+" euros");
        System.out.println("EL saldo actual es: "+cuenta2.getSaldo()+" euros");

    }
    
}
