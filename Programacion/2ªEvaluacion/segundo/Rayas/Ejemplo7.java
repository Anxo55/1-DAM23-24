package segundo.Rayas;

public class Ejemplo7 {

    public static void main(String[] args) throws InterruptedException {
        // Se añade esta línea para poder usar sleep(throws interruptedException)

            int fila;
            int columna;
            int[][] n = {{20,4}, {67,33}, {0,7}};

            for(fila = 0; fila < n.length; fila++){

                System.out.println("Fila: " + fila);

                for(columna = 0; columna < n[0].length; columna++) {
                    System.out.println("%10d "+ n[fila][columna]);
                    Thread.sleep(2000); // retardo de un segundo
                }
                System.out.println();
            }

        }
        
    }
    

