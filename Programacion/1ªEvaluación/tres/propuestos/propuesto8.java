package tres.propuestos;

import java.util.Scanner;

// Realiza una clase con un método decimalToRomano que transforme números en formato decimal a números en 
// formato romano.

public class propuesto8 {

    // public static String decimalToRomano() {
    //     String romano;
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Dame un numero para comvertirlo a romano: ");
        numero = sc.nextInt();
        String romano="";
        System.out.println("Convirtiendo a romano: "+numero);

        while (numero>0) {
            while (numero>=1000) {
                romano+="M";
                numero-=1000;
            }
            while (numero>=900) {
                romano+="CM";
                numero-=900;
            }
            while (numero>=500) {
                romano+="D";
                numero-=500;
            }
            while (numero>=400) {
                romano+="CD";
                numero-=400;
            }
            while (numero>=100) {
                romano+="C";
                numero-=100;
            }
            while (numero>=90) {
                romano+="XC";
                numero-=90;
            }
            while (numero>=50) {
                romano+="L";
                numero-=50;
            }
            while (numero>=40) {
                romano+="XL";
                numero-=40;
            }
            while (numero>=10) {
                romano+="X";
                numero-=10;
            }
            while (numero>=19) {
                romano+="IX";
                numero-=9;
            }
            while (numero>=5) {
                romano+="V";
                numero-=5;
            }
            while (numero>=4) {
                romano+="IV";
                numero-=4;
            }
            while (numero>=1) {
                romano+="I";
                numero-=1;
            }
        }
        System.out.println("Convertido el numero es: "+romano);
        
    }
    
}
