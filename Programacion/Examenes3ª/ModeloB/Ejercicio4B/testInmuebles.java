package ModeloB.Ejercicio4B;

import java.util.ArrayList;

public class testInmuebles {
	

	public static void main(String[] args) {
        ArrayList<Inmuebles> inmuebles = new ArrayList<>();
        
        inmuebles.add(new apartaEstudio(1, 50, "Calle 1", 1, 1));
        inmuebles.add(new apartamentoFamiliar(2, 80, "Calle 2", 3, 2, 1000));
        inmuebles.add(new casaIndependiente(3, 100, "Calle 3", 4, 3, 2));
        inmuebles.add(new casaRural(4, 120, "Calle 4", 3, 2, 2, 10, 500));
        inmuebles.add(new conjuntoCerrado(5, 90, "Calle 5", 3, 2, 2, 2000, true, true));
        inmuebles.add(new LocalComercial(6, 70, "Calle 6", local.tipo.CALLE, "Centro Comercial 1"));
        inmuebles.add(new Oficina(7, 60, "Calle 7", local.tipo.INTERNO, true));

        for (Inmuebles inmueble : inmuebles) {
            System.out.println(inmueble.toString());
            if (inmueble instanceof Impuesto) {
                Impuesto inmuebleConImpuesto = (Impuesto) inmueble;
                System.out.println("Precio Venta: " + inmueble.calcularPrecioVenta());
                System.out.println("Impuesto: " + inmuebleConImpuesto.calcularImpuesto());
            }
            System.out.println();
        }
    }
}