package repasosExamen;

import java.util.Scanner;

public class tipoTarjeta {

    public static double TipoTarjeta(double salarioInicial, boolean tarjetaOro, boolean tarjetaPlata, boolean tarjetaBronce, boolean tipoStar) {

        if (tarjetaOro) {
            salarioInicial*=0.80;
        }

        if (tarjetaPlata) {
            salarioInicial*=0.90;
        }

        if (tarjetaBronce) {
            salarioInicial*=0.95;
        }

        if (tipoStar) {
            salarioInicial*=0.95;
        }

        return salarioInicial;

    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame el salario inicial: ");
        double salarioInicial = sc.nextDouble();

        System.out.println("Tarjeta oro? true/false: ");
        boolean tarjetaOro = sc.nextBoolean();

        System.out.println("Tarjeta plata? true/false: ");
        boolean tarjetaPlata = sc.nextBoolean();

        System.out.println("Tarjeta bronce? true/false: ");
        boolean tarjetaBronce = sc.nextBoolean();

        System.out.println("Tipo star? true/false");
        boolean tipoStar = sc.nextBoolean();

        double salarioFinal = TipoTarjeta(salarioInicial, tarjetaOro, tarjetaPlata, tarjetaBronce, tipoStar);

        System.out.println("El salario final con los descuentos es: "+salarioFinal);
        
    }
    
}
