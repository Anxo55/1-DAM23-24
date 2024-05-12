package repasosExamen;

public class CuentaCorriente {

    public static void main(String[] args) {

        Ejercicio4A cuenta1 = new Ejercicio4A();
        Ejercicio4A cuenta2 = new Ejercicio4A(3000, "Angel", 987654321);
        Ejercicio4A cuenta3 = new Ejercicio4A(1250, "Miguel", 666777666);

        System.out.println(cuenta1.toString());
        System.out.println(cuenta2.toString());
        System.out.println(cuenta3.toString());

        System.out.println();

        cuenta1.depositoDinero(1000);
        System.out.println(cuenta1.toString());

        System.out.println("");

        cuenta2.retiroDinero(1000);
        System.out.println(cuenta2.toString());

        cuenta3.retiroDinero(250);
        System.out.println(cuenta3.toString());
        
    }
    
}
