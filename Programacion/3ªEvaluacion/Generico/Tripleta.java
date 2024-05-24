package Generico;

public class Tripleta<I,P,S> {

    private final I i;
    private final P p;
    private final S s;

    public Tripleta(I valor1, P valor2, S valor3) {
        i = valor1;
        p=valor2;
        s = valor3;
    }

    @Override
    public String toString() {
        return "Tripleta [i=" + i + ", p=" + p + ", s=" + s + "]";
        // se puede hacer con String.format
    }

    public static void main(String[] args) {
        
        Tripleta<Integer, String, String> tripleta = new Tripleta<Integer,String,String>(1, "Calculo", "Computo que se hace algo por medio de operaciones matematicas");
        System.out.println(tripleta);
        Tripleta<String, String, String> tripleta2 = new Tripleta<String,String,String>("Real Madrid", "Barcelona", "3-3");
        System.out.println(tripleta2);
        Tripleta<String, String, Integer> tripleta3 = new Tripleta<String,String,Integer>("Temperatura", "Grados Centigrados", 18);
       System.out.println(tripleta3);


    }
    
}
