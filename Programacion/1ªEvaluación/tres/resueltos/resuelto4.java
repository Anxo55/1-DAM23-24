package tres.resueltos;

// 4. Realiza un método que, dado un número de tres cifras, averigüe si es un número Armstrong. Un número es 
// Armstrong cuando la suma de cada uno de los números que lo componen elevado al número de dígitos de dicho 
// número da como resultado el propio número. Como esta definición es algo compleja, con la siguiente imagen se verá 
// más claro qué es un número Armstrong:

public class resuelto4 {

    public static int potencia(int base, int exponente){
        int res=base;
        for (int i=0;i<exponente-1;i++){
        res = res * base;
        }
        return res;
        }

        public static int armstrong (int numero){
            int cifra1 = numero/100;
            int cifra2 = (numero - 100*cifra1)/10;
            int cifra3 = numero - 100*cifra1 - 10*cifra2;
            int dat = potencia (cifra1, 3) +potencia (cifra2,3) +potencia(cifra3,3) ;
            if (dat == numero) return 1;
            return 0;
        }
        

    public static void main(String[] args) {

        if (armstrong(371)==1) {
            System.out.println("El número 371 es un número Armstrong") ;
            }else{
            System.out.println ("El número 371 No es un número Armstrong");
            }
            if (armstrong(423)==1) {
            System.out.println("El número 423 es un número Armstrong");
            }else{
            System.out.println ("El número 423 No es un número Armstrong");
            }
            }

        
    }
    

