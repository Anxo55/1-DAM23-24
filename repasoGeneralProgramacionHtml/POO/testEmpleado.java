package POO;

public class testEmpleado {

    public static void main(String[] args) {

        Empleado empleado1 = new Empleado();
        Empleado empleado2 = new Empleado("Marta", 3000, "Correduria");

        System.out.println(empleado1.toString());
        System.out.println(empleado2.toString());

        System.out.println("");

        //metodo aumento de sueldo

        empleado1.aumentoSueldo(1000);
        empleado2.aumentoSueldo(3000);

        System.out.println(empleado1);
        System.out.println(empleado2);
        
    }
    
}
