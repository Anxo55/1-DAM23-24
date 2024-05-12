package segundo.Mapas;

import java.util.HashMap;
import java.util.Scanner;


// Implementa el control de acceso al area resttringida de un programa. Se debe
// pedir un nombre de usuaruo y su contraseña. Si el usuario introduce los
// datos correctamente, el programa dirá "Ha accedido al área restringida". El
// usuario tendra un maximo de 3 oportunidades. Si se agotan las oportunidades
// el programa dira "Lo siento, no tienen acceso al area restringida". Los nombre 
// de usuario con sus correspondientes contraseñas deben estar almacenadas
// en una estructura de la calse HashMap.

public class Ejercicio6 {

    public static HashMap<String, String> tabla = new HashMap<String, String>();

    public static void poblarMapa() {
        tabla.put("manolo", "1234");
        tabla.put("diany", "789");
        tabla.put("javi", "3333");
        tabla.put("nicolo", "666");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        poblarMapa();
        for(java.util.Map.Entry<String, String> pos: tabla.entrySet()) {
            System.out.println("user: " + pos.getKey()+"  ");
            System.out.println("pass: "+pos.getValue());
        }

        String user = "";
        String pass = "";

        boolean mekedo = true;
        int veces = 0;
        do {

        // Pedimos todo junto
        System.out.println("user: ");
        user = sc.nextLine();

        System.out.println("pass: ");
        pass = sc.nextLine();
        veces++;
            
        // Logica de control de acceso
        if(tabla.containsKey(user)){
            String us = tabla.get(user);
            if(pass.equals(us)) {
                // usuario y pass
                System.out.println("Bienvenido "+user);
                mekedo = false;
            }else{
                // usuario sin pass
                System.out.println("Contraseña incorrecta");
                System.out.println("Numero de intentos restantes: "+ (3-veces));
            }
        }else{
            System.out.println("Usuario no existente");
            System.out.println("Numero de intentos restantes: "+ (3-veces));
            // no usuario
        }

    } while (mekedo && veces<3);

    if((veces==3) && (mekedo=false)) {
        System.out.println("sin intentos");
    }else{
        System.out.println("adios "+ user);
    }
        
    }
    
}
