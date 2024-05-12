package segundo.DinamicosArraysList;

import java.util.ArrayList;

public class Ejemplo2 {

    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(18);
        num.add(22);
        num.add(-30);
        System.out.println("Nº elementos: "+num.size());
        int n=1;
        if(n<num.size()) {
            System.out.println("El elemento que hay en la posicion 1 es "+num.get(1));
        }
        
    }
    
}
