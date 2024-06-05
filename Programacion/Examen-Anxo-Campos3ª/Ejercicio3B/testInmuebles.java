package Ejercicio3B;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
// import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

// import Ejercicio3B.local.tipo;
public class testInmuebles {

    static final String NOMBRE_FICHERO="inmobiliaria_Campos_Carballo.dat";
	
	public static int generaArea() {
        return (int) (30 + Math.random() * 121);
    }

    public static void main(String[] args) {
        ArrayList<Inmuebles> col = new ArrayList<>();
        
        // Crear objetos según la tabla
        col.add(new casaRural(1, generaArea(), "Avenida Madrid", 5, 2, 2, 10, 8));
        col.add(new conjuntoCerrado(2, generaArea(), "rua santiago", 6, 4, 3, 300, true, true));
        col.add(new casaIndependiente(3, generaArea(), "Calle de la Libertad", 4, 3, 2));
        col.add(new apartaEstudio(4, generaArea(), "Calle Falsa 123", 1, 1));
        col.add(new apartamentoFamiliar(5, generaArea(), "Calle Mayor", 3, 2, 200));
        col.add(new LocalComercial(6, generaArea(), "Avenida Venezuela", local.tipo.CALLE, "Camelias"));
        col.add(new Oficina(7, generaArea(), "Avenida Hispanidad", local.tipo.INTERNO, false));

        double totalPrecio = 0d;
        double totalArea = 0d;
        double totalComision = 0d;
        for (Inmuebles inmueble : col) {
            System.out.println(inmueble.toString());
            double precio = inmueble.calcularPrecioVenta();
            System.out.println("Precio de venta: " + precio);
            totalPrecio += precio;
            totalArea += inmueble.getArea();

            if (inmueble instanceof Comision) {
                double comision = ((Comision) inmueble).calcularComision();
                System.out.println("Comisión: " + comision);
                totalComision += comision;
            }
        }
        double promedioValorMetroCuadrado = totalPrecio / totalArea;
        System.out.println("Precio total de los inmuebles vendidos: " + totalPrecio);
        System.out.println("Promedio del valor por metro cuadrado: " + promedioValorMetroCuadrado);
        System.out.println("Total de comisiones obtenidas: " + totalComision);

        
        Guardar(col);
    }
        public static void Guardar(ArrayList<Inmuebles> col) {
            try (
                FileOutputStream fos = new FileOutputStream(NOMBRE_FICHERO);
                ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(col);  
                System.out.println("Guardando el Arraylist de Inmuebles");
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("El archivo no se a podido guardar");
            }
        
    }
        
        
}

    

