public class CuentaCorriente {

    public static void main(String[] args) {
        
        Ejercicio3B cuenta1 = new Ejercicio3B();
        Ejercicio3B cuenta2 = new Ejercicio3B(1000, "Pepe");
        Ejercicio3B cuenta3 = new Ejercicio3B(500, "Angel");

        System.out.println(cuenta1);
        cuenta1.deposito(200);
        cuenta1.retiro(50);

        System.out.println();

        System.out.println(cuenta2);
        cuenta2.retiro(1200);

        System.out.println();

        System.out.println(cuenta3);
        cuenta3.deposito(300);

        System.out.println();

        System.out.println("Total de cuentas creadas: " + Ejercicio3B.getContadorCuentas());

    }
    
}
