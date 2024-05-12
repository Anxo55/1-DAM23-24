//package ModeloB22-23;

import java.util.Scanner;

public class Ejercicio1B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la edad
        System.out.print("Ingrese la edad del miembro: ");
        int edad = scanner.nextInt();

        // Solicitar si los padres son socios
        System.out.print("¿Los padres son socios? (true/false): ");
        boolean padresSocios = scanner.nextBoolean();

        // Calcular la cuota final
        double cuotaNormal = 800.0;
        double descuento = 0.0;

        if (edad > 65) {
            descuento = 0.4; // 40% de descuento para mayores de 65 años
        } else if (edad < 21) {
            if (!padresSocios) {
                descuento = 0.25; // 25% de descuento para menores de 21 sin padres socios
            } else {
                descuento = 0.45; // 45% de descuento para menores de 21 con padres socios
            }
        }

        double cuotaFinal = cuotaNormal * (1 - descuento);

        // Mostrar el resultado
        System.out.println("Cuota final a pagar: " + cuotaFinal + " euros");

        scanner.close();
    }
    
    }
    

