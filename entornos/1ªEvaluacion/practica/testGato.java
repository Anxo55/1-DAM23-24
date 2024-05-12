public class testGato {

    public static void main(String[] args) {
        
        Gato pepe = new Gato('a', "pepe");
        Gato angel = new Gato('b', "angel");
        Gato antonio = new Gato('c', "antonio");
        Gato miguel = new Gato('d', "miguel");
        Gato pedro = new Gato('e', "pedro");

        System.out.println(pepe.toString());
        System.out.println(angel.toString());
        System.out.println(antonio.toString());
        System.out.println(miguel.toString());
        System.out.println(pedro.toString());

    }
    
}
