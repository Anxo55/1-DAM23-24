package Gatito;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        //EJEMPLO
        String mensaje = "Hola, soy el main";
        System.out.println(mensaje);
        
        Gato gato1 = new Gato();
        Gato gato2 = creGatoUsuario();

        aumentarEdad(gato2, 3);
        aumentarEdad(gato2, 3);
        
        System.out.println(gato1);
        System.out.println(gato2);

        pelearGato(gato1, gato2);

    }

    public static void aumentarEdad(Gato miGato, int incremento) {
        miGato.setEdad(miGato.getEdad()+incremento);
    }

    public static Gato creGatoUsuario() {
        Scanner sc = new Scanner(System.in);
        String nombreGato;
        int edadGato;
        System.out.println("Introduce el nombre: ");
        nombreGato = sc.nextLine();
        System.out.println("Introduce edad gato: ");
        edadGato = sc.nextInt();
        Gato gato = new Gato(nombreGato, edadGato);
        return gato;
       
    }
    

    public static void pelearGato(Gato gato1, Gato gato2) {
        
        System.out.println("hola soy el gato "+gato1.getNombre()+ " y me voy a pelear con el gato "+gato2.getNombre());
        
    }
}
