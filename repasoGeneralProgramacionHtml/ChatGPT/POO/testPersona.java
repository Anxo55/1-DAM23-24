package ChatGPT.POO;

public class testPersona {

    public static void main(String[] args) {
        
        Persona pepe = new Persona();
        Persona Antonio = new Persona("Antonio", 30);

        System.out.println(pepe.toString());
        System.out.println(Antonio.toString());

        System.out.println("");

        pepe.saludar();
        Antonio.saludar();

    }
    
}
