package tres.resueltos;

public class AmstrongAlternativa {

    public static int potencia(int base, int exponente){
        int res=base;
        for (int i=0;i<exponente-1;i++){
        res = res * base;
        }
        return res;
        }
        

        public static boolean armstrong (int numero){

            int cifra1 = numero/1000;
            System.out.println(cifra1);
            int cifra2 = (numero - 1000 * cifra1)/100;
            System.out.println(cifra2);
            int cifra3 = (numero - 1000 * cifra1 - 100*cifra2)/10;
            System.out.println(cifra3);
            int cifra4 =(numero -1000 * cifra1 - 100 * cifra2 -10 * cifra3 )/1;
            System.out.println(cifra4);

            int dat = potencia (cifra1, 4) +potencia (cifra2,4) +potencia(cifra3,4)+potencia(cifra4, 4);
            if (dat == numero)
                return true;
            return false;
        }

    public static void main(String[] args) {

        if (armstrong(1634)) {
            System.out.println("El numero 1634 es amstrong");
        }else{
            System.out.println("El numero 1634 no es Amstrong");
        }

        if (armstrong(4230)) {
            System.out.println("El numero 4230 es Amstrong");
        } else {
            System.out.println("El numero 4230 no es Amstrong");
        }
       
    }
    
}
