package Propuesto1;

// Creame una coleccion de libros consistente en: 
// 1 libro normal
// 2 libros de texto
// 2 libros de colombia
// 3 novelas
// Todos los libros tendran un precio aleatorio entre 0 y 10 euros
// Calcula el precio total de venta, incluyendo un descuento

import java.util.Scanner;

import Propuesto1.Novelas.TipoNovela;

public class testLibro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1 libro
        Libro libro = new Libro(null, null, 0);

        // 2 de texto
        LibrosDeTexto librosDeTexto = new LibrosDeTexto("Pepe botella", "Angelito gonzalez", 19, "Primero DAM");
        LibrosDeTexto librosDeTexto2 = new LibrosDeTexto("Don quijote", "Miguel Angel", "Segundo DAM");

        // 2 de UNC
        LibrosDeTextoUNC librosDeTextoUNC = new LibrosDeTextoUNC("Mr Tartaria", "Mickey mouse", 20, "ADE", "Programacion");
        LibrosDeTextoUNC librosDeTextoUNC2 = new LibrosDeTextoUNC("Barrio de teis", "Sio Navajas", "2ºBach", "Entornos");

        // 3 de novela
        Novelas novelas = new Novelas("La novela de sistemas", "Pedro", 20, TipoNovela.HISTORICA);
        Novelas novelas2 = new Novelas("El amor de la vida", "Angel", 10, TipoNovela.REALISTA);
        Novelas novelas3 = new Novelas("La vida es bella", "Pepe Dominguez", TipoNovela.ROMANTICA);

        System.out.println(libro.toString());
        System.out.println(librosDeTexto.toString());
        System.out.println(librosDeTexto2.toString());
        System.out.println(librosDeTextoUNC.toString());
        System.out.println(librosDeTextoUNC2.toString());
        System.out.println(novelas.toString());
        System.out.println(novelas2.toString());
        System.out.println(novelas3.toString());

    }
    
}
