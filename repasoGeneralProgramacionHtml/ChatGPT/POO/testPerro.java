package ChatGPT.POO;

public class testPerro {

    public static void main(String[] args) {
        
        Perro coco = new Perro();
        Perro covi = new Perro("Covi", "Pitbull", 2);
        Perro chester = new Perro("Ratonero", 1);

        System.out.println(coco.toString());
        System.out.println(covi.toString());
        System.out.println(chester.toString());
        
        //Cuando cogemos los metodos set de la clase original, podemos cambiar el parametro,
        // que pusimos en un principio para el objeto y ponerle uno
        chester.setRaza("Dalmata");
        chester.setEdad(6);
        System.out.println(chester);

    }
    
}
