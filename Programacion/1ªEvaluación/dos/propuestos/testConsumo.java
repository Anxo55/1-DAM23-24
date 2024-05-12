package dos.propuestos;

public class testConsumo {

    public static void main(String[] args) {

        // Consumo consumo1 = new Consumo();
        Consumo consumo1 = new Consumo(317, 23, 60, 1.87);
        System.out.println(consumo1);
        System.out.println(consumo1.getTiempo());
        System.out.println(consumo1.consumoMedio());
        System.out.println(consumo1.consumoEuros());
        
    }
    
}
