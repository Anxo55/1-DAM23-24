package POO4;

public class testContacto {

    public static void main(String[] args) {

        Contacto contacto1 = new Contacto();
        Contacto contacto2 = new Contacto("Angel", 666777888, "angel@cembem.es", "Gonzalez");
        //metodo donde creo un nuevo contacto, el segundo contacto es el nombre de la clase y despues va el metodo
        Contacto contacto3 = Contacto.agregaContacto();

        System.out.println(contacto1.toString());
        System.out.println(contacto2.toString());
        System.out.println(contacto3.toString());

    }
    
}
