package segundo.ejemplo3_1;

public class testAtleta {

    public static void main(String[] args) {

        String[] nomes = {"Pepe", "Angel", "Antonio", "Pedro"};

        Atleta[] team = new Atleta[4];

        for(int i=0; i<nomes.length; i++) {
            team[i] = new Atleta(nomes[i]);
            System.out.println(team[i]);
        }

        Atleta.calculaTiempo(team);
        Atleta.imprimeDatos();
        
    }
    
}
