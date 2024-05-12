package dos.propuestos;

// 11. (Ejercicio de dificultad alta) El restaurante mejicano de Israel cuya especialidad son las papas con chocos nos pide 
// diseñar un método con el que se pueda saber cuántos clientes pueden atender con la materia prima que tienen en el 
// almacén. El método recibe la cantidad de papas y chocos en kilos y devuelve el número de clientes que puede atender 
// el restaurante teniendo en cuenta que por cada tres personas, Israel utiliza un kilo de papas y medio de chocos

import java.util.Scanner;

public class Restaurante {

    public static int getComensales(double patatas, double chocos) {
        int comensales = 0;

        //sobran patatas, FALTAN chocos
        if (patatas >= chocos*2) {
            comensales =  3 * (int) (chocos / 0.5);
        } 
        //SOBRAN CHOCOS, FALTAN patatas
        else {
            comensales = 3* (int) (patatas / 1);
        }

        return comensales;
    }

    public static void main(String[] args) {
        double patatas, chocos;
        Scanner sc = new Scanner(System.in);
        System.out.println("Patatas(KG): ");
        patatas = sc.nextDouble();
        System.out.println("Chocos (KG): ");
        chocos = sc.nextDouble();
        System.out.println("Numero comensales: "+getComensales(patatas, chocos));
    }
    
}
