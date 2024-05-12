package segundo.DinamicosArraysList;

import java.util.ArrayList;

public class testMoneda {

    public static boolean valido(Moneda m, Moneda ultima) {

        boolean vale = false;
        if(m.getValor().equals(ultima.getValor()));
            vale = true;
        
        if(m.getLado().equals(ultima.getLado()));
            vale = true;

            return vale;
    }
    
    public static void main(String[] args) {

        ArrayList<Moneda> monedero = new ArrayList<Moneda>();

        // Añadimos la primera
        monedero.add(new Moneda());

        System.out.println(monedero.toString());

        do {
            Moneda mon = new Moneda();
            
            if(valido(mon, monedero.get(monedero.size()-1)))
                monedero.add(mon);
            // System.out.println(mon);

        } while (monedero.size()<6);

        System.out.println("Coleccion de 6 monedas eurocoin");
        for(Moneda m: monedero) {
            System.out.println(m.toString());
        }

        // System.out.println(monedero);
        
    }
}
