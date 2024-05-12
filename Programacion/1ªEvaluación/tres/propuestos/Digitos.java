package tres.propuestos;

import java.util.Scanner;

public class Digitos {

    //metodo repetitivo
    public static int sumaDigitos(int num) {
        int total=0;
        int digitos = cuentaDigitos(num);
        int cifra=0;

        while (digitos > 0) {
            cifra=(int) (num / Math.pow(10, digitos-1) % 10);
            System.out.println("cifra: "+cifra);
            total+=num / Math.pow(10, digitos-1) % 10;
            System.out.println(total);
            num-= cifra*Math.pow(10, digitos-1);
            System.out.println(num);
            digitos--;
        }
        return total;

    }

    public static int invierteNumero(int numero) {
        int invertido = 0;
        while (numero > 0) {
            int digito = numero % 10;
            invertido = invertido * 10 + digito;
            numero /= 10;
        }
        return invertido;
    }

    //Cuenta digitos iterativo
    public static int cuentaDigitos(int numero) {
        int aux=0;//auxiliar
        // System.out.println(numero);

        if (numero == 0) {
            return 1;
        }else{

        }

        while (numero>0) {
            numero/=10;
            // System.out.println(numero);
            aux++;
            // System.out.println("aux: "+aux);
        }
        return aux;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un numero: ");
        int numero = sc.nextInt();
        int resultadoDigitos = cuentaDigitos(numero);        
        System.out.println("Tiene digitos: "+resultadoDigitos);
        System.out.println("--------------------");

        int total = sumaDigitos(numero);
        System.out.println("Suma digitos: "+total);
        System.out.println("-----------------------");

        int numero1;
        System.out.println("Dame un numero para invertir: ");
        numero1 = sc.nextInt();
        int invertido = invierteNumero(numero1);
        System.out.println("El número " + numero1 + " invertido es " + invertido);
    }
    
}
