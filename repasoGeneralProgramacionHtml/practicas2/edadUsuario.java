package practicas2;

import java.util.Scanner;

// Crea un programa que pida al usuario su edad y 
// luego determine si es un niño, adolescente, adulto o adulto mayor 
// usando estructuras if y else if.

public class edadUsuario {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int edad1, edad2, edad3;

        System.out.println("Dame la edad de la primera persona: ");
        edad1 = sc.nextInt();

        System.out.println("Dame la edad de la segunda persona: ");
        edad2 = sc.nextInt();

        System.out.println("Dame la edad de la tercera persona: ");
        edad3 = sc.nextInt();

        System.out.println("");

        if (edad1 >=10 && edad1 <=12) {
            System.out.println("La persona es un chico/a joven");
        } else if(edad1 >= 13 && edad1 <=17){
            System.out.println("Es un chico/a adolescente");
        }else if(edad1 ==18) {
            System.out.println("La persona ya es mayor de edad");
        }else if(edad1>=19 && edad1 <= 30) {
            System.out.println("Es una persona adulta");
        }else if(edad1 >= 31 && edad1 <= 65) {
            System.out.println("Es una persona mayor");
        }

        if (edad2 >=10 && edad2 <=12) {
            System.out.println("La persona es un chico/a joven");
        } else if(edad2 >= 13 && edad2 <=17){
            System.out.println("Es un chico/a adolescente");
        }else if(edad2 ==18) {
            System.out.println("La persona ya es mayor de edad");
        }else if(edad2>=19 && edad2 <= 30) {
            System.out.println("Es una persona adulta");
        }else if(edad2 >= 31 && edad2 <= 65) {
            System.out.println("Es una persona mayor");
        }

        if (edad3 >=10 && edad3 <=12) {
            System.out.println("La persona es un chico/a joven");
        } else if(edad3 >= 13 && edad3 <=17){
            System.out.println("Es un chico/a adolescente");
        }else if(edad3 ==18) {
            System.out.println("La persona ya es mayor de edad");
        }else if(edad3>=19 && edad3 <= 30) {
            System.out.println("Es una persona adulta");
        }else if(edad3 >= 31 && edad3 <= 65) {
            System.out.println("Es una persona mayor");
        }
        
    }
    
}
