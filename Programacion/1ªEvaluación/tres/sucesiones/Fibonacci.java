package tres.sucesiones;

public class Fibonacci {

    // 0  +  1 -----> 1
    // 1  +  1 -----> 2
    // 1  +  2 -----> 3
    // 2  +  2 -----> 4
    // 2  +  3 -----> 5

    public static void main(String[] args) {

        int tcero = 0;
        int tuno = 1;
        int aux = 0;

        System.out.println("fib0: "+tcero);
        System.out.println("fib1: "+tuno);

        for(int i=0; i<10; i++) {
            aux = tcero + tuno;
            System.out.println("fib "+(i+2) +": "+aux);
            tcero = tuno;
            tuno=aux;
        }
        
    }
    
}
