package dos.propuestos;

// 12. Modifica el programa anterior creando una clase que permita almacenar los kilos de papas y chocos del 
// restaurante. Implementa los siguientes métodos:

// public void addChocos(int x). Añade x kilos de chocos a los ya existentes.
// public void addPapas(int x). Añade x kilos de papas a los ya existentes.
// public int getComensales(). Devuelve el número de clientes que puede atender el restaurante (este es el 
// método anterior).

// public void showChocos(). Muestra por pantalla los kilos de chocos que hay en el almacén. 
// public void showPapas(). Añade Muestra por pantalla los kilos de papas que hay en el almacén.

public class Almacen {

    //atributos
    double patatas;
    double chocos;

    Almacen() {
        this.patatas = 0;
        this.chocos = 0;
    }

    Almacen(double patatas, double chocos) {
        this.patatas = patatas;
        this.chocos = chocos;
        
    }

    public double getPatatas() {
        return patatas;
    }

    public void setPatatas(double patatas) {
        this.patatas = patatas;
    }

    public double getChocos() {
        return chocos;
    }

    public void setChocos(double chocos) {
        this.chocos = chocos;
    }

    @Override
    public String toString() {
        return "Almacen [patatas=" + patatas + ", chocos=" + chocos + "]";
    }

    //cuando creo un metodo almacen no puede ser statico al recorrer cuantos comensales entran diariamente
    public int getComensales() {
        int comensales = 0;

        //sobran patatas, FALTAN chocos
        if (patatas >= chocos*2) {
            comensales = 3 * (int) (chocos / 0.5);
            //como actualizo el almacen
            patatas -= (comensales / 3);
            chocos -= patatas / 2;//(comensales / 3) /2

        } 
        //SOBRAN CHOCOS, FALTAN patatas
        else {
            comensales = 3 * (int) (patatas / 1);
            //ponme al dia las patatas y los chocos
            patatas -=comensales / 3;
            chocos -= patatas / 2;//(comensales / 3) /2
        }
        return comensales;
    }

    /*

        public void addChocos(int x). Añade x kilos de chocos a los ya existentes.
        public void addPapas(int x). Añade x kilos de papas a los ya existentes.
        public int getComensales(). Devuelve el número de clientes que puede atender el restaurante (este es el 
        método anterior).

        public void showChocos(). Muestra por pantalla los kilos de chocos que hay en el almacén. 
        public void showPapas(). Añade Muestra por pantalla los kilos de papas que hay en el almacén.
    */

    public void addChocos(double masChcocos) {
        this.chocos += masChcocos;
    }

    public void addPapas(double masPapas) {
        this.patatas += masPapas;
    }

    public void irMercado(double chocos, double papas) {
        addPapas(papas);
        addChocos(chocos);

    }


    public static void main(String[] args) {

        System.out.println("Restaurante Israel");
        Almacen almacen1 = new Almacen(1, 0.5);
        System.out.println(almacen1.toString());
        
        System.out.println("Servicio comidas");
        System.out.println("comensales: "+almacen1.getComensales());
        System.out.println("fin comidas almacen");
        System.out.println(almacen1.toString());

        System.out.println("ir a la compra");
        almacen1.irMercado(10, 6);
        System.out.println("Despues de compra, sutuacion almacen");
        System.out.println(almacen1.toString());
        System.out.println("Mañana mas.");
    }
}
