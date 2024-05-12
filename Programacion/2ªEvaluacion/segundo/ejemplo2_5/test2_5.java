package segundo.ejemplo2_5;

import java.util.ArrayList;

import segundo.ejemplo2_5.Cuenta.tipo;

public class test2_5 {

    public static void main(String[] args) {

        Cuenta cuenta1 = new Cuenta("Pedro", "Perez", 123456789, tipo.AHORROS);
        Cuenta cuetna2 = new Cuenta("Pablo", "Pinzon", 44556677, tipo.AHORROS);

        System.out.println(cuetna2.toString());
        System.out.println(cuenta1.equals(cuetna2));


        ArrayList<Cuenta> finanzas = new ArrayList<Cuenta>();
        finanzas.add(cuenta1);
        finanzas.add(cuetna2);
        finanzas.add(new Cuenta("maik", "norris", 123, tipo.AHORROS));

        float total = 0f;
        for(Cuenta c: finanzas) {
            System.out.println(c);
            // total+=c.getSaldo;
        }

        System.out.println("total: "+total);
        
    }
    
}
