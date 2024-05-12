package segundo.ejemplo2_6;

import segundo.ejemplo2_6.Pelicula.tipo;

public class testPelicula {

    public static void main(String[] args) {

        Pelicula pelicula1 = new Pelicula("Gandhinull", "Richard Attenboroughnull", tipo.DRAMA, 191, 1982, 8.10);
        Pelicula pelicula2 = new Pelicula("Thor", "Kenneth Branagh", tipo.ACCION, 115, 2011, 7.0);


        System.out.println(pelicula1.toString());
        System.out.println(pelicula2.toString());

        System.out.println(pelicula1.esPeliculaEpica());
        System.out.println(pelicula2.esPeliculaEpica());

        System.out.println(pelicula1.calcularValoracion());
        System.out.println(pelicula2.calcularValoracion());

        System.out.println(pelicula1.esSimilar(pelicula2));
        
    }
    
}
