package Peaje;

public class testPeaje {

    public static void main(String[] args) {
	
        Peaje p1 = new Peaje("Vigo", "Si");
        
        
        Vehiculo a = new Coche("23232H");
        
        Camion b = new Camion("1213B", 2);
        
        Vehiculo c = new Moto("23242C");
        
        
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
    
        
        p1.añadirVehiculo(a);
        p1.añadirVehiculo(b);
        p1.añadirVehiculo(c);
        
        
        System.out.println(p1.calcularPeaje(b));
    
    }
}
    

