package segundo.ejemplo2_1;

import segundo.ejemplo2_1.Planeta.TipoPlaneta;

public class testPlaneta {
    
 public static void main(String[] args) {
        
        Planeta planeta1 = new Planeta("Marte", 2, 6.4171e23, 1.6318e11, 6779, 227, TipoPlaneta.TERRESTRE, true, 1,2);
        Planeta planeta2 = new Planeta("Júpiter", 79, 1.898e27, 1.43128e15, 139820, 778, TipoPlaneta.GASEOSO, true,3,4);

        
        System.out.println("Datos del Planeta 1:");
        planeta1.imprimirDatosPlaneta();
        System.out.println("\nDensidad: " + planeta1.calcularDensidad() + " kg/km^3");
        System.out.println("Exterior al Sistema Solar: " + planeta1.esExteriorSistemaSolar());

        System.out.println("\nDatos del Planeta 2:");
        planeta2.imprimirDatosPlaneta();
        System.out.println("\nDensidad: " + planeta2.calcularDensidad() + " kg/km^3");
        System.out.println("Exterior al Sistema Solar: " + planeta2.esExteriorSistemaSolar());
    }
}