package tres.ejemplos;

public class ejemplo11bis {

    public static void main(String[] args) {

        int i = 1;
        while (i <= 10) {
            System.out.print("Tabla del " + i + ": ");
            int j = 1;
            while (j <= 10) {
                System.out.print(i * j + " ");
                j++;//inicializar de nuevo contador del bucle interno
            }
            System.out.println();
            i++;
        }
    }
        
    }
    

