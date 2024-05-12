package POO2;

public class testPersona {

    public static void main(String[] args) {
        
        Persona persona1 = new Persona();
        Persona persona2 = new Persona("Angel", 19, "Hombre");

        System.out.println(persona1.toString());
        System.out.println(persona2.toString());

    }
    
}
