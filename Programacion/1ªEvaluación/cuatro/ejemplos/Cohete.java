package cuatro.ejemplos;

public class Cohete {
    
    private static int numCohetes = 0;

    Cohete() {
        numCohetes++;
    }

    public int getNumCohetes() {
        return numCohetes;
    }

    public static void setNumCohetes(int numCohetes) {
        Cohete.numCohetes = numCohetes;
    }

    public static void main(String[] args) {
        Cohete c1 = new Cohete();
        Cohete c2 = new Cohete();
        Cohete c3 = new Cohete();

        System.out.println(c1.getNumCohetes());
        System.out.println(c2.getNumCohetes());
    }
    
}
