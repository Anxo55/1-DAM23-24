package Ejercicio4B;

public class testCliclistas {

    public static void main(String[] args) {
        Equipo[] equipos = new Equipo[3];

        
        equipos[0] = new Equipo("Barcelona", "Cataluña");
        equipos[0].añadirCiclista(new Contrarrelojista(1, "Messi", 30.0));
        equipos[0].añadirCiclista(new Escalador(2, "Suarez", 2.5, 5.0));
        equipos[0].añadirCiclista(new Velocista(3, "Neymar", 250, 40.0));
        
        equipos[1] = new Equipo("Madrid", "Madrid City");
        equipos[1].añadirCiclista(new Contrarrelojista(4, "Cristiano", 28.0));
        equipos[1].añadirCiclista(new Escalador(5, "Benzema", 3.0, 6.0));
        equipos[1].añadirCiclista(new Velocista(6, "Bale", 300, 38.0));

        equipos[2] = new Equipo("Celta de Vigo", "Vigo City");
        equipos[2].añadirCiclista(new Contrarrelojista(7, "Nolito", 32.0));
        equipos[2].añadirCiclista(new Escalador(8, "Iago Aspas", 2.8, 5.5));
        equipos[2].añadirCiclista(new Velocista(9, "Mostovoi", 280, 42.0));



     
        for (int etapa = 1; etapa <= 3; etapa++) {
            System.out.println("Etapa " + etapa);

    
            for (Equipo equipo : equipos) {
                equipo.calcularTiempoParcialEquipo();
            }

            System.out.println("\nClasificación por Equipos:");
            for (Equipo equipo : equipos) {
                equipo.calcularTotalTiempo();
                equipo.imprimir();
            }

        
            System.out.println("\nClasificación Individual:");
            for (Equipo equipo : equipos) {
                for (Ciclista ciclista : equipo.listaCiclistas) {
                    ciclista.imprimir();
                }
            }
        }
    }
}