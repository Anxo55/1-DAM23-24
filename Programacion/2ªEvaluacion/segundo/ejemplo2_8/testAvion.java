package segundo.ejemplo2_8;

public class testAvion {

    public static void main(String[] args) {

        Avion avion1 = new Avion("Airbus", 4);
        Avion avion2 =  new Avion("Loockeed", 4);

        Avion repe;
        
        System.out.println(avion1.toString());
        System.out.println(avion2.toString());

        avion1.setNombreFabricante("Boeing");
        System.out.println(avion1);

        Avion.cambiarFabricante(avion1);
        System.out.println(avion1);

        //OJOOOOOOOOO!!!!!
        repe = avion2;
        System.out.println(avion2);
        System.out.println(repe);

    }
    
}
