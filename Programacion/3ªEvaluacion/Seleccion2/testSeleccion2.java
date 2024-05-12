package Seleccion2;

import java.util.ArrayList;

public class testSeleccion2 {

    public static void main(String[] args) {

        ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();

        SeleccionFutbol delBosque = new Entrenador(1, "Vicente", "Del bosque", 60, "6542662");
        SeleccionFutbol iniesta = new Futbolista(2, "Andres", "Iniesta", 29, 6, "Interior Derecho");
        SeleccionFutbol raulMartinez = new Masajista(3, "Raul", "Martinez", 41, "Licenciado en Fisioterapia", 18);
    }
    
}
