package tres.ejemplos;

public class ejemplo8 {

    public static void main(String[] args) {
        
        int i=0;
        bucleext :
        while (i <100) {
        i++ ;

        for (int j=0; j<i; j++) {
            //el syso es el del simnolo que se movió al de abajo.
                if (i==5){
                    break bucleext;
                }
            //cambio del syso de sitio
            System.out.print("*");
        }

        System.out.println("");

        }

    }
    
}
