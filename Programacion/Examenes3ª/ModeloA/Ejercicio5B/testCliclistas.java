package ModeloA.Ejercicio5B;

public class testCliclistas {

    public static void main(String[] args) {
        Equipo[] equipos = new Equipo[4];

        // Creación de los equipos y ciclistas
        equipos[0] = new Equipo("Equipo A", "País A");
        equipos[0].añadirCiclista(new Contrarrelojista(1, "Ciclista A1", 30.0));
        equipos[0].añadirCiclista(new Escalador(2, "Ciclista A2", 2.5, 5.0));
        equipos[0].añadirCiclista(new Velocista(3, "Ciclista A3", 250, 40.0));

        equipos[1] = new Equipo("Equipo B", "País B");
        equipos[1].añadirCiclista(new Contrarrelojista(4, "Ciclista B1", 28.0));
        equipos[1].añadirCiclista(new Escalador(5, "Ciclista B2", 3.0, 6.0));
        equipos[1].añadirCiclista(new Velocista(6, "Ciclista B3", 300, 38.0));

        equipos[2] = new Equipo("Equipo C", "País C");
        equipos[2].añadirCiclista(new Contrarrelojista(7, "Ciclista C1", 32.0));
        equipos[2].añadirCiclista(new Escalador(8, "Ciclista C2", 2.8, 5.5));
        equipos[2].añadirCiclista(new Velocista(9, "Ciclista C3", 280, 42.0));

        equipos[3] = new Equipo("Equipo D", "País D");
        equipos[3].añadirCiclista(new Contrarrelojista(10, "Ciclista D1", 27.0));
        equipos[3].añadirCiclista(new Escalador(11, "Ciclista D2", 3.2, 6.5));
        equipos[3].añadirCiclista(new Velocista(12, "Ciclista D3", 270, 39.0));

        // Simulación de las 4 etapas
        for (int etapa = 1; etapa <= 4; etapa++) {
            System.out.println("Etapa " + etapa);

            // Calcular tiempo parcial de cada ciclista en cada equipo
            for (Equipo equipo : equipos) {
                equipo.calcularTiempoParcialEquipo();
            }

            // Clasificación por equipos
            System.out.println("\nClasificación por Equipos:");
            for (Equipo equipo : equipos) {
                equipo.calcularTotalTiempo();
                equipo.imprimir();
            }

            // Clasificación individual
            System.out.println("\nClasificación Individual:");
            for (Equipo equipo : equipos) {
                for (Ciclista ciclista : equipo.listaCiclistas) {
                    ciclista.imprimir();
                }
            }
        }
    }
}