package uno;

public class resuelto1 {

 public static char getLetras(){
    return (char) ( 'a' + Math.random()*26  );
   //  a es -->97
   //  z es -->122
 }

 public static void main(String[] args) {

      //  char prueba = getLetras();
      //  System.out.println("el caracter aleatorio es: "+prueba);

  
      // char prueba = getLetras();
      // System.out.println("el caracter aleatorio es: "+prueba);
   
      for(int i=1; i<=100; i++) {
      System.out.println("resultado: "+getLetras());
    }
}

}