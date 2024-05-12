package segundo.ejemplo2_1;

import segundo.ejemplo2_1.Persona.genero;

public class testPersona {

    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Pepe", "Dominguez", "111222333A", 1990, "España", genero.H);
        Persona persona2 = new Persona("Angel", "Gonzalez", "999888777L", 1999, "Malta", genero.H);

        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
            
    }
    
}
