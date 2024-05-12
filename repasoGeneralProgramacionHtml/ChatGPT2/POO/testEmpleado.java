package ChatGPT2.POO;

public class testEmpleado {

    public static void main(String[] args) {

        Empleado empleado1 = new Empleado();
        Empleado empleado2 = new Empleado("Marta", 3000, 2012);

        System.out.println(empleado1.toString());
        System.out.println(empleado2.toString());

        System.out.println("");

        double salarioAnual = empleado1.salarioAnual();

        System.out.println("El empleado "+empleado1.getNombre()+ " cobra "+salarioAnual+ " al año");
        
    }
    
}
