package dos.ejemplos;

public class testPajaro {

    public static void main(String[] args) { 

        //declara el nombre de una referencia
        //para manipular, apuntar a un objeto pajaro.
        pajaro p1; 

        //Crea un objeto pajaro con new pajaro
        //y lo asigna a la referencia p

        p1=new pajaro(); 
        p1.setEdad(5); 

        int numero = p1.getEdad();
        
        System.out.println("Este pajaro tiene: "+numero+ " años");

        pajaro p2 = new pajaro('F', 2343, "disecado");
        System.out.println("total de pajaros: " + pajaro.numpajaros);
        pajaro p3 = new pajaro("Pepe");
        pajaro p4 = new pajaro('R', 20);
       

        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());

        //cuando creamos el metodo private static int numpajaros, quitamos el private para poder mostrarlo aqui con (pajaro.numoajaros)
        System.out.println("total de pajaros: " + pajaro.numpajaros);
        

        

        }
   }
    

