package cuatro.ejemplos;

import uno.rectangulo;

public class LibroRectanguloTest {

    public static void main(String[] args) {

        Rectangulo r1 = new Rectangulo(5, 7, "");
        Rectangulo r2 = r1.Clone();
        Rectangulo poli = new Rectangulo(1, 2, "poli");
        System.out.println(poli);
        // asignacion
        poli = r1;
        System.out.println(poli);
        r2.incrementaAlto();
        r2.incrementaAncho();
        r1.setNombre("chiquito");
        r2.setNombre("Grande");
        System.out.println("Alto: "+r1.getAlto());
        System.out.println("Ancho: "+r1.getAncho());
        System.out.println("Alto: "+r2.getAlto());
        System.out.println("Ancho: "+r2.getAncho());
        System.out.println("Nombre: "+r1.getNombre());
        System.out.println("Nombre: "+r2.getNombre());

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r1.equals(r2));
        System.out.println(r1==r2);
        System.out.println(r1.equals(poli));
        System.out.println(r1==poli);
        
    }
    
}
