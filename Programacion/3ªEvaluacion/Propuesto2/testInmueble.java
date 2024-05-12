package Propuesto2;

import java.util.ArrayList;

public class testInmueble {

    public static int generaArea() {
        return (int) (30 + Math.random() * 120);
    }
    
    public static void main(String[] args) {
        ArrayList<Inmueble> terrenos= new ArrayList<Inmueble>();
 
        CasasRurales casasRurales = new CasasRurales(0, 0, null, 0, 0, 0, 0, 0);
        CasasConjuntoCerrado casasConjuntoCerrado = new CasasConjuntoCerrado(0, 0, null, 0, 0, 0, 0, false, false);
        CasaIndependiente casaIndependiente = new CasaIndependiente(0, 0, null, 0, 0, 0);
        ApartaEstudio apartaEstudio = new ApartaEstudio(0, 0, null, 0, 0);
        ApartaFamiliares apartaFamiliares = new ApartaFamiliares(0, 0, null, 0, 0, 0);
        LocalComercial localComercial = new LocalComercial(0, 0, null, null, null);
        Oficinas oficinas = new Oficinas(0, 0, null, null, false);

        terrenos.add(casasRurales);
        terrenos.add(casasConjuntoCerrado);
        terrenos.add(casaIndependiente);
        terrenos.add(apartaEstudio);
        terrenos.add(apartaFamiliares);
        terrenos.add(localComercial);
        terrenos.add(oficinas);

        for(Inmueble inmueble2: terrenos) {
            System.out.println(inmueble2.toString());
        }

    }
}