package TiendaMascotas;

import java.util.ArrayList;

import TiendaMascotas.GatosPeloLargo.tipoGato;
import TiendaMascotas.GatosPeloCorto.tipoGato2;
import TiendaMascotas.GatosSinPelo.tipoGato3;
import TiendaMascotas.PerrosGrandes.razas;
import TiendaMascotas.PerrosMedianos.razas2;
import TiendaMascotas.PerrosPequeños.razas3;

public class testTiendaMascotas {

    public static void main(String[] args) {

        ArrayList<Mascota> tiendaMascotas = new ArrayList<Mascota>();

        PerrosGrandes perrosGrandes = new PerrosGrandes("Covi", 3, "gris", 60, true, razas.DOBERMAN);
        PerrosGrandes perrosGrandes2 = new PerrosGrandes("Tinki", 10, "negro", 40, false, razas.ROTWEILLER);
        PerrosMedianos perrosMedianos = new PerrosMedianos("Pepe", 4, "blanco", 20, false, razas2.COLLIE);
        PerrosPequeños perrosPequeños = new PerrosPequeños("Leo", 10, "marron", 20, false, razas3.SCHNAUZER);
        PerrosPequeños perrosPequeños2 = new PerrosPequeños("Milo", 6, "negro", 30, true, razas3.YORKSHIRE_TERRIER);
        PerrosPequeños perrosPequeños3 = new PerrosPequeños("pequeño", 2, "negro", 30, false, razas3.CANICHE);
        GatosPeloLargo gatosPeloLargo = new GatosPeloLargo("Stitch", 3, "naranja", 10, 40, tipoGato.ANGORA);
        GatosPeloLargo gatosPeloLargo2 = new GatosPeloLargo("Ronro",6, "gris", 10, 30, tipoGato.BALINES);
        GatosPeloCorto gatosPeloCorto = new GatosPeloCorto("Esfinge", 10, "negro", 15, 25, tipoGato2.BRITA_NICO);
        GatosPeloCorto gatosPeloCorto2 = new GatosPeloCorto("Corto", 11, "blanco", 20, 50, tipoGato2.AZUL_RUSO);
        GatosPeloCorto gatosPeloCorto3 = new GatosPeloCorto("Cortito", 5, "negro y blanco", 10, 35, tipoGato2.DEVON_REX);
        GatosSinPelo gatosSinPelo = new GatosSinPelo("Melon", 2, "naranja", 10, 20, tipoGato3.ESFINGE);

        tiendaMascotas.add(perrosGrandes);
        tiendaMascotas.add(perrosGrandes2);
        tiendaMascotas.add(perrosMedianos);
        tiendaMascotas.add(perrosPequeños);
        tiendaMascotas.add(perrosPequeños2);
        tiendaMascotas.add(perrosPequeños3);
        tiendaMascotas.add(gatosPeloLargo);
        tiendaMascotas.add(gatosPeloLargo2);
        tiendaMascotas.add(gatosPeloCorto);
        tiendaMascotas.add(gatosPeloCorto2);
        tiendaMascotas.add(gatosPeloCorto3);
        tiendaMascotas.add(gatosSinPelo);

        int cuantiaTotal = 0;
        for (Mascota mascota : tiendaMascotas) {

            cuantiaTotal += mascota.pagoImpuestosMunicipales();

            // if(mascota instanceof Gatos) //casteo una mascota a un tipo inferior
            //     // en jerarquia, un gato DOWN CASTING 
            //     System.out.println(((Gatos) mascota).maullar());
            // if(mascota instanceof Perros)
            //     System.out.println(((Perros) mascota).ladrar());

            if(mascota instanceof Gatos) //casteo una mascota a un tipo inferior
                // en jerarquia, un gato DOWN CASTING 
               System.out.println(Gatos.maullar());
            if(mascota instanceof Perros)
                System.out.println(Perros.ladrar());
                
            System.out.println(mascota.toString());
            System.out.println("\nEl precio de cada animal: " + mascota.pagoImpuestosMunicipales());
        }
        System.out.println("Total impuesto: "+cuantiaTotal);
    }
    
}
