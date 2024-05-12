package segundo.ejemplo3_2;

public class Reto2 {

    public static void main(String[] args) {

        String[] cadena = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};

        for(int i = 0; i<cadena.length; i++) {
            System.out.println(cadena[i]);
            System.out.println("Numero de letras: "+cadena[i].length());
        }
        
    }
    
}
