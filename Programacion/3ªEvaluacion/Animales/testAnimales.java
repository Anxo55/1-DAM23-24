package Animales;

import java.util.ArrayList;

public class testAnimales {

    public static void main(String[] args) {

        ArrayList<Animal> animal = new ArrayList<Animal>();

        animal.add(new Gato());
        animal.add(new Leon());
        animal.add(new Lobo());
        animal.add(new Perro());

        for(int i=0; i<animal.size(); i++) {
            
            System.out.println("Nombre: "+animal.get(i).getNombreCientifico());
            System.out.println("Sonido: "+animal.get(i).getSonido());
            System.out.println("Habitat: "+animal.get(i).getHabitat());
            System.out.println("Alimentos: "+animal.get(i).getAlimentos());
            System.out.println();
        }

        
    }
    
}
