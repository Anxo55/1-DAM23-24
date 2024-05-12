package Java.Vehiculo;

import java.util.ArrayList;

import Java.Vehiculo.Bicicleta.tipoBicicleta;

public class testVehiculo {

    public static void main(String[] args) {

        ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

        Vehiculo vehiculo = new Vehiculo("Honda", 2004);
        Automovil automovil = new Automovil("Mercedes", 2016, "Clase C", 3);
        Motocicleta motocicleta = new Motocicleta("BMW", 2018, 200);
        Bicicleta bicicleta = new Bicicleta("Audi", 2010, tipoBicicleta.CIUDAD);

        vehiculos.add(vehiculo);
        vehiculos.add(automovil);
        vehiculos.add(motocicleta);
        vehiculos.add(bicicleta);

        for (Vehiculo vehiculo2 : vehiculos) {

            System.out.println(vehiculo2);
            
        }

        
    }
    
}
