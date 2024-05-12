//package ExamenAnxoCampos23-24.examen;

// Programar un algoritmo recursivo que permita invertir un número. Ejemplo: Entrada: 1234 Salida: 4321


public class Ejercicio1B {

    public static int invertir(int num) {
        if (num < 10) {
            return num;
        } else {
            return Integer.parseInt(String.valueOf(num % 10) + String.valueOf(invertir(num / 10)));
        }
    }

    public static void main(String[] args) {
        int numero = 1234;
        System.out.println(numero);
        int numeroInvertido = invertir(numero);
        System.out.println(numeroInvertido);
    }
}
