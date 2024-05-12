package POO;

public class testPersona {

    public static void main(String[] args) {

        Persona persona1 = new Persona();
        Persona persona2 = new Persona("Marta", 51, "Pizarro");

        System.out.println(persona1.toString());
        System.out.println(persona2.toString());

        persona1.setEdad(20);
        persona1.setNombre("Campos");
        persona1.setDireccion("Urzaiz");
        System.out.println(persona1.toString());
        
    }
    
}
